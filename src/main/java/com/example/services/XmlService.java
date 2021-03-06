package com.example.services;

import java.util.LinkedHashMap;
import java.util.Map;

import com.github.underscore.lodash.U;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/xmltojson")
@Produces(MediaType.APPLICATION_JSON)
public class XmlService {

    @POST
    public Map<String, Object> post(Map<String, Object> data) {
        Map<String, Object> result = new LinkedHashMap<>();
        try {
            result.put("json", U.xmlToJson(String.valueOf(data.get("xml"))));
        } catch(Exception ex) {
            result.put("json", null);
            result.put("error", ex.getMessage());
        }
        return result;
    }
}

