package com.uonagent.MyStack;

interface MyStack<E> {
  /**
   * Pops element from stack
   *
   * @return first element from stack
   */
  E pop();

  /**
   * Pushes element to stack
   *
   * @param e being pushed to stack
   */
  void push(E e);

  /**
   * Peek first element from stack without deleting it
   *
   * @return first element from stack
   */
  E peek();

  /**
   * Returns size of stack
   *
   * @return size of stack
   */
  int size();

  /**
   * Returns <tt>true</tt> if stack is empty
   *
   * @return <tt>true</tt> if stack is empty
   */
  boolean isEmpty();
}
