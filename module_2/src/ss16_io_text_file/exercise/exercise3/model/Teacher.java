package ss16_io_text_file.exercise.exercise3.model;

import java.time.LocalDate;

public class Teacher extends Person {
    private String technique;

    public Teacher(String technique) {
        this.technique = technique;
    }

    public Teacher() {
    }

    public Teacher(String code, String name, String gender, LocalDate dateOfBirth, String technique) {
        super(code, name, gender, dateOfBirth);
        this.technique = technique;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "technique='" + technique + '\'' +
                '}' + super.toString();
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s", this.getCode(), this.getName(), this.getGender(), this.getDateOfBirth(), this.getTechnique());
    }
}
