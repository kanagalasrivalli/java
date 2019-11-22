package com.hcl.day4;
/**
 * program for printing details of students using constructors..
 * @author BLTuser
 *
 */

public class Student {
  int sno;
  String firstname;
  String lastname;
  double cgp;
  
  @Override
  public String toString() {
    return "\nStudent [sno=" + sno + ", Firstname=" + firstname
              + ", Lastname=" + lastname + ", cgp=" + cgp + "]";
  }
  
  @Override
  public boolean equals(Object obj) {
    // TODO Auto-generated method stub
    Student stud=(Student)obj;
    if(stud.cgp==cgp){
      return true;
    }else{
			return false;
		}

	}

}
