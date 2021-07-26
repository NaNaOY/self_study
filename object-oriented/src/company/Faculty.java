package company;

public class Faculty extends Employee{
    private String officeHours;
    private int rank;

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getOfficeHours() {
        return officeHours;
    }
    public void setRank(int rank){
        this.rank=rank;
    }
    public int getRank(){
        return rank;
    }

    public void go(String name,String add,String phoneNo,String email,String office,double salary){
        super.setName(name);
        super.setAdd(add);
        super.setPhoneNo(phoneNo);
        super.setEmail(email);
        super.setOffice(office);
        super.setSalary(salary);
    }
    public  String goes(){
        return super.toString();
    }
    public String gone(){
        return super.move1();
    }

    @Override
    public String toString() {
        return "\nofficeHours=" + officeHours  +
                " \nrank=" + rank ;
    }
}