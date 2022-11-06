package Service;

import Model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void add(Product product);

    void remove(int id);

    Product findById(int id);

    Product edit(int id, Product product);

    void edit(int id);
}
