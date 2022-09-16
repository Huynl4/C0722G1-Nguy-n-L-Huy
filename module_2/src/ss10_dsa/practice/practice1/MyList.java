package ss10_dsa.practice.practice1;

import java.util.Arrays;
//tạo lớp MyList
public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    //phương thức khởi tạo không tham số
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //cài đặt phương thức ensureCape
    private void ensureCape() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //cài đặt phương thức add
    public void add(E e) {
        if (size == elements.length) {
            ensureCape();
        }
        elements[size++] = e;
    }

    //cài đặt phương thức get.
    // Trả về phần tử vừa ở vị trí thứ i trong danh sách
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", size " + i);
        }
        return (E) elements[i];
    }
}
