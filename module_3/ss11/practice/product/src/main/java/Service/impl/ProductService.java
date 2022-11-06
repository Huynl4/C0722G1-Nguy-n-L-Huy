package Service.impl;

import Model.Product;
import Reponsitory.IProductRepository;
import Reponsitory.impl.ProductRepository;
import Service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
   private IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> display() {
        return productRepository.display();
    }

    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void removeById(int id) {
        productRepository.removeById(id);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public Product findByName(String name) {
        return productRepository.findByName(name);
    }

}
