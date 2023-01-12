package models;

public class Students {
    public Students(String name, int grade, int age) {
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int grade;
    int age;

}
