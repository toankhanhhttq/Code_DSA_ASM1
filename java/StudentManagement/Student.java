/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentManagement;

/**
 *
 * @author DO KHANH TOAN
 */
public final class Student {
    // Student.java

    int id;
    String name;
    double marks;
    String ranking;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.ranking = getRanking(marks);
    }

    String getRanking(double marks) {
        if (marks < 5.0) {
            return "Fail";
        } else if (marks < 6.5) {
            return "Medium";
        } else if (marks < 7.5) {
            return "Good";
        } else if (marks < 9.0) {
            return "Very Good";
        } else {
            return "Excellent";
        }
    }
}
