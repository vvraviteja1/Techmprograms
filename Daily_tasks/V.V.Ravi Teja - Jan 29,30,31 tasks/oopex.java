package org.anurag;
public class oopex {
 private int eid;
 private String ename;
 private double sal;
 public void setEmp(int eid,String ename,double sal)
 {
	 this.eid=eid;
	 this.ename=ename;
	 this.sal=sal;
 }
 public void getEmp()
 {
	 System.out.println("Emp id="+eid);
	 System.out.println("Ename="+ename);
	 System.out.println("Salary="+sal);
	 
 }
}
