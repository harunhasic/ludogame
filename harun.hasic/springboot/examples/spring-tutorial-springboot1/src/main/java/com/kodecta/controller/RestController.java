package com.kodecta.controller;


import com.kodecta.utils.Utils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;
@EnableScheduling
@org.springframework.web.bind.annotation.RestController
public class RestController {

    private static final Logger LOG = LoggerFactory.getLogger(RestController.class);

    @Autowired
    private Environment environment;

    @GetMapping("/get/{id}")
    Object getFile(@PathVariable("id") Long id){
        File dir = new File(environment.getProperty("mount-folder-req"));

        File[] foundFiles = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith(environment.getProperty("file-prefix-request")+id.toString()+"-");
            }
        });
        for (File file : foundFiles) {
            return Utils.getJson(file.getAbsolutePath());
        }
        return null;
    }

    @PutMapping("/put/{id}")
    Object changeFile(@PathVariable("id") Long id, @RequestBody String requestBody){
        JSONObject response = new JSONObject();

        File dir = new File(environment.getProperty("mount-folder-req"));

        File[] foundFiles = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith(environment.getProperty("file-prefix-request")+id.toString()+"-");
            }
        });

        if(foundFiles.length == 0){
            response.put("message", "File not found");
            return response;
        }

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        try {
            jsonObject = (JSONObject) parser.parse(requestBody);
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }

        for (File file : foundFiles) {
            try {
                Utils.writeFile(jsonObject, file.getAbsolutePath());
                response.put("message", "success");
                break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return response;
    }
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
        builder.append("_");
        builder.append(jsonObject.values());
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
