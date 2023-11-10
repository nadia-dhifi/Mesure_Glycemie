package model;

public class Patient {
    private String name;
    private double glucoseLevel;

    public Patient(String name, double glucoseLevel) {
        this.name = name;
        this.glucoseLevel = glucoseLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGlucoseLevel() {
        return glucoseLevel;
    }

    public void setGlucoseLevel(double glucoseLevel) {
        this.glucoseLevel = glucoseLevel;
    }

    public String calculateBloodGlucoseLevel() {
        if (glucoseLevel < 70) {
            return "Hypo glycemia";
        } else if (glucoseLevel >= 70 && glucoseLevel <= 180) {
            return "Normal glycemia";
        } else {
            return "Hyper glycemia";
        }
    }
}