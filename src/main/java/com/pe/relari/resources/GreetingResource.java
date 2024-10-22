package com.pe.relari.resources;

import io.smallrye.mutiny.Uni;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.ConfigProvider;
import org.jboss.logging.Logger;

@Path("/greeting")
public class GreetingResource {

    private static final Logger logger = Logger.getLogger(GreetingResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Uni<String> hello() {

        String data = ConfigProvider.getConfig().getValue("quarkus.application.name", String.class);
        logger.infof("Greeting Message = %s", data);

        return Uni.createFrom().item("Hello from RESTEasy Reactive");
    }
}