package com.haoyanxuan.demo.service;

import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("v1/testService")
@Service
public interface CloudTest {
    @GET
    @Path("/response/{name}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("application/json")
    public void sayHello(@PathParam("name")String name);
}
