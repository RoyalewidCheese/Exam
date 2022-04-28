class Student{
 static int count=0;
 int id;
 String name;
Student()
{
 id=111;
 name="Rathul";
 
Student.count++;
}

public static void main(String args[])
{
Student s1= new Student();
s1.id=111;
s1.name="Rathul";
 System.out.println(s1.id+" "+s1.name);
 System.out.println("Total number of objects="+count);
 }
 } 
 

