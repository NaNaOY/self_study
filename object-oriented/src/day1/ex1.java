package day1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("您是谁？请输入您的姓名：");
		String name=input.next();
		System.out.println(name+"，您好，欢迎学习Java！");
	}
}
