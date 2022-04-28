//Rathul Krishnan R 
//S3 CSE
//46

import java.lang.*;
import java.util.Scanner;

class Calculation {
  
  void sum(int a , int b) {
    System.out.println("The sum of "+ a+ " and "+ b + " is "+ (a+b));
  } 
  
  void sum(int a , int b,int c) {
    System.out.println("The sum of "+ a+ ","+ b + " and " +c+ " is "+ (a+b+c));
  } 

  void sum(float a , float b) {
    System.out.println("The sum of "+ a+ " and "+ b + " is "+ (a+b));
  } 

  void sum(float a , float b, float c) {
    System.out.println("The sum of "+ a+ ","+ b + " and " +c+ " is "+ (a+b+c));
  } 
}

class Testoverloading {
   
  public static void main(String[] args) {
    
    int a,b,c;
    float x,y,z;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 3 integer numbers : ");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    System.out.println("Enter 3 floating point numbers : ");
    x = sc.nextFloat();
    y = sc.nextFloat();
    z = sc.nextFloat();
    
    sc.close();

    Calculation s = new Calculation();
    s.sum(a,b,c);
    s.sum(a,b);
    s.sum(x,y);
    s.sum(x,y,z);

  }  
}
