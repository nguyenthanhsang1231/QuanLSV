package manager;

import model.Student;

import java.util.ArrayList;

public class StudentManager implements IManager<Student> {
    ArrayList<Student> list;

    public StudentManager() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Student student) {
        this.add(student);
    }

    @Override
    public void remove(int id) {
        this.list.remove(id);
    }

    @Override
    public void update(int id, Student student) {
        this.list.set(id, student);
    }

    @Override
    public Student StudentById(int id) {
        for (Student student: list) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Student> findAll() {
        return this.list;
    }

    @Override
    public ArrayList<Student> getName(String name) {
        ArrayList<Student> students = new ArrayList<>();
        for (Student student: list) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                students.add(student);
            }
        }
        return students;
    }
}
