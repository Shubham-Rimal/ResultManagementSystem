import models.Marks;
import models.Students;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Students s1 = new Students("Ram Dayal", 12, 18);
        Students s2 = new Students("Shyam Gopal", 12, 16);
        Students s3 = new Students("Sita Janaki", 11, 16);
        Students s4 = new Students("Puja Shrestha", 12, 17);
        Students s5 = new Students("Kamal Khadka", 11, 17);

        Marks m1 = new Marks(s1.getName(), 69, 60, 78, 90, 88, 76);
        Marks m2 = new Marks(s2.getName(), 90, 83, 87, 88, 93, 89);
        Marks m3 = new Marks(s3.getName(), 78, 56, 79, 67, 80, 78);
        Marks m4 = new Marks(s4.getName(), 88, 67, 77, 80, 71, 72);
        Marks m5 = new Marks(s5.getName(), 51, 45, 56, 79, 66, 41);

        System.out.println(s1.getName() + " of grade " + s1.getGrade() + " got " + m1.getPercent());
        System.out.println(s2.getName() + " of grade " + s2.getGrade() + " got " + m2.getPercent());
        System.out.println(s3.getName() + " of grade " + s3.getGrade() + " got " + m3.getPercent());
        System.out.println(s4.getName() + " of grade " + s4.getGrade() + " got " + m4.getPercent());
        System.out.println(s5.getName() + " of grade " + s5.getGrade() + " got " + m5.getPercent());

        ArrayList<String> gradeTwelve = new ArrayList<>();
        ArrayList<String> gradeEleven = new ArrayList<>();

        System.out.println("\nStudents of Grade 12:");
        gradeTwelve.add(s1.getName());
        gradeTwelve.add(s2.getName());
        gradeTwelve.add(s4.getName());
        for(String singleGradeTwelve: gradeTwelve){
            System.out.println(singleGradeTwelve);
        }

        System.out.println("\nStudents of Grade 11:");
        gradeEleven.add(s3.getName());
        gradeEleven.add(s5.getName());
        for(String singleGradeEleven: gradeEleven){
            System.out.println(singleGradeEleven);
        }

        ArrayList<String> overallGradeA = new ArrayList<>();
        ArrayList<String> overallGradeBPlus = new ArrayList<>();
        ArrayList<String> overallGradeCPlus = new ArrayList<>();

        System.out.println("\nStudents with overall grade A:");
        overallGradeA.add(s2.getName());
        for(String singleOverallGradeA: overallGradeA){
            System.out.println(singleOverallGradeA);
        }

        System.out.println("\nStudents with overall grade B+:");
        overallGradeBPlus.add(s1.getName());
        overallGradeBPlus.add(s3.getName());
        overallGradeBPlus.add(s4.getName());
        for(String singleOverallGradeBPlus: overallGradeBPlus){
            System.out.println(singleOverallGradeBPlus);
        }

        System.out.println("\nStudents with overall grade C+:");
        overallGradeCPlus.add(s5.getName());
        for(String singleOverallGradeCPlus: overallGradeCPlus){
            System.out.println(singleOverallGradeCPlus);
        }
    }
}
