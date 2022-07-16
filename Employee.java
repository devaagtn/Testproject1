package Devaproject;

public class Employee {
 private int empid;
 private int empsalary;
 private String empname;
 private int empleave;
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public int getEmpsalary() {
	return empsalary;
}
public void setEmpsalary(int empsalary) {
	this.empsalary = empsalary;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public int getEmpleave() {
	return empleave;
}
public void setEmpleave(int empleave) {
	this.empleave = empleave;
}
public Employee(int empid, int empsalary, String empname, int empleave) {
	super();
	this.empid = empid;
	this.empsalary = empsalary;
	this.empname = empname;
	this.empleave = empleave;
}
public Employee() {
	super();
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", empsalary=" + empsalary
			+ ", empname=" + empname + ", empleave=" + empleave + "]";
}
 
}
