package ss12_java_collection_framework.exercise.mvc.service;

import ss12_java_collection_framework.exercise.mvc.model.Product;

import java.util.Comparator;
import java.util.List;

public class PriceComparatorIncrease implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() == o2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}
