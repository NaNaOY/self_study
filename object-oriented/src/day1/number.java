package day1;

import java.util.Random;
import java.util.Scanner;

public class number {
	public static void main(String[] args){
		System.out.println("ϵͳ�Զ�������0-100��int����");
		System.out.println("���ȣ���������һ����");
		Scanner scan = new Scanner(System.in);
		
		number r = new number();
		int math =r.getMath();
		while(true){
			int a = scan.nextInt();
			if(a<math){
				System.out.println("С�ˣ������");
			}else if(a>math){
				System.out.println("���ˣ������");
			}else if(a==math){
				System.out.println("��¶���");
				break;
			}
			
		}
}
public int getMath(){
	int num=(int)(Math.random()*100+1);
	return num;
	}
}
