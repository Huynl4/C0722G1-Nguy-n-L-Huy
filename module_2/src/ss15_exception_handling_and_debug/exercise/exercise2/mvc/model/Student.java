package ss15_exception_handling_and_debug.exercise.exercise2.mvc.model;

public class Student extends Person {
    private String nameClass;
    private double score;

    public Student(String code, String name, String gender, String nameClass, double score) {
        super(code, name, gender);
        this.nameClass = nameClass;
        this.score = score;
    }

    public Student(String nameClass, double score) {
        this.nameClass = nameClass;
        this.score = score;
    }

    public Student() {
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
                "} " + super.toString();
    }
}
