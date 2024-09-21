
public class Student implements Interface,Interface2 {
public void home() {
System.out.println("January");
this.kitchen();}

public void kitchen() {
	System.out.println("February");
this.bedroom();}

public void bedroom() {System.out.println("March");
this.hall();}

public void hall() {System.out.println("April");
this.school();}	

public void school() {System.out.println("May");
this.classroom();}

public void classroom() {System.out.println("June");
this.examhall();}

public void examhall() {System.out.println("July");
this.sleeping();}

private void sleeping() {System.out.println("August");}

public static void main (String[] args) {
Student student=new Student();	
student.home();}}
