package Task1;

import java.util.ArrayList;

public class StudentMang {
    public ArrayList<Student> students = new ArrayList<>();

    public StudentMang() {
        students = new ArrayList<>();
    }

    public void addStudent(int id, String name, String city) {
        Student student = new Student(id, name, city);
        students.add(student);
        System.out.println("Student added successfully:- " + student);
    }

    public void removeStudent(int id) {
        Student toRemove = null;
        for (Student student : students) {
            if (student.getId() == id) {
                toRemove = student;
                break;
            }
        }
        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println("Removing Student:- " + toRemove);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("There are no students.");
        } else {
            System.out.println("List of students:-");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
