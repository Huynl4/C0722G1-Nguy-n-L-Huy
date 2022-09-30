package ss17_io_binary_file_serialization.exercise.exercise1.service;

import ss17_io_binary_file_serialization.exercise.exercise1.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> productList = new ArrayList<>();


    public Product infoProduct() {
        System.out.println("Nhập mã sản phẩm; ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm; ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String source = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(code, name, source, price);
        return product;
    }

    @Override
    public void addProduct() {
        productList = readDataFromFile();
        Product product = this.infoProduct();
        productList.add(product);
        System.out.println("Thêm mới thành công..");
        writeToFile(productList);
    }

    @Override
    public void displayProduct() {
        productList = readDataFromFile();
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    @Override
    public void findProduct() {
        productList = readDataFromFile();
        System.out.println("Nhập id sản phẩm cần tìm kiếm: ");
        Scanner scanner = new Scanner(System.in);
        int string = Integer.parseInt(scanner.nextLine());
        for (Product product : productList) {
            if (product.getCode() == string) {
                System.out.println(product);
            }
        }
    }

    public static void writeToFile(List<Product> productList) {
        try {
            FileOutputStream fos = new FileOutputStream("src\\ss17_io_binary_file_serialization\\exercise\\exercise1\\data\\file.csv");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

    public static List<Product> readDataFromFile() {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("src\\ss17_io_binary_file_serialization\\exercise\\exercise1\\data\\file.csv");
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            productList = new ArrayList<>();
        }
        return productList;
    }
}
