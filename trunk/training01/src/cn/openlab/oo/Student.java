package cn.openlab.oo;

import java.util.Date;

public class Student {

	public int weight;	//不恰当的写法
	private Date dateOfBirth;
	private String name;

	public void setWeight(int weight) throws Exception {
		//如果weight小于10
		if(weight <= 0) {
			throw new Exception();
		}
		if(weight <= 10) {
			weight = 10;
		}
		this.weight = weight;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}
	
	public Student() {
		this(null, new Date(), 0);
	}
	
	public Student(String name) {
		this(name, new Date(), 0);
	}
	
	public Student(String name, int weigth) {
		this(name, new Date(), weigth);
	}
	
	public Student(String name, Date dateOfBirth) {
		this(name, dateOfBirth, 0);
	}
	
	public Student(String name, Date dateOfBirth, int weight) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.weight = weight;
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		try{
			s.setWeight(10);
		} catch(Exception e) {
			System.out.println("重量必须大于0");
		}
	}
}
