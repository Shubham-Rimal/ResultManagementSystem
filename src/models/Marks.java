package models;

public class Marks {
    public Marks(String nameOfStudent, double mathsMarks, double physicsMarks, double chemMarks, double compMarks, double engMarks, double nepMarks) {
        this.nameOfStudent = nameOfStudent;
        this.mathsMarks = mathsMarks;
        this.physicsMarks = physicsMarks;
        this.chemMarks = chemMarks;
        this.compMarks = compMarks;
        this.engMarks = engMarks;
        this.nepMarks = nepMarks;
    }

    String nameOfStudent;

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    double mathsMarks;
    double physicsMarks;
    double chemMarks;
    double compMarks;
    double engMarks;
    double nepMarks;

    public double getPercent() {
        double percent = ((this.mathsMarks+this.chemMarks+this.compMarks+this.nepMarks+this.engMarks+this.physicsMarks)/600)*100;
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    double percent;

    public double getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(double mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public double getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(double physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    public double getChemMarks() {
        return chemMarks;
    }

    public void setChemMarks(double chemMarks) {
        this.chemMarks = chemMarks;
    }

    public double getCompMarks() {
        return compMarks;
    }

    public void setCompMarks(double compMarks) {
        this.compMarks = compMarks;
    }

    public double getEngMarks() {
        return engMarks;
    }

    public void setEngMarks(double engMarks) {
        this.engMarks = engMarks;
    }

    public double getNepMarks() {
        return nepMarks;
    }

    public void setNepMarks(double nepMarks) {
        this.nepMarks = nepMarks;
    }
}
