package com.pe.relari.repository;

import com.pe.relari.model.Product;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ProductRepository {

    @Inject
    private EntityManager entityManager;

    @Transactional
    public void createProduct(Product entity) {
        entityManager.persist(entity);
    }

    @Transactional
    public void deleteProduct(Product entity) {
        entityManager.remove(entity);
    }

    @Transactional
    public List<Product> getAllProducts() {
        List<Product> productEntities = entityManager.createQuery("select p from Product p").getResultList();
        return productEntities;
    }
}
