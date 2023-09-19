package manager;

import model.Student;

import java.util.ArrayList;

public interface IManager<E> {
    void add(E e);
    void remove(int id);
    void update(int id, E e);
    Student StudentById(int id);
    ArrayList<E> findAll();
    ArrayList<Student> getName(String name);

}

