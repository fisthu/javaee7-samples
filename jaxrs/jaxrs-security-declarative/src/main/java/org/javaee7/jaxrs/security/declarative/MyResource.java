package org.javaee7.jaxrs.security.declarative;

import static javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * @author Arun Gupta
 */
@Path("myresource")
@RequestScoped
public class MyResource {

    @GET
    public String get() {
        return "get";
    }

    @GET
    @Path("{id}")
    public String getPerson(@PathParam("id") int id) {
        return "get" + id;
    }

    @POST
    @Consumes(APPLICATION_FORM_URLENCODED)
    public String addToList(@FormParam("name") String name) {
        return "post " + name;
    }

    @PUT
    public void putToList() {
        System.out.println("put invoked");
    }

    @DELETE
    public void delete() {
        System.out.println("delete invoked");
    }
}
