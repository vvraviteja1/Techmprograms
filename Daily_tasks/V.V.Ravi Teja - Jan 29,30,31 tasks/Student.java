package org.anurag;

public class Student {
protected int stuid;
protected String stuname;
public void setDetails(int stuid,String stuname)
{
	this.stuid=stuid;
	this.stuname=stuname;
}
public void getDetails()
{
	System.out.println("Student id="+stuid);
}
}
