package company;


public class Employee extends Person{
    protected  String office;
    protected  double salary;
    protected  MyDate dateHired;
    public Employee(){

    }

    public void setOffice(String office){

        this.office=office;
    }
    public void setSalary(double salary){

        this.salary=salary;
    }
    public void setDateHired(MyDate dateHired){

        this.dateHired=dateHired;

    }
    public String getOffice(){

        return office;
    }
    public  double getSalary(){

        return salary;
    }
    public MyDate getDateHired(){

        return dateHired;
    }
    public  void move(String name,String add,String phoneNo,String email){
        super.setName(name);
        super.setAdd(add);
        super.setPhoneNo(phoneNo);
        super.setEmail(email);
    }
    public String move1(){

        return super.toString();
    }


    @Override
    public String toString() {
        return
                "\noffice=" + office  +
                " \nsalary=" + salary +
                " \ndateHired=" + dateHired ;
    }
}