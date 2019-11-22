package com.hcl.day4;

public class BoxEmploy {
  /**
   * main class..
   * @param ob are arguments..
   */
  public void show(Object ob) {
    String type = ob.getClass().getSimpleName();
    if (type.equals("Employ")) {
      Employ e = (Employ)ob;
      System.out.println(e);
    }
    if (type.equals("Student")) {
      Student s = (Student)ob;
      System.out.println(s);
    }
  }
  
  /**
   * main method..
   */
  public static void main(String[] args) {
    Employ employ = new Employ();
    employ.empno = 1;
    employ.name = "Tejasree";
    employ.basic = 2908;
    new BoxEmploy().show(employ);
    Student stud = new Student();
    stud.sno = 2908;
    stud.Firstname = "Tejasree";
    stud.Lastname = "Munagapati";
    stud.cgp = 9.8;
    new BoxEmploy().show(stud);
  }

}
