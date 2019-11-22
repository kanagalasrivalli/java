package com.hcl.day4;
/**
 * program for method overloading with same variable..
 * @author BLTuser
 *
 */

public class Demo1 {
  public void show(int x) {
    System.out.println("show w.r.t Integer.. " + x);
  }
  
  public void show(double x) {
    System.out.println("show w.r.t with double.. " + x);
  }
  
  public void show(String x) {
    System.out.println("show w.r.t with string.. " + x);
  }
  
  public void show(boolean x) {
    System.out.println("show w.r.t Boolean.." + x);
  }
  /**
   * main method..
   * @param args parsed..
   */
  
  public static void main(String[] args) {
    Demo1 obj = new Demo1();
    obj.show(12);
    obj.show(12.343);
    obj.show("tejasree");
    obj.show(true);
  }
}
