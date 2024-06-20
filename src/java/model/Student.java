package model;

import org.apache.juli.logging.LogConfigurationException;

public class Student {

    String rollNo;
    String name;
    float mark;

    public Student() {
    }

    public Student(String rollNo, String name, float mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

}
