import java.util.Scanner;

public class ScannerJuly {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String name = scan.nextLine();
String area=scan.next();
int pincode = scan.nextInt();
float ht = scan.nextFloat();
long cell=scan.nextLong();
double salary=scan.nextDouble();
char initial =scan.next().charAt(6);
System.out.println("Name"+":"+name+";"+"Cell"
+":"+cell+";"+"Location"+":"+";"+area+";"+";"+"Height"
+":"+ht+";"+"Pincode"+":"+pincode+";"+"Salary"+":"+salary+";"+"Initial"+":"+initial);
scan.close();
}}
