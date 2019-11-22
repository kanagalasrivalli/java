package com.hcl.day4;
/**
 * program for displaying using constructors.. 
 * @author BLTuser
 *
 */

public class Employy {
  int empno;
  String name;
  double basic;
  /**
   * main class..
   */
  
  public Employy() {
    empno = 5;
    name = "Ram";
    basic = 88523;
  }
  /**
   * constructor..
   * @param empno declared..
   * @param name declared..
   * @param basic declared..
   */
  
  public Employy(int empno, String name, double basic) {
    super();
    this.empno = empno;
    this.name = name;
    this.basic = basic;
  }
  
  @Override
  public String toString() {
    return "Employy [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
}
