package model;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private String sex;
    private double[] score;
    private static int idEclement = 0;

    public Student(String name, String sex, double[] score) {
        this.id = idEclement;
        this.name = name;
        this.sex = sex;
        this.score = score;
        idEclement++;
    }

    public Student(int id, String name, String sex, double[] score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }

    public static int getIdEclement() {
        return idEclement;
    }

    public static void setIdEclement(int idEclement) {
        Student.idEclement = idEclement;
    }

    @Override
    public String toString() {
        return "Sinh viên có tên là " + name +" | Có giới tính là " + sex + "| có mảng điểm là" + Arrays.toString(score)+"\n";
    }
}
