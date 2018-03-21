package com.uonagent.MyStack;

public class MyArrayStack<E> implements MyStack<E> {

  private static int DEFAULT_CAPACITY = 10;

  private static int MAX_ARRAY_CAPACITY = Integer.MAX_VALUE - 8;

  private Object[] array;
  private int size;

  /**
   * This constructor creates new MyArrayStack Object
   * based on array with capacity = DEFAULT_CAPACITY
   */
  public MyArrayStack() {
    array = new Object[DEFAULT_CAPACITY];
  }

  /**
   * Pops element from stack
   *
   * @return first element from stack
   */
  @Override
  @SuppressWarnings("unchecked")
  public E pop() {
    E r = (E) array[size - 1];
    array[--size] = null;
    return r;
  }

  /**
   * Pushes element to stack
   *
   * @param e being pushed to stack
   */
  @Override
  public void push(E e) {
    ensureCapacity(size + 1);
    array[size++] = e;
  }

  private void ensureCapacity(int capacity) {
    if (capacity > array.length) {
      if (capacity <= MAX_ARRAY_CAPACITY) {
        int biggerCapacity = (int) Math.min((long) MAX_ARRAY_CAPACITY, array.length * 3 / 2 + 1);
        Object[] biggerArray = new Object[biggerCapacity];
        System.arraycopy(array, 0, biggerArray, 0, size);
        array = biggerArray;
      } else {
        throw new OutOfMemoryError();
      }
    }
  }

  /**
   * Peek first element from stack without deleting it
   *
   * @return first element from stack
   */
  @Override
  @SuppressWarnings("unchecked")
  public E peek() {
    return (E) array[size - 1];
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
