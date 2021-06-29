package day1;

import java.util.Random;
import java.util.Scanner;

public class number {
	public static void main(String[] args){
		System.out.println("系统自动生成了0-100的int整数");
		System.out.println("首先，请你输入一个数");
		Scanner scan = new Scanner(System.in);
		
		number r = new number();
		int math =r.getMath();
		while(true){
			int a = scan.nextInt();
			if(a<math){
				System.out.println("小了，请继续");
			}else if(a>math){
				System.out.println("大了，请继续");
			}else if(a==math){
				System.out.println("你猜对了");
				break;
			}
			
		}
}
public int getMath(){
	int num=(int)(Math.random()*100+1);
	return num;
	}
}
