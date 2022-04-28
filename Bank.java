import java.util.*;

abstract class Bank{
  abstract void website();
 }
 class SBI extends Bank{
   void website(){
      System. out. println("www.sbi.in");
   }
 }
 class FederalBank extends Bank{
    void website(){
      System. out. println("www.federalbank.in");
 }
}
 class SouthIndianBank extends Bank{
    void website(){
      System. out. println("www.southindianbank.in");
    }
 }
class MainBank{
   public static void main(String[]args){
      SBI sbi=new SBI();
      FederalBank fb=new FederalBank();
      SouthIndianBank sb=new SouthIndianBank();
      sbi. website();
      fb. website();
      sb. website();
      
   }
 }