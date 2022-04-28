/*
Rathul Krishnan R 
roll no : 46
IDK20CS048
*/

import java.util.Scanner;
public class prime{
	
	public static void main(String[] args){
	
		System.out.print("Enter the number to check : ");
		Scanner inp=new Scanner(System.in);
		int num=inp.nextInt();
		boolean flag=false;
		for(int i=2;i<num;i++){
			if(num%i==0){flag=true;break;}
		}
		System.out.println(Integer.toString(num)+" is "+(flag?"not ":"")+"a prime number ");
			
	}
	
	
}