package ss17_io_binary_file_serialization.exercise.exercise1.comtroller;

import ss17_io_binary_file_serialization.exercise.exercise1.service.IProductService;
import ss17_io_binary_file_serialization.exercise.exercise1.service.ProductService;

import java.util.Scanner;

public class ProductController {
    private static IProductService iProductService = (IProductService) new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuProduct() {
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("- Quản Lý Sản Phẩm -");
            System.out.println("Nhập vào đây: ");
            System.out.println("1. Thêm sản phẩm.");
            System.out.println("2. Hiển thị sản phẩm.");
            System.out.println("3. Tìm kiếm thông tin sản phẩm");
            System.out.println("4. Thoát.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.addProduct();
                    break;
                case 2:
                    iProductService.displayProduct();
                    break;
                case 3:
                    iProductService.findProduct();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Bạn nhập sai! Vui lòng nhập lại ..");
                    return;
            }
        }
    }
}
