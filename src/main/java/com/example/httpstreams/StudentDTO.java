package com.example.httpstreams;

public class StudentDTO {

    int rollNumber;
    String name;

    public StudentDTO(String s, int i) {

        this.name = s;
        this.rollNumber = i;

    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }
}
