package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student() {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }
    // Getters
    public String getName() {
        return name;
    }

    public int getID() {
        return studentId;
    }

    public int getCredits() {
        return numberOfCredits;
    }

    public double getGPA() {
        return gpa;
    }
    // Setters
    public void setName(String aName) {
        name = aName;
    }

    public void setStudentId(int aStudentID) {
        studentId = aStudentID;
    }

    public void setNumberOfCredits(int aCredits) {
        numberOfCredits = aCredits;
    }

    public void setGpa (double aGpa) {
        gpa = aGpa;
    }
}