package ss16_io_text_file.exercise.exercise3.mvc.model;

public class Person {
    private String code;
    private  String name;
    private String gender;

    public Person() {
    }

    public Person(String code, String name, String gender) {
        this.code = code;
        this.name = name;
        this.gender = gender;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
