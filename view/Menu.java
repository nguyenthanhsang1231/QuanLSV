package view;

import manager.StudentManager;
import model.Student;

import java.util.Scanner;

public class Menu {
    Scanner inputInt = new Scanner(System.in);
    Scanner inputString = new Scanner(System.in);

    StudentManager studentManager = new StudentManager();
    int btn = 0;

    public void showMenuStudent() {
        do {
            System.out.println("==================");
            System.out.println("1, them sinh vien \n" +
                    "2, xoa sinh vien \n" +
                    "3, sua sinh vien \n" +
                    "4, tim kiem sinh vien \n" +
                    "5, hien thi tat ca siinh vien \n" +
                    "6, xoa sinh vien \n" +
                    "7, hien thi danh sach theo ten gan dung \n" +
                    "0, out khoi chuong trinh");
            btn = inputInt.nextInt();
            switch (btn){
                case 1:
                    add();
                    break;
                case 3:
                    upDate();
                    break;
                case 4:
                    getStudentById();
                    break;
                case 5:
                    showAll();
                    break;
                case 6:
                    remove();
                    break;
                case 7:
                    getNameStudent();
                    break;
            }
        } while (btn != 0);
    }
    public void add() {
        System.out.println("nhap ten ");
        String name = inputString.nextLine();
        System.out.println("Giới tính");
        String sex = inputString.nextLine();
        System.out.println("Nhập điểm Toán");
        double toan = inputInt.nextDouble();
        System.out.println("Nhập điểm Văn");
        double van = inputInt.nextDouble();
        System.out.println("Nhập điểm Anh");
        double anh = inputInt.nextDouble();
        double[] score = {toan, van, anh};

        Student student = new Student(name, sex, score);
        studentManager.add(student);
        System.out.println("nhap thanh cong");

    }
    public void showAll() {
        System.out.println(studentManager.findAll());
    }
    public void remove() {
        System.out.println("nhap id muon xoa");
        int inputDelete = inputInt.nextInt();
        studentManager.remove(inputDelete);
        System.out.println("xoa thanh cong");
    }
    public void upDate() {
        System.out.println("Nhập id muốn sửa");
        int id = inputInt.nextInt();
        System.out.println("Nhập tên");
        String name = inputString.nextLine();
        System.out.println("Giới tính");
        String sex = inputString.nextLine();
        System.out.println("Nhập điểm Toán");
        double toan = inputInt.nextDouble();
        System.out.println("Nhập điểm Văn");
        double van = inputInt.nextDouble();
        System.out.println("Nhập điểm Anh");
        double anh = inputInt.nextDouble();
        double[] score = {toan, van, anh};
        Student student1 = new Student(id, name, sex, score);
        studentManager.update(id, student1);
        System.out.println("sua thanh cong");
    }
public void getStudentById() {
    System.out.println("nhap id muon tim");
    int id = inputInt.nextInt();
    System.out.println(studentManager.StudentById(id));
    }
    public void getNameStudent() {
        System.out.println("nhap ten ban muon");
        String name = inputInt.nextLine();
        System.out.println(studentManager.getName(name));
    }
    public void delete(int id) {

    }
}
