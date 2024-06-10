/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_Based_Stack;

/**
 *
 * @author DO KHANH TOAN
 */
public class Stack {
  private int[] data;
  private int top;

  public Stack(int capacity) {
    data = new int[capacity];
    top = -1;
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == data.length - 1;
  }

  public void push(int element) {
    if (isFull()) {
      throw new RuntimeException("Stack overflow!");
    }
    data[++top] = element;
  }

  public int pop() {
    if (isEmpty()) {
      throw new RuntimeException("Stack underflow!");
    }
    return data[top--];
  }

  public int peek() {
    if (isEmpty()) {
      throw new RuntimeException("Stack is empty!");
    }
    return data[top];
  }

  public static void main(String[] args) {
    Stack stack = new Stack(5); // Create a stack with capacity 5

    stack.push(10);
    stack.push(20);
    stack.push(30);

    System.out.println(stack.peek()); // Output: 30 (top element)

    int popped = stack.pop();
    System.out.println(popped); // Output: 30 (popped element)

    System.out.println(stack.isEmpty()); // Output: false (stack is not empty)
  }
}

