package com.uonagent.app;

import com.uonagent.MyStack.MyArrayStack;
import com.uonagent.MyStack.MyListStack;

public class Application {
  public static void main(String... args) {
    MyArrayStack<Integer> arrayStack = new MyArrayStack<>();
    MyListStack<Integer> listStack = new MyListStack<>();

    for (int i = 0; i < 20; ++i) {
      arrayStack.push(i);
      listStack.push(i);
    }
    for (int i = 0; i < 5; ++i) {
      System.out.println(arrayStack.pop());
      System.out.println(listStack.pop());
    }
  }
}
