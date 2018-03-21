package com.uonagent.MyStack;

public class MyListStack<E> implements MyStack<E> {

  private Node<E> head;

  private int size;

  private static class Node<E> {
    E e;
    Node<E> next;

    Node(E e, Node<E> next) {
      this.e = e;
      this.next = next;
    }
  }

  /**
   * Pops element from stack
   *
   * @return first element from stack
   */
  @Override
  public E pop() {
    E r = head.e;
    head = head.next;
    return r;
  }

  /**
   * Pushes element to stack
   *
   * @param e being pushed to stack
   */
  @Override
  public void push(E e) {
    if (head != null) {
      Node<E> oldHead = head;
      head = new Node<>(e, oldHead);
    } else {
      head = new Node<E>(e, null);
    }
    size++;
  }

  /**
   * Peek first element from stack without deleting it
   *
   * @return first element from stack
   */
  @Override
  public E peek() {
    return head.e;
  }

  /**
   * Returns size of stack
   *
   * @return size of stack
   */
  @Override
  public int size() {
    return size;
  }

  /**
   * Returns <tt>true</tt> if stack is empty
   *
   * @return <tt>true</tt> if stack is empty
   */
  @Override
  public boolean isEmpty() {
    return size == 0;
  }
}
