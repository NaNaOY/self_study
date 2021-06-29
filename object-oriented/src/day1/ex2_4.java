package day1;

import java.util.Scanner;

public class ex2_4 {
 public static double[] getArray(int n) {
  double[] num=new double[n];
  Scanner scan=new Scanner(System.in);
  for(int i=0;i<n;i++)
   num[i]=scan.nextDouble();
  scan.close();
  return num;
 }

 public static void printArray(double[] array){
  for(int i=0;i<array.length;i++)
   System.out.print(array[i]+" ");
 }

 public static void main(String[] args) {
  System.out.println("Please input 10 numbers:");
  double[] num=ex2_4.getArray(10);  //input 10 numbers;
  ex2_4.printArray(num);
 }
}