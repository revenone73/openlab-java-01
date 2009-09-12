package cn.openlab.demo;

import java.util.Date;

public class MathAction {

	private Integer op1;
	private Integer op2;
	private Integer op3;
	private Date dateOfBirth;

	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getOp3() {
		return op3;
	}
	public void setOp3(Integer op3) {
		this.op3 = op3;
	}
	public Integer getOp1() {
		return op1;
	}
	public void setOp1(Integer op1) {
		this.op1 = op1;
	}
	public Integer getOp2() {
		return op2;
	}
	public void setOp2(Integer op2) {
		this.op2 = op2;
	}
	
	public String execute() {
		op3 = op1 + op2;
		System.out.println(dateOfBirth);
		return "success";
	}

	public String load() {
		return "load";
	}
}
