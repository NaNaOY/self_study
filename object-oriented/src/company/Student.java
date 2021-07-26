package company;

public class Student extends Person{
    protected int classStatus;
    public Student(){

    }
    public void setClassStatus(int classStatus){

        this.classStatus=classStatus;
    }
    public int getClassStatus(){

        return classStatus;
    }
    public void  transfer(String name,String add,String phoneNo,String email){
        super.setName(name);
        super.setAdd(add);
        super.setPhoneNo(phoneNo);
        super.setEmail(email);
    }
    public String transfers(){
        return super.toString();

    }

    @Override
    public String toString() {
        return
                "\nclassStatus=" + classStatus ;
    }
}