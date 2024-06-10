/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentManagement;

import java.util.Scanner;

/**
 *
 * @author DO KHANH TOAN
 */
public class main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        StudentManagementSystem system = new StudentManagementSystem(numStudents);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Sort Students");
            System.out.println("5. Search Student");
            System.out.println("6. Display Students");
            System.out.println("7. Exit");
           System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Add student name: ");
                    String name = scanner.next();
                    System.out.print("Add student marks: ");
                    double marks = scanner.nextDouble();
                    system.addStudent(id, name, marks);
                    break;
                case 2:
                    System.out.print("Enter student ID: ");
                    id = scanner.nextInt();
                    System.out.print("Edit new student name: ");
                    name = scanner.next();
                    System.out.print("Edit new student marks: ");
                    marks = scanner.nextDouble();
                    system.editStudent(id, name, marks);
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    id = scanner.nextInt();
                    system.deleteStudent(id);
                    break;
                case 4:
                    system.sortStudents();
                    system.displayStudents();
                    break;
                case 5:
                    System.out.print("Enter student ID: ");
                    id = scanner.nextInt();
                    system.searchStudent(id);
                    break;
                case 6:
                    system.displayStudents();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
