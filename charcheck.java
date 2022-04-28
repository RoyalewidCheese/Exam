import java.util.Scanner;

public class charcheck

{
public static void main(String[] args)
{
Scanner str = new Scanner(System.in);
System.out.println("Enter the string:");
String sr = str.nextLine();
System.out.println("Enter the character to be checked:");
char c = str.nextLine().charAt(0);
int count=0;
for(int i =0;i<sr.length();i++)
{
 if(c==sr.charAt(i))
 {
 count++;
 }
}
System.out.println("frequency of given character :"+count);
}
}
 
 

