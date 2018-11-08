package com.example.services;

import java.util.Map;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/xmltojson")
@Produces(MediaType.APPLICATION_JSON)
public class XmlService {

    @POST
    public String post(Map<String, Object> data) {
        return "Hello" + data;
    }

}

