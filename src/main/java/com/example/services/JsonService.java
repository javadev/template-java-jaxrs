package com.example.services;

import java.util.LinkedHashMap;
import java.util.Map;

import com.github.underscore.lodash.U;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jsontoxml")
@Produces(MediaType.APPLICATION_JSON)
public class JsonService {

    @POST
    public Map<String, Object> post(Map<String, Object> data) {
        Map<String, Object> result = new LinkedHashMap<>();
        try {
            result.put("xml", U.jsonToXml(String.valueOf(data.get("json"))));
        } catch(Exception ex) {
            result.put("xml", null);
            result.put("error", ex.getMessage());
        }
        return result;
    }
}

