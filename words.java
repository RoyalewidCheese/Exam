import java.util.Scanner;
class words
{
   public static void main(String args[])
   {
   System.out.print("Enter the sentence : ");
   Scanner str = new Scanner(System.in);
   String a= str.nextLine();
   int count=1;
   
   for(int i =0;i<a.length()-1;i++)
   {
    if((a.charAt(i) == ' ') &&
    (a.charAt(i+1)!=' '))
    {
     count++;
    }
    }
    System.out.print("Number of words in string :"+ count);
    }
    }
