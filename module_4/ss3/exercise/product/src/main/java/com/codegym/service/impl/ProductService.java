package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.service.IProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService {
    private static final List<Product> products = new ArrayList<>();

    static {

        products.add(new Product(1, "Dell", "1$", "Tốt", "China"));
        products.add(new Product(2, "ASUS", "2$", "Tốt", "VietNam"));
        products.add(new Product(3, "APPLE", "3$", "Tốt", "USA"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id)
                return product;
        }
        return null;
    }

    @Override
    public void update(int id, Product product) {
        products.add(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> search(String name) {
        List<Product> productList = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().contains(name)) {
                productList.add(product);
            }
        }
        return productList;
    }
}
