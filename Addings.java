/*
Rathul krishnan R
roll no : 46
IDK20CS048
*/
import java.util.Scanner;
public class Add{
	public static void main(String[] args){
		Scanner inp=new Scanner(System.in);
		System.out.print("How many numbers to add? ");
		int num=inp.nextInt();
		int sum=0;
		for(int i=0;i<num;i++){
		System.out.print("Entre "+(i+1)+"th number : ");
		sum+=inp.nextInt();
				}
		System.out.println("Sum is "+sum);		
		
	}
	
}

