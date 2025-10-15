package com.example.project;

public class Student {
    private String firstName;
    private String lastName;
    private int graduationYear;
    private double totalTestScores = 0f;
    private double highestTestScore = 0f;
    private int tests = 0;

    public Student(String firstname, String lastname, int gradYear) {
        graduationYear = gradYear;
        firstName = firstname;
        lastName = lastname;
    }

    public void addTestScore(double score) {
        tests++;
        totalTestScores += score;
        if(highestTestScore < score) {highestTestScore = score;}
    }

    public double getHighestTestScore() {
        return highestTestScore;
    }

    public double averageTestScore() {
        return (double)totalTestScores/tests;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setGradYear(int gradYear) {
        graduationYear = gradYear;
    }

    public int getGradYear() {
        return graduationYear;
    }

    public boolean isPassing() {
        return averageTestScore() >= 65;
    }

    public int getTestScoreCount() {
        return tests;
    }

    public void printStudentInfo() {
        System.out.println("Student Full Name: " + getFullName());
        System.out.println("Graduation Year: " + graduationYear);
        System.out.println("Number of tests: " + tests);
        System.out.println("Average Test Score: " + averageTestScore());
        System.out.println("Highest Test Score: " + highestTestScore);
        System.out.println("Is passing: " + isPassing());
    }
}
