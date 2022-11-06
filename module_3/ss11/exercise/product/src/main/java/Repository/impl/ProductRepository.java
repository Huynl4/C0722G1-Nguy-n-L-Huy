package Repository.impl;

import Model.Product;
import Repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"Hoodie","China","red","15$"));
        productList.add(new Product(2,"blazer","VN","black","15$"));
        productList.add(new Product(3,"Jean","Thailand","blue","15$"));
        productList.add(new Product(4,"kaki","Laos","green","15$"));
    }
    @Override
    public List<Product> findAll(){
        return productList;
    }
    @Override
    public void add(Product product){
        productList.add(product);
    }
    @Override
    public  void remove(int id){
        for (int i = 0; i < productList.size() ; i++) {
            if (id==productList.get(i).getId()){
                productList.remove(i);
                break;
            }
        }

    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }
}
