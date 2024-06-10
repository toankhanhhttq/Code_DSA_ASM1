/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Linked_List_Based_Stack;

/**
 *
 * @author DO KHANH TOAN
 */
public class Stack {
  private Node top; // Reference to the topmost node
  // Node class for linked list elements
  private static class Node {
    int data;
    Node next;
  }
  // Constructor (initialization)
  public Stack() {
    top = null; // Set top to null indicating an empty stack
  }
  public boolean isEmpty() {
    return top == null;
  }
  public void push(int element) {
    Node newNode = new Node();
    newNode.data = element;
    newNode.next = top;
    top = newNode;
  }
  public int pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack underflow!");
    }
    int data = top.data;
    top = top.next;
    return data;
  }
  public int peek() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty!");
    }
    return top.data;
  }
  public static void main(String[] args) {
    Stack stack = new Stack();
    int choice;
    do {
      System.out.println("\nMenu:");
      System.out.println("1. Push");
      System.out.println("2. Pop");
      System.out.println("3. Peek");
      System.out.println("4. Check if Empty");
      System.out.println("5. Exit");
      System.out.print("Enter your choice: ");
      choice = new java.util.Scanner(System.in).nextInt();
      switch (choice) {
        case 1 -> {
            System.out.print("Enter element to push: ");
            int element = new java.util.Scanner(System.in).nextInt();
            stack.push(element);
            System.out.println("Element pushed!");
            }
        case 2 -> {
            try {
                int popped = stack.pop();
                System.out.println("Popped element: " + popped);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } }
        case 3 -> {
            try {
                int topElement = stack.peek();
                System.out.println("Top element: " + topElement);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            } }
        case 4 -> System.out.println("Stack is " + (stack.isEmpty() ? "empty" : "not empty"));
        case 5 -> System.out.println("Exiting...");
        default -> System.out.println("Invalid choice!");
      }
    } while (choice != 5);
  }
}

