package com.hcl.day4;
/**
 * program for boxing in & out..
 * @author BLTuser
 *
 */

public class BoxingDemo {
  /**
   * main class..
   */
  public void show() {
    int x = 12;
    double y = 12.5;
    String name = "Hcl";
    /* Boxing */
    Object obj1 = x;
    Object obj2 = y;
    Object obj3 = name;
    /*Unboxing*/
    int x1 = (Integer)obj1;
    double y1 = (Double)obj2;
    String s1 = (String)obj3;
    System.out.println(x1);
    System.out.println(y1);
    System.out.println(s1);
  }

  public static void main(String[] args) {
    new BoxingDemo().show();
  }
}
