package org.anurag;

public class staticex {
private static int eid;
private String name;
public static void setEmp(int empid)
{
	eid=empid;
}
public void setname(String name)
{
	this.name=name;
	
}
public static void getEmp()
{
	System.out.println("Employee id="+eid);
}
public void getName()
{
	System.out.println("Emp name="+name);
	System.out.println("Employee id="+eid);
}
}
