package xyz.coop.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HelloWorldResource {

    @GET
    public String get() {
        return "Hello World";
    }
}
