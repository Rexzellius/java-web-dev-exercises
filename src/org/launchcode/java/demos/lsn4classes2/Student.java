package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        if (this.numberOfCredits == 0) {
            return ("Wow. You suck.");
        }
        else if (this.numberOfCredits <= 29) {
            return (this.name + " has " + this.numberOfCredits + " credits and qualifies as a Freshman.");
        }
        else if (this.numberOfCredits <= 59) {
            return (this.name + " has " + this.numberOfCredits + " credits and qualifies as a Sophomore.");
        }
        else if (this.numberOfCredits <= 89) {
            return (this.name + " has " + this.numberOfCredits + " credits and qualifies as a Junior.");
        }
        else {
            return (this.name + " has " + this.numberOfCredits + " credits and qualifies as a Senior.");
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        this.numberOfCredits += courseCredits;
        //this seems wrong but dut doing it anyway
//        this.gpa = ((gpa * numberOfCredits) + grade) / numberOfCredits;
        double courseQualityScore = courseCredits * grade;
        double courseOverallQualityScore = this.numberOfCredits * this.getGpa();
        this.gpa = (courseQualityScore + courseOverallQualityScore) / this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    @Override
    public String toString() {
        return this.name + ", ID: " + this.studentId + ", has " + this.numberOfCredits + " credit(s) and a " + this.gpa + " GPA.";
    }
    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    @Override
    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }
        if (toBeCompared == null) {
            return false;
        }
        if(this.getClass() != toBeCompared.getClass()) {
            return false;
        }
        Student student2 = (Student) toBeCompared;
        return this.gpa == student2.gpa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
        System.out.println(sally.getGradeLevel());
    }

}
