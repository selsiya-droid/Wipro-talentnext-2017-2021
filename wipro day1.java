1.To print the number is positive or negative or zero:
code::
public class number
{
    public static void main(String[] args) 
    {
        int number=109;
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is a zero");
        }
    }
}
2.To accept the two number and find the greatest number:
code::
import java.util.*;
 public class greaterofno {
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();  
		System.out.print("Input the second number: ");
		int b = in.nextInt(); 
		System.out.println("Result: "+result(a, b));
    }
	public static int result(int x, int y)
     {  
	if(x == y)
		return 0;
	    if(x % 6 == y % 6)
		    return (x < y) ? x : y;
	    return (x > y) ? x : y;
     }
}


3.To print even or odd:
code::
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}

4.To print the number in backwards:
code::
import java.util.Scanner;

public class backwardnumber {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Maximum integer Value : ");
		number = sc.nextInt();	
		
		backwardnumber(number);	
	}
	
	public static void backwardnumber(int num)
	{
		int i;
		
		for(i = num; i >= 0; i--)
		{
			System.out.print(i +" "); 
		}	
	}
}

5.write a programs to print all numbers from 1 to 100:
code::
import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*; 

class GFG 
{ 
	// Prints numbers from 1 to n 
	static void printNos(int n) 
	{ 
		if(n > 0) 
		{ 
			printNos(n - 1); 
			System.out.print(n + " "); 
		} 
		return; 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		printNos(100); 
	} 
} 


6.program to print alternate odd numbers from 1 to 99:
code::
import java.util.*;
 public class Exercise48 {
     public static void main(String[] args){
	for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
    }
}

7.program to print alternate even numbers from 1 to 100:
code::
class JavaExample {
   public static void main(String args[]) {
	int n = 100;
	System.out.print("Even Numbers from 1 to "+n+" are: ");
	for (int i = 1; i <= n; i++) {
	   //if number%2 == 0 it means its an even number
	   if (i % 2 == 0) {
		System.out.print(i + " ");
	   }
	}
   }
}

8.program to accept  two numbers and print whether their sum is even or odd:
code::
import java.util.Scanner;
public class Sum_Odd_Even 
{
    public static void main(String[] args) 
    {
        int n, sumE = 0, sumO = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
            }
            else
            {
                sumO = sumO + a[i];
            }
        }
        System.out.println("Sum of Even Numbers:"+sumE);
        System.out.println("Sum of Odd Numbers:"+sumO);
    }
}


