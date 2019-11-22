package com.hcl.day4;
/**
 * program for comparing strings..
 * @author BLTuser
 *
 */

public class Quiz2 {
  /**
   * main class..
   * @param args declared..
   */

  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    System.out.println(s1 == s2);
    s1.sno = 2908;
    s1.Firstname = "Tejasree";
    s1.Lastname = "Munagapati";
    s1.cgp = 9.8;

    s2.sno = 2908;
    s2.Firstname = "Tejasree";
    s2.Lastname = "Munagapati";
    s2.cgp = 9.8;
    System.out.println(s1.equals(s2));
  }
}
