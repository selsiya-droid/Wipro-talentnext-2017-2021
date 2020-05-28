//Convert uppercae into lowercase:

class Test{ 
       
     // Method to convert characters  
     // of a string to opposite case 
     static void convertOpposite(StringBuffer str) 
     { 
        int ln = str.length(); 
             
        // Conversion using predefined methods 
        for (int i=0; i<ln; i++) 
        { 
            Character c = str.charAt(i); 
            if (Character.isLowerCase(c)) 
                str.replace(i, i+1, Character.toUpperCase(c)+""); 
            else
                str.replace(i, i+1, Character.toLowerCase(c)+""); 
             
        } 
     } 
       
     public static void main(String[] args)  
     { 
         StringBuffer str = new StringBuffer("ARUL SELSIYA"); 
         // Calling the Method 
         convertOpposite(str); 
           
         System.out.println(str); 
        } 
 } 

//Print from 1 to 10:

public class Use_For_Loop
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
//Even numbers from 23 and 57:

public class ListEvenNumbers {
 
 public static void main(String[] args) {
 
 //define limit
 int limit = 57;
 
 System.out.println("Printing Even numbers between 23 and " + limit);
 
 for(int i=23; i <= limit; i++){
 
 // if the number is divisible by 2 then it is even
 if( i % 2 == 0){
 System.out.print(i + " ");
 }
 }
 }
}

//Prime numbers or not: 
    
public class Prime {

    public static void main(String[] args) {

        int num = 29;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}

//Prime number between 10 to 99:

class PrimeNumbers
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";

       for (i = 10; i <= 99; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 10 to 99 are :");
       System.out.println(primeNumbers);
   }
}

//Reverse number:

public class ReverseNumber {

    public static void main(String[] args) {

        int num = 1234, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }

//palindrome or not:

public class Palindrome {

    public static void main(String[] args) {

        int num = 110011, reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}
}

//Divisble by 2,3,and 5:

import java.util.Scanner;
public class Numbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);        
        long x = sc.nextLong();   // first number input 
        long y = sc.nextLong();   // second number input            
        long num = 0;            // new variable num -- means all the numbers between these to given input numbers
        long count = 0;            // loop counter - how many numbers are divided by 2 or 3 or 5                        
        for (num = x; x <= num && num <= y; num++) {                                                    
            if (num % 2 == 0 | num % 3 == 0 | num % 5 == 0) {
                count = count + 1;             // increasing the counter by 1, so that every time the loop repeats, the counter increases...                                
            }               
        }
        System.out.println(count);  // prints out how many numbers are divided by 2 or 3 or 5 ...       
    }
}