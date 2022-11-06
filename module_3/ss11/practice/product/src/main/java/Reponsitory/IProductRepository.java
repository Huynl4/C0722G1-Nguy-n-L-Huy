package Reponsitory;

import Model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> display();
    void add(Product product);
    void removeById(int id);
    Product findById(int id);
    Product findByName(String name);
}
