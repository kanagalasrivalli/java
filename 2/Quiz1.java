package com.hcl.day4;
/**
 * program for diff between == and equals..
 * @author BLTuser
 *
 */

public class Quiz1 {
  /**
   * main class..
   * @param args declared..
   */

  public static void main(String[] args) {
    Employ e1 = new Employ();
    Employ e2 = new Employ();
    System.out.println(e1 == e2);
    e1.empno = 1;
    e1.name = "Tejasree";
    e1.basic = 2809;
    e2.empno = 2;
    e2.name = "Thejasree";
    e2.basic = 2809;
    System.out.println(e1.equals(e2));
  }
}
