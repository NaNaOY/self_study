package day1;

import java.util.Scanner;
public class TestStudent {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Course c = new Course(input.next());
        Student s1 = new Student(input.nextInt(),input.next());
        Student s2 = new Student(input.nextInt(),input.next());
        c.addStudent(s1);
        c.addStudent(s2);
        System.out.println(c.toString());
    }
}
class Student{
    private int stuNo;
    private String name;
    public Student(){
    }
    public Student(int stuNo, String name){
        this.stuNo = stuNo;
        this.name = name;
    }
    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getStuNo() {
        return stuNo;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return "学号" + stuNo + " 姓名" + name;
    }
}
class Course{
    private String name;
    private Student[] stuList = new Student[100];
    private int numberOfStudents;
    public Course(){
    }
    public Course(String name){
        this.name = name;
    }
    public Course(String name,Student[] stuList,int numberOfStudent){
        this.name = name;
        this.stuList = stuList;
        this.numberOfStudents = numberOfStudents;
    }
    public void addStudent(Student stu){
        stuList[numberOfStudents] = stu;
        numberOfStudents++;
    }

    @Override
    public String toString() {
        String str="";
        for(int i=0;i<numberOfStudents;i++)
            str= str+ stuList[i]+"\n";
        return "课程名称 " + name + "\n选课学生名单\n" + str ;
    }
}