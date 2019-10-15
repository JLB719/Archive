package com.ianskenny.javaintro.part5;

public abstract class Patient {

    private String name;
    private String surgeon;
    private float bloodPressure;

    public Patient(String name, String id, String surgeon) {
        this.name = name;
        this.surgeon = surgeon;
    }
    
    public abstract boolean administerPainkillerDose(float dosage);

    public void alertDoctor() {
        System.out.println("Please alert: " + getSurgeon());
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurgeon() {
        return surgeon;
    }
    public void setSurgeon(String surgeon) {
        this.surgeon = surgeon;
    }
    public float getBloodPressure() {
        return bloodPressure;
    }
    public void setBloodPressure(float bloodpressure) {
        this.bloodPressure = bloodpressure;
    }

    @Override
    public String toString() {
        return "Patient [name=" + name + ", surgeon=" + surgeon + ", bloodPressure=" + bloodPressure + "]";
    }
}
