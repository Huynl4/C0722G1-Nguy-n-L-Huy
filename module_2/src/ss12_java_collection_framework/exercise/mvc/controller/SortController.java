package ss12_java_collection_framework.exercise.mvc.controller;

public class SortController extends ProductController {
    public static void menuSort() {
        while (true) {
            System.out.println("Bạn muốn sắp xếp như thế nào....");
            System.out.println("1. Tăng dần.");
            System.out.println("2. Giảm dần.");
            System.out.println("3. Quay về Menu chính.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iProductService.sortProductIncrease();
                    break;
                case 2:
                    iProductService.sortProductDecrease();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}
