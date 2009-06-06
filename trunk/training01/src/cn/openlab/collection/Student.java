package cn.openlab.collection;

public class Student implements Comparable {

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Object arg0) {
		Student s = (Student) arg0;
		return 0;
	}

	public int hashCode() {
		return 1;
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return name.equals(s.name) && age == s.age;
		}
		return false;
	}

	public String toString() {
		return "name:" + name + ",age:" + age;
	}
}
