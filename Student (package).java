package IDK20CS048;

public class Student {
    String name;
    int rollNumber;

    public Student(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }

    public void Display(){
        System.out.println("name of student is "+name);
        System.out.println("roll of student is "+rollNumber);
    }
    
}
