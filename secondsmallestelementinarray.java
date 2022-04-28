/*Rathul Krishnan R
 Roll no 46
s3 cse
*/

import java.lang.*;
public class secondsmallestelementinarray
{
 public static void main(String args[])
 {
int temp,size;
int arr[]={12,13,1,10,34,1};
size=arr.length;
for(int i=0;i<size;i++)
{
 for(int j=i+1;j<size;j++)
 {
   if (arr[i]>arr[j])
    {
     temp=arr[i];
     arr[i]=arr[j];
     arr[j]=temp;  
    }
 }
}
  for(int i=0;i<size;i++)
{
 if(arr[i] != arr[i+1])
{
 System.out.println("\nSecond smallest number: "+arr[i+1]);
 break;
} 
}
System.out.println("The second smallest number in array is"+arr[0]);
}
} 
