package com.kodecta.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {
    private static final Logger LOG = LoggerFactory.getLogger(Utils.class);

    public static JSONObject getJson(String filename) {
        JSONParser jsonParser = new JSONParser();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filename), "UTF-8"))
        {
            Object obj = jsonParser.parse(inputStreamReader);
            return (JSONObject) obj;
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }
        return null;
    }

    public static void writeFile(JSONObject sampleObject,  String filename) throws IOException {
        Files.write(Paths.get(filename), sampleObject.toJSONString().getBytes());
    }

    public static void deleteFile(JSONObject someObject, String filename) throws IOException{
        Files.delete(Paths.get(filename));
    }
}
