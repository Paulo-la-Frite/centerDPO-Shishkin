package org.example.model;

public class Program {
    private int programId;
    private String programName;
    private int durationMonths;
    private String description;
    
    public Program(int programId, String programName, int durationMonths, String description) {
        this.programId = programId;
        this.programName = programName;
        this.durationMonths = durationMonths;
        this.description = description;
    }
    
    // Геттеры и сеттеры
    public int getProgramId() { return programId; }
    public void setProgramId(int programId) { this.programId = programId; }
    
    public String getProgramName() { return programName; }
    public void setProgramName(String programName) { this.programName = programName; }
    
    public int getDurationMonths() { return durationMonths; }
    public void setDurationMonths(int durationMonths) { this.durationMonths = durationMonths; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    @Override
    public String toString() {
        return programName + " (" + durationMonths + " мес.)";
    }
}