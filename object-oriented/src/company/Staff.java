package company;

public class Staff extends Employee{
    private  String title;
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){

        return title;
    }
    public void qwe(String name,String add,String phoneNo,String email,String office,double salary){
        super.setName(name);
        super.setAdd(add);
        super.setPhoneNo(phoneNo);
        super.setEmail(email);
        super.setOffice(office);
        super.setSalary(salary);
    }
    public String qwer(){
       return super.move1();
    }
    public String qwert(){
       return  super.toString();
    }
    @Override
    public String toString() {
        return
                "\ntitle=" + title ;
    }
}