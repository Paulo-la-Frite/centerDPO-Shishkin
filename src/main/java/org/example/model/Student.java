package org.example.model;

import java.time.LocalDate;

public class Student extends Person {
    private int groupId;
    private int courseNumber;
    private int enrollmentYear;
    private String status;
    
    public Student(int id, String lastName, String firstName, String patronymic,
                   String phone, String email, int groupId, int courseNumber, 
                   int enrollmentYear, String status) {
        super(id, lastName, firstName, patronymic, phone, email);
        this.groupId = groupId;
        this.courseNumber = courseNumber;
        this.enrollmentYear = enrollmentYear;
        this.status = status;
    }
    
    // Геттеры и сеттеры
    public int getGroupId() { return groupId; }
    public void setGroupId(int groupId) { this.groupId = groupId; }
    
    public int getCourseNumber() { return courseNumber; }
    public void setCourseNumber(int courseNumber) { this.courseNumber = courseNumber; }
    
    public int getEnrollmentYear() { return enrollmentYear; }
    public void setEnrollmentYear(int enrollmentYear) { this.enrollmentYear = enrollmentYear; }
    
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
    @Override
    public String toString() {
        return super.toString() + " (Студент, " + courseNumber + " курс)";
    }
}