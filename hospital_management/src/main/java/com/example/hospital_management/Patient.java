package com.example.hospital_management;

public class Patient {
    private int patientId;
    private String name;
    private String disease;
    private int age;

    public Patient(int patientId, String name, Integer age, String disease) {
        this.patientId = patientId;
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
