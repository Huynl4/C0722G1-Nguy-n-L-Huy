package ss16_io_text_file.exercise.exercise3.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student extends Person {
    private String nameClass;
    private double score;

    public Student(String code, String name, String gender, LocalDate dateOfbirth, String nameClass, double score) {
        super(code, name, gender, dateOfbirth);
        this.nameClass = nameClass;
        this.score = score;
    }

    public Student(String nameClass, double score) {
        this.nameClass = nameClass;
        this.score = score;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameClass='" + nameClass + '\'' +
                ", score=" + score +
                '}' + super.toString();
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s", this.getCode(), this.getName(), this.getGender(), this.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), this.getNameClass(), this.getScore());
    }
}
