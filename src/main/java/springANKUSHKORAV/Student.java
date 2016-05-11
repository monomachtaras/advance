package springANKUSHKORAV;

import java.util.ArrayList;
import java.util.Date;

public class Student {
private String name;
private String hobby;
private long studentMobile;
private Date studentDOB;
private ArrayList<String> studentSkills;





public long getStudentMobile() {
	return studentMobile;
}
public void setStudentMobile(long studentMobile) {
	this.studentMobile = studentMobile;
}
public Date getStudentDOB() {
	return studentDOB;
}
public void setStudentDOB(Date studentDOB) {
	this.studentDOB = studentDOB;
}
public ArrayList<String> getStudentSkills() {
	return studentSkills;
}
public void setStudentSkills(ArrayList<String> studentSkills) {
	this.studentSkills = studentSkills;
}
public String getHobby() {
	return hobby;
}
public void setHobby(String hobby) {
	this.hobby = hobby;
}
public String getName() {
	return name;
}
public void setName(String names) {
	this.name = names;
}

}
