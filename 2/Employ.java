package com.hcl.day4;
/**
 * program for employ details..
 * @author BLTuser
 *
 */

public class Employ {
  int empno;
  String name;
  double basic;
  
  @Override
  public String toString() {
    return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
  }
  
  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    Employ emply = (Employ)obj;
    if (emply.basic == basic) {
      return true;
    } else {
      return false;
    }
  }
}
