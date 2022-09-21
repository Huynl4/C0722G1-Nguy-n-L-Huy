package ss12_java_collection_framework.exercise.mvc.service;

import ss12_java_collection_framework.exercise.mvc.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();


    @Override
    public void addProduct() {
        Product product = this.infoProduct();
        productList.add(product);
        System.out.println("Thêm mới thành công.");
    }

    @Override
    public void removeProduct() {
        System.out.println("Nhập id cần xóa: ");
        String id = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                System.out.println("Bạn muốn xóa id áo quần này không ? Nhập Y: yes, N: no ");
                String choice = scanner.nextLine();
                if (choice.equals("Y")) {
                    productList.remove(i);
                    System.out.println("Xóa thành công!");
                }
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy id quần áo cần xóa!");
        }
    }

    @Override
    public void editProduct() {
        System.out.println("Nhập id cần sửa: ");
        String id = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id)) {
                System.out.println("Nhập tên bạn muốn thay đổi");
                String name = scanner.nextLine();
                productList.get(i).setName(name);
                System.out.println("Nhập màu bạn muốn thay đổi");
                String color = scanner.nextLine();
                productList.get(i).setColor(color);
                System.out.println("Nhập giá bạn muốn thay đổi");
                Double price = Double.parseDouble(scanner.nextLine());
                productList.get(i).setPrice(price);
                flagDelete = true;
                break;
            }

        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy sản phẩm cần sửa!");
        }
    }

    @Override
    public void displayProduct() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void findProduct() {
        System.out.println("Nhập tên cần tìm: ");
        String name = scanner.nextLine();
        boolean flagDelete = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                System.out.println(productList.get(i).getName());
                flagDelete = true;
                break;
            }
        }
        if (!flagDelete) {
            System.out.println("Không tìm thấy tên sản phẩm cần tìm!");
        }
    }


    @Override
    public void sortProductIncrease() {
        PriceComparatorIncrease priceComparatorIncrease = new PriceComparatorIncrease();
        productList.sort(priceComparatorIncrease);
        displayProduct();
    }

    @Override
    public void sortProductDecrease() {
        PriceComparatorDecrease priceComparatorDecrease = new PriceComparatorDecrease();
        productList.sort(priceComparatorDecrease);
        displayProduct();
    }

    private Product infoProduct() {
        System.out.println("Nhập id sản phẩm");
        String id = scanner.nextLine();
        System.out.println("Nhập tên sẳn phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập nguồn gốc sản phẩm");
        String source = scanner.nextLine();
        System.out.println("Nhập màu sắc sản phẩm");
        String color = scanner.nextLine();
        Product product = new Product(id, name, price, source, color);
        return product;
    }

}



