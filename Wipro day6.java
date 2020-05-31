// Java program to demonstrate working of iterators 
import java.util.*; 
public class IteratorDemo 
{ 
	public static void main(String args[]) 
	{ 
		//create a Hashset to store strings 
		HashSet<String> hs = new HashSet<String>() ; 

		// store some string elements 
		hs.add("India"); 
		hs.add ("America"); 
		hs.add("Japan"); 

		// Add an Iterator to hs. 
		Iterator it = hs.iterator(); 

		// Display element by element using Iterator 
		while (it.hasNext()) 
			System.out.println(it.next()); 
	} 
}

//Collection should have following capability to reverse the element of the collections


import java.util.TreeSet;
import java.util.Iterator;
  public class reverse {
  public static void main(String[] args) {
    // create an empty tree set
     TreeSet<String> t_set = new TreeSet<String>();
   // use add() method to add values in the tree set
          t_set.add("Red");
          t_set.add("Green");
          t_set.add("Black");
          t_set.add("Pink");
          t_set.add("orange");
     // print original list
   System.out.println("Original tree set:" + t_set);  
     Iterator it = t_set.descendingIterator();
     // Print list elements in reverse order
     System.out.println("Elements in Reverse Order:");
     while (it.hasNext()) {
        System.out.println(it.next());
     }
  }
}

// create an array of list Employee(id,name,address,sal)objects and search for particular Employee object based on id number::
code--
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
public class Employee {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(101, "Bob", "123 street, India", 20000.0));
		list.add(new Employee(102, "Alice", "234 street, India", 30000.0));
		list.add(new Employee(103, "John", "345 street, India", 25000.0));
		list.add(new Employee(104, "Stuart", "456 street, India", 40000.0));
		
		Iterator<Employee> it = list.iterator();
		int searchId = 102;
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}

// create an arraylist which will be able to store only numbers like int,float,double.but not other data type.
import java.util.ArrayList;
import java.util.List;
 {
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}

public class  {

	public static void main(String[] args) {
		List<Object> list = new MyArrayList<>();
		
		try {
			list.add(15);
			list.add(1.2F);
			list.add(3.1415D);
			list.add("Test");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(list);

	}

}

//create an array list which will store only strings .create a printall method which will  print all the elements using  an iterator
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class assign {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Item 1");
		list.add("Item 2");
		list.add("Item 3");
		list.add("Item 4");
		
		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}
