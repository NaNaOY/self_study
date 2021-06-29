package day1;

public class TestStudent {
    public static void main(String[] args){
    	Student s1=new Student();
        Student s2=new Student();
        s1.setName("Jack");
        s1.setNumber(100);
        s1.setGrade(01);
        s2.setName("Tom");
        s2.setNumber(99);
        s2.setGrade(02);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}