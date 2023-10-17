//19/12/22	IMP Concepts.	Note Syntaxes too
import java.util.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;
public class DemoCollection {
	public static void main(String[] args) {
		List<Integer> lstobj=new ArrayList<Integer>();
		//lstobj.add(new Integer(10));
		//lstobj.add(new Integer(20));	//Boxing
		lstobj.add(10);
		lstobj.add(20);
		lstobj.add(30);
		lstobj.add(50);
		lstobj.add(10);	//Autoboxing
		System.out.println("List Data: "+lstobj);
		lstobj.add(20);
		System.out.println("List Data: "+lstobj);
		lstobj.remove(0);	//Index
		System.out.println("List Data: "+lstobj);
		System.out.println("Search Value 20: "+lstobj.contains(20));
		System.out.println(lstobj.indexOf(50));
		
		//Set
		Set<Integer> setobj=new TreeSet<Integer>();
		setobj.add(70);
		setobj.add(60);
		setobj.add(new Integer(10));
		setobj.add(new Integer(20));
		setobj.add(30);
		setobj.add(new Integer(50));
		setobj.add(10);
		setobj.add(20);
		System.out.println("Set is: "+setobj);
		
		//22/12/22
		Set<Integer> hashobj=new HashSet<Integer>();
		hashobj.add(10);
		hashobj.add(50);
		hashobj.add(40);
		hashobj.add(20);
		System.out.println("Hash is: "+hashobj);
		
		Set<Integer> treeobj=new TreeSet<Integer>();
		treeobj.add(10);
		treeobj.add(50);
		treeobj.add(40);
		treeobj.add(20);
		System.out.println("Tree is: "+treeobj);
	}
}