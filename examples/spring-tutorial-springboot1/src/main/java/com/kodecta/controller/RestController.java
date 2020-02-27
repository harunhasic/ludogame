package com.kodecta.controller;


import com.kodecta.utils.Utils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private static final Logger LOG = LoggerFactory.getLogger(RestController.class);

    @Autowired
    private Environment environment;

    @PostMapping("/request")
    Object saveRequest(@RequestBody String requestBody) {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        try {
            jsonObject = (JSONObject) parser.parse(requestBody);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return this.writeFile(jsonObject, "request");
    }



    public JSONObject writeFile(JSONObject jsonObject, String operation) {
        long fileExtDATE = (new Date()).getTime();

        StringBuilder builder = new StringBuilder();
        builder.append(environment.getProperty("mount-folder-req"));
        builder.append(environment.getProperty("file-prefix-request"));
        builder.append(operation);
        builder.append("-");
        builder.append(fileExtDATE);
        builder.append(".txt");
        try {
            Utils.writeFile(jsonObject, builder.toString());
            JSONObject response = new JSONObject();
            response.put("success novi", true);
            return response;
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return null;

    }


}
