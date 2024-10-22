package com.pe.relari.resources;

import com.pe.relari.service.EmployeeService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import lombok.AllArgsConstructor;
import com.pe.relari.model.Employee;

import java.util.List;

@AllArgsConstructor
@Path("/v1/employees")
public class EmployeeResource {

    EmployeeService employeeService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(
            @PathParam("id") Integer employeeId) {
        return employeeService.getEmployee(employeeId);
    }

}