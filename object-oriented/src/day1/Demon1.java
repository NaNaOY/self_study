package day1;

public class Demon1 {
	public static void main(String[] args){
		char grade=getGrade(26);
		System.out.println("µÈ¼¶:"+grade);
	}
	public static char getGrade(int testScore){
		char grade=' ';
			if(testScore<=100&&testScore>=90){
				grade='A';
			}
			if(testScore<=89&&testScore>80){
				grade='B';
			}
			if(testScore<=79&&testScore>70){
				grade='C';
			}
			if(testScore<=69&&testScore>60){
				grade='D';
			}
			if(testScore<=59&&testScore>0){
				grade='E';
			}
		return grade;
	}
}
