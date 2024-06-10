/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentManagement;

/**
 *
 * @author DO KHANH TOAN
 */
  // New function to search student by ID
// StudentManagementSystem.java

public class StudentManagementSystem {
    Student[] students;
    int numStudents;
    public StudentManagementSystem(int numStudents) {
        this.numStudents = numStudents;
        this.students = new Student[numStudents];
    }
    public void addStudent(int id, String name, double marks) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i] == null) {
                students[i] = new Student(id, name, marks);
                return;
            }
        }
        System.out.println("Class is full!");
    }

    public void editStudent(int id, String name, double marks) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i] != null && students[i].id == id) {
                students[i].name = name;
                students[i].marks = marks;
                students[i].ranking = students[i].getRanking(marks);
                return;
            }
        }
        System.out.println("Student not found!");
    }
    public void deleteStudent(int id) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i] != null && students[i].id == id) {
                students[i] = null;
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void sortStudents() {
        for (int i = 0; i < numStudents - 1; i++) {
            for (int j = i + 1; j < numStudents; j++) {
                if (students[i] != null && students[j] != null && students[i].marks < students[j].marks) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public void searchStudent(int id) {
        for (int i = 0; i < numStudents; i++) {
            if (students[i] != null && students[i].id == id) {
                System.out.println("Student ID: " + students[i].id);
                System.out.println("Student Name: " + students[i].name);
                System.out.println("Student Marks: " + students[i].marks);
                System.out.println("Student Ranking: " + students[i].ranking);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void displayStudents() {
        for (int i = 0; i < numStudents; i++) {
            if (students[i] != null) {
                System.out.println("Student ID: " + students[i].id);
                System.out.println("Student Name: " + students[i].name);
                System.out.println("Student Marks: " + students[i].marks);
                System.out.println("Student Ranking: " + students[i].ranking);
                System.out.println();
            }
        }
    }

    
}
