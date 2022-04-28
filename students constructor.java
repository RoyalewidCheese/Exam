//Rathul krishnan R
//S3 CSE
//Roll NO: 46


import java.io.*;
public class student
{
 public static void main(String args[])
 {
 teststudent[] obj=new teststudent[10];
 
   obj[0]=new teststudent(10,"rathul");
   obj[1]=new teststudent(12,"arun");
   obj[2]=new teststudent(14,"jithu");
   obj[3]=new teststudent(16,"gokul");
   obj[4]=new teststudent(18,"aswanth");
   obj[5]=new teststudent(20,"tony");
   obj[6]=new teststudent(22,"sarath");
   obj[7]=new teststudent(24,"athul");
   obj[8]=new teststudent(26,"hashim");
   obj[9]=new teststudent(28,"romy");
   
   System.out.println("student 1:");
   obj[0].display();
   System.out.println("student 2:");
   obj[1].display();
   System.out.println("student 3:");
   obj[2].display();
   System.out.println("student 4:");
   obj[3].display();
   System.out.println("student 5:");
   obj[4].display();
   System.out.println("student 6:");
   obj[5].display();
   System.out.println("student 7:");
   obj[6].display();
   System.out.println("student 8:");
   obj[7].display();
     }
   }
   
   class teststudent
   {
    int age;
    String name;
    //product class constructor
    teststudent(int pid,String n)
    {
     age= pid;
     name= n;
     }
     public void display()
     {
      System.out.print("age= "+age+""+ "Name="+name);
      System.out.println();
      }
      }
