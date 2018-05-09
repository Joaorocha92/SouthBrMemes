/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.southbrmemes.Controller;

import com.google.gson.Gson;
import com.southbrmemes.Model.Entity.Return;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author joao.vrevangelista
 */
@Path("memes")
public class RestMeme {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public RestMeme() {
    }

    /**
     * Retrieves representation of an instance of memes.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("list")
    public String getJson() {
       
        Gson gson = new Gson();
        
        Return retorno = new Return("nao a lista", true);
        
        return gson.toJson(retorno);
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    
    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("hello")
    public String getHello(){
        
        Gson gson = new Gson();
        
        Return retorno = new Return("Hello",true );
        
        return gson.toJson(retorno);
    }
    
    
    
    
    
    
    
}
