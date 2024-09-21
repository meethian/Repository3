
public class Variables {
 byte ravi;  //instance variable
 static short raja;  //static variable
 final	int ranga=60; 
public void method1()	{
 ravi=20;
 int ravi=10; // local variable
 System.out.println(ravi);//priority goes to local variable
}	
private static void method2() {
  byte ravi=50; //static method doesn't accept class variable
System.out.println(ravi+"+"+raja);//taking default value
}
final protected void method3() {
 raja=30;
 System.out.println(raja);
}
void method4() {
//ranga=40; we can't change the value in final
 System.out.println(ranga);
}
public static void main(String[] args) {
	 Variables object=new Variables();
	 object.method1();
	 method2();// no need of object
	 object.method3();object.method4();
}
}
