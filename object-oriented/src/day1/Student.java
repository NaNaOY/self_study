package day1;

public class Student {
	public String name;
	public int number;
	public double grade;

	public String getName(){
		return name;
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	public void setGrade(double grade) {
		// TODO Auto-generated method stub
		this.grade=grade;
	}
	public double getGrade(){
		return grade;
	}

	public void setNumber(int number) {
		// TODO Auto-generated method stub
		this.number=number;
	}

	public int getNumber(){
		return number;
	}
	
	public String toString(){
		return "name:"+name+",number:"+number+",grade:"+grade;
	}
}
