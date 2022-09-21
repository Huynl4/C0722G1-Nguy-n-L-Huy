package ss12_java_collection_framework.exercise.mvc.controller;

import ss12_java_collection_framework.exercise.mvc.service.IProductService;
import ss12_java_collection_framework.exercise.mvc.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static Scanner scanner = new Scanner(System.in);
    public static IProductService iProductService = new ProductService();

    public static void menuProcduct() {
        while (true) {
            System.out.println("Shop Second- hand");
            System.out.println("-------------------------------");
            System.out.println("1. Thêm sản phẩm. ");
            System.out.println("2. Sửa thông tin sản phẩm");
            System.out.println("3. Xoá sản phẩm ");
            System.out.println("4. Hiển thị danh sách sản phẩm.");
            System.out.println("5. Tìm kiếm sản phẩm.");
            System.out.println("6. Sắp xếp sản phẩm.");
            System.out.println("7. Thoát.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.editProduct();
                    break;
                case 3:
                    iProductService.removeProduct();
                    break;
                case 4:
                    iProductService.displayProduct();
                    break;
                case 5:
                    iProductService.findProduct();
                    break;
                case 6:
                    SortController.menuSort();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Nhập sai rồi bạn ơi, lại nào!!!");
            }
        }
    }
}
