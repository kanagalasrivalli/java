package com.hcl.day4;

/**
 * program for displaying employee and student details..
 * @author BLTuser
 *
 */

public class ConEmploy {
  /**
   * main method..
   * @param args argumentws parsed..
   */
  public static void main(String[] args) {
    Employy employ1 = new Employy();
    System.out.println(employ1);
    Employy employ2 = new Employy(3,"Navya",66734);
    System.out.println(employ2);
    Student2 stud1 = new Student2();
    System.out.println(stud1);
    Student2 stud2 = new Student2(27,"Swetha","Pothuluri",9.8);
    System.out.println(stud2);
  }
}
