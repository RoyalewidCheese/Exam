import java.util.Scanner;
import java.lang.*;

public class multimatrix{
 public static void main(String [] args){
  Scanner myscan = new Scanner(System.in);
   int r1,c1,r2,c2,mat1[][] = new int[10][10],mat2[][] = new int[10][10],mulmat[][] = new int[10][10];
   System.out.println("Enter no of rows in 1st matrix: ");
   r1 = myscan.nextInt();
   System.out.println("Enter no of coloumns in 1st matrix: ");
   c1 = myscan.nextInt();
   System.out.println("Enter first Matrix: ");
   for(int i = 0;i<r1;i++){
    for(int j =0;j<c1;j++){
     mat1[i][j] = myscan.nextInt();
     }
    }
System.out.println("Enter no of rows in 2nd matrix: ");
   r2 = myscan.nextInt();
   System.out.println("Enter no of coloumns in 2nd matrix: ");
   c2 = myscan.nextInt();
System.out.println("Enter Second Matrix: ");
   for(int i = 0;i<r2;i++){
    for(int j =0;j<c2;j++){
     mat2[i][j] = myscan.nextInt();
     }
    }
 System.out.println("MUltiplied Matrix: ");
for(int i = 0;i<r1;i++){
 for(int j=0;j<c2;j++){
  for(int k = 0;k<r2;k++){
   mulmat[i][j] += mat1[i][k]*mat2[k][j];
   }
  }
 }
 for(int i = 0;i<r1;i++){
    for(int j =0;j<c2;j++){
     System.out.print("\t"+mulmat[i][j]);
     }
System.out.println("\n");
    }
 
 }
}

