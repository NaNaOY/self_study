package company;

public class Person {
    protected   String name;
    protected String add;
    protected String phoneNo;
    protected String email;
    public Person(){

    }
     public Person(String name,String add,String phoneNo,String email){
        this.name=name;
        this.add=add;
        this.phoneNo=phoneNo;
        this.email=email;
     }
     public void setName(String name){
        this.name=name;
     }
     public void setPhoneNo(String phoneNo){

        this.phoneNo=phoneNo;
     }
     public void setAdd(String add){

        this.add=add;
     }
     public void setEmail(String email){

        this.email=email;
     }
     public String getNamename(){
         return name;
     }
     public String getAdd(){
        return add;
     }
     public String getEmail(){

        return email;
     }
     public String getPhoneNo(){

        return phoneNo;
     }

    @Override
    public String toString() {
        return   "\nname=" + name  +
                " \nadd=" + add  +
                " \nphoneNo=" + phoneNo +
                " \nemail="+email ;
    }
}