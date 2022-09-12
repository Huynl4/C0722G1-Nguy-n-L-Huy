package ss5_access_modifier_static.exercise.writeonlyclassesinjava;

public class Student {
    private String name = "Join";
    private String classes = "CO2";

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
