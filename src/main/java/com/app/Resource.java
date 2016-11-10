package com.app;

import javax.ws.rs.*;

@Path("/resource")
public class Resource {

  @GET
  public String getResource() {
    return "resource";
  }
}
