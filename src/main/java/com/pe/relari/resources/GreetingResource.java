package com.pe.relari.resources;

import com.pe.relari.model.Employee;
import com.pe.relari.service.EmployeeService;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;
import org.eclipse.microprofile.config.ConfigProvider;
import org.jboss.logging.Logger;

@AllArgsConstructor
@Path("/api/reactive/v1/employees")
public class GreetingResource {

    private static final Logger logger = Logger.getLogger(GreetingResource.class);

    private EmployeeService employeeService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Multi<Employee> employees() {

        String data = ConfigProvider.getConfig().getValue("quarkus.application.name", String.class);
        logger.infof("Greeting Message = %s", data);

        return Multi.createFrom()
                .items(employeeService.findAll().stream());
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Employee> employee(@PathParam("id") Integer id) {
        return Uni.createFrom()
                .item(employeeService.getEmployee(id));
    }
}