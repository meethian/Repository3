import java.util.*;
import java.util.Set;
import java.util.LinkedHashSet;
public class SetCollection {
	public static void main(String[] args) {
	//Set<Wrapper class> ref.name=new Set type <>();		
Set<String> fruits=new HashSet<>();
Set<String> colours=new LinkedHashSet<>();
Set<String> animal=new TreeSet<>();
fruits.add("apple");fruits.add("orange");fruits.add("banana");
colours.add("red");colours.add("black");colours.add("white");
animal.add("monkey");animal.add("lion");
System.out.println(fruits);//method1
int size=fruits.size();
System.out.println(size);//method2
boolean contains=fruits.contains("apple");
System.out.println(contains);//method3
boolean remove=fruits.remove("apple");
System.out.println(remove);//method4
boolean addAll=fruits.addAll(colours);
System.out.println(addAll);//method5
System.out.println(fruits);
System.out.println(colours);
boolean containsAll=colours.containsAll(fruits);
System.out.println(containsAll);//method6
boolean isEmpty=animal.isEmpty();
System.out.println(isEmpty);//method7
}}
