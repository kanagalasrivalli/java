package com.hcl.day4;

/**
 * program for getclass..
 * @author BLTuser
 *
 */

public class BoxTest {
  /**
   * main class..
   * @param ob arguments..
   */

  public void show(Object ob) {
    String type = ob.getClass().getSimpleName();
    System.out.println(type);
    if (type.equals("Integer")) {
      System.out.println("Integer casting.....");
      //int x=(Integer)ob;
    }
    if (type.equals("Double")) {
      System.out.println("Double casting.....");
      //Double x=(Double)ob;
    }
    if (type.equals("String")) {
      System.out.println("String casting.....");
      //String x=(String)ob;
    }
  }
  /**
   * main method..
   */
  
  public static void main(String[] args) {

    int a = 12;
    double b = 12.5;
    String name = "HCL";
    BoxTest obj = new BoxTest();
    obj.show(a);
    obj.show(b);
    obj.show(name);
  }
}
