package Reponsitory.impl;

import Model.Product;
import Reponsitory.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList=new ArrayList<>();
    static {
        productList.add(new Product(1,"Jean","China","red","15$"));
        productList.add(new Product(2,"Jean1","China","red","15$"));
        productList.add(new Product(3,"Jean2","China","red","15$"));
        productList.add(new Product(4,"Jean4","China","red","15$"));
    }
    @Override
    public List<Product> display() {
        return productList;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void removeById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (id==productList.get(i).getId()){
                productList.remove(i);
                break;
            }
        }
    }

    @Override
    public Product findById(int id) {
        Product product=null;
        for (int i = 0; i < productList.size(); i++) {
            if (id==productList.get(i).getId()){
                product=productList.get(i);
                break;
            }
        }
        return product;
    }

    @Override
    public Product findByName(String name) {
        Product product=null;
        for (int i = 0; i <productList.size(); i++) {
            if (productList.get(i).getName().equals(name)){
                product=productList.get(i);
            }
        }
        return product;
    }
}
