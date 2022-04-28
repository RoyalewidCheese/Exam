/*
Rathul krishnan R
roll no : 46
IDK20CS048
*/
import java.util.Scanner;
public class Smallest{
	
	public static void main(String[] args){
		Scanner inp=new Scanner(System.in);
		System.out.print("How many numbers? ");
		int num=inp.nextInt();
		int i=0,smallest=0,now;
		while(i<num){
		 System.out.print("Enter "+(i+1)+"th number : ");
		  now=inp.nextInt();
		  if(i==0) smallest=now;
		  else if(smallest>now) smallest =now;
		  i++;
			}
		System.out.println("Smallesr is "+smallest);	
		}
	
	
}

