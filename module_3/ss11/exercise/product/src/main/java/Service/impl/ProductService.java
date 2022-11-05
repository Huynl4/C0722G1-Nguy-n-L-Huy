package Service.impl;

import Model.Product;
import Repository.IProductRepository;
import Repository.impl.ProductRepository;
import Service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository productRepository = (IProductRepository) new ProductRepository();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }
}
