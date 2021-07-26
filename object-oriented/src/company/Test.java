package company;
import company.*;

public class Test {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.setClassStatus(32);
        stu.transfer("张三","北京","987654","qq.com");
        System.out.println("Student:"+stu.transfers()+"  "+stu.toString());
        Employee e1=new Employee();
        e1.setOffice("好客");
        e1.setSalary(100);
        MyDate date=new MyDate(),date1=new MyDate();
        date.setYear(2012);
        date.setMonth(12);
        date.setDay(23);
        date1.setYear(2013);
        date1.setMonth(1);
        date1.setDay(3);
       e1.setDateHired(date);
        e1.move("李四","河南","123456","qq.com");
        System.out.println("\nEmployee:"+e1.move1()+" "+e1.toString());
        Faculty facu=new Faculty();
        facu.setOfficeHours("没了");
        facu.setRank(88);
        facu.go("王五","安阳","456123","qq.com","好玩",200);
        facu.setDateHired(date1);
       System.out.println("\nFaculty："+facu.gone()+"  "+facu.goes()+"  "+facu.toString());
        Staff sta=new Staff();
        sta.qwe("小苏","内黄","789456","qq.com","在学校",300);
        sta.setTitle("销售");
        System.out.println("\nStaff:"+sta.qwer()+"  "+sta.qwert()+"  "+sta.toString());





    }
}