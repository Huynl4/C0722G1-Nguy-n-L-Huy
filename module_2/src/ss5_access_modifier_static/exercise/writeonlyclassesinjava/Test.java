package ss5_access_modifier_static.exercise.writeonlyclassesinjava;

public class Test {
    public static void main(String[] args) {
        Student test = new Student();
        System.out.println(test.getClasses());
        System.out.println(test.getName());
        test.setName("Huynl");
        System.out.println(test.getName());
    }
}
