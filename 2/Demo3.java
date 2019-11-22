package com.hcl.day4;
/**
 * program for overriding with different..
 * @author BLTuser
 *
 */

public class Demo3 {
  public int sum() {
    return 5;
  }
  
  public int sum(int x) {
    return x + 5;
  }
  
  public int sum(int x,int y) {
    return x + y;
  }
  /**
   * main method..
   * @param args arguments parsed..
   */
  
  public static void main(String[] args) {
    Demo3 ob = new Demo3();
    System.out.println(ob.sum());
    System.out.println(ob.sum(7));
    System.out.println(ob.sum(12,5));
  }

}
