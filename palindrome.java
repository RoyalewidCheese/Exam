import java.util.Scanner;

public class palindrome

{
public static void main(String[] args)
{
Scanner read = new Scanner(System.in);
System.out.println("Enter string to reverse:");
String str = read.nextLine();
String reverse = "";

for(int i = str.length()-1;i>=0;i--)
{
reverse = reverse + str.charAt(i);
}
if(str.equals(reverse))
 System.out.println("Entered string is a palindrome");
else 
 System.out.println("Entered string is not a palindrome");
}
}

