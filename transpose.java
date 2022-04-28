/*Rathul Krishnan R
 Roll no 46
s3 cse
*/

import java.lang.*;
import java.util.Scanner;

public class matricTranpose{
 public static void main(String []args){
   Scanner myscan = new Scanner(System.in);
   int r,c,arr[][] = new int[10][10],tra[][] = new int[10][10];
   System.out.println("Enter no of rows: ");
   r = myscan.nextInt();
   System.out.println("Enter no of coloumns: ");
   c = myscan.nextInt();
   System.out.println("Enter Matrix: ");
   for(int i = 0;i<r;i++){
    for(int j =0;j<c;j++){
     arr[i][j] = myscan.nextInt();
     }
    }
System.out.println("Matrix: ");
 for(int i = 0;i<r;i++){
    for(int j =0;j<c;j++){
     System.out.print("\t"+arr[i][j]);
     }
System.out.println("\n");
    }
for(int i = 0;i<r;i++){
   for(int j =0;j<c;j++){
     tra[j][i] = arr[i][j];
     }
    }
System.out.println("Matrix Transpose: ");
 for(int i = 0;i<r;i++){
    for(int j =0;j<c;j++){
     System.out.print("\t"+tra[i][j]);
     }
System.out.println("\n");
    }

 } 
}
