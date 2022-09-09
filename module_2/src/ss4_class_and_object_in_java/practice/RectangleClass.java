package ss4_class_and_object_in_java.practice;

import java.util.Scanner;

// Lớp hình chữ nhật
class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width + this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {

        return "Rectange{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
    }
}



