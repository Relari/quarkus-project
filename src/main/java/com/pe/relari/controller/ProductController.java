package com.pe.relari.controller;

import com.pe.relari.model.Product;
import com.pe.relari.repository.ProductRepository;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/api/v1/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductController {

    @Inject
    private ProductRepository productRepository;

    @GET
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @POST
    public Response create(Product product) {
        productRepository.createProduct(product);
        return Response.status(Response.Status.CREATED).build();
    }

    @DELETE
    public Response delete(Product product) {
        productRepository.deleteProduct(product);
        return Response.noContent().build();
    }
}
