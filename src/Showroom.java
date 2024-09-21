
public class Showroom extends Abstract {
	int nanoCar=100000;
public void bmw() {
System.out.println("BMW car price is 70lakhs");	  
super.aadi(); this.skoda();}
private void skoda() {
System.out.println("Skoda car price is 6lakhs");}
public static void main(String[] args) {
Showroom car=new Showroom();
car.bmw();
System.out.println("Nano car price:"+car.nanoCar);
}}