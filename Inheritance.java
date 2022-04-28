//Rathul Krishnan R
//S3 CSE
//46

import java.util.Scanner;

class Employee {
  
  String name;
  int age;
  String ph;
  String add;
  float salary;
  
  void printSalary(float salary) {
    System.out.println(salary);

  }
}

class Manager extends Employee {
  
  String specialization, department;
}

class Officer extends Employee {
  
  String specialization, department;
}

class Inheritance {
  
  public static void main(String[] args) {

  Manager mg = new Manager();
  mg.name = "Gokul";
  mg.age = 44;
  mg.ph = "9898989898";
  mg.add = "defg";
  mg.salary = 19000.00f;
  System.out.print("The salary of manager : ");
  mg.printSalary(mg.salary);
  
  Officer off = new Officer();
  off.name = "Romy";
  off.age = 33;
  off.ph = "9292929292";
  off.add = "abcd";
  off.salary = 12000.00f;
  System.out.print("The salary of officer : ");
  off.printSalary(off.salary);

  }

} 

