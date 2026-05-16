package org.example.model;

import java.time.LocalDate;

public class Teacher extends Person {
    private String specialization;
    private int experience;
    private double salary;
    
    public Teacher(int id, String lastName, String firstName, String patronymic,
                   String phone, String email, String specialization, 
                   int experience, double salary) {
        super(id, lastName, firstName, patronymic, phone, email);
        this.specialization = specialization;
        this.experience = experience;
        this.salary = salary;
    }
    
    // Геттеры и сеттеры
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    
    public int getExperience() { return experience; }
    public void setExperience(int experience) { this.experience = experience; }
    
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    
    @Override
    public String toString() {
        return super.toString() + " (Преподаватель, " + specialization + ")";
    }
}