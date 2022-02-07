package org.howard.edu.lsp.assignment2;
/**
 * This class will process input lines 
 * consisting of digits/numbers and spaces
 * Acculmating the sum and products
 * When the user inputs goodbye it will terminate the program
 * 
 * 
 * 
 */

/*
Problem:
Write a Java program that processes input lines until the user enters a terminating newline character. 
Each of the other lines is expected to be a string consisting of digits and space characters.
Each digit sequence is a token detected by the scanner and can be converted into a number. 
The program scans the string and prints the tokens (digit sequences in the string).
It also prints the sum and product of the numbers denoted by the tokens on the line.
It should print each token and the sum and product on a different line. 
It does this for each input line other than the terminating line. 
Thus, the tokens produced by your scanner denote numbers. 
Later your program will recognize other kinds of tokens such as words and quote characters. 
You can assume that there is: 
exactly one space character after each token
at least one token in each input line. 
line consists of only spaces and digits. 
The following example illustrates the nature of the expected program behavior for two input lines and a terminating line, 
in italics: 
The program ends when the end-user types in “Goodbye”.
String? 
2 3 100 
Tokens: 
2 
3 
100 
Sum: 105 
Product: 600 
String? 
4 6 20 
Tokens: 
4 
6 
20 
Sum: 30 
Product: 480 
String? 
Goodbye
*/
import java.util.Scanner;
import java.util.ArrayList;
public class StringToNum
{

	/**
	 * 
	 * @param str str is a String that is called from our main which is our input line statement
	 * @return count count is an int that when return is the amount of spaces within the input line statement
	 */
	 public static int spaceFreq(String str)
	 {
	        // size of the string 'str'
	        int n = str.length();
	
	        // Keeps Track of " " frequency
	        int count = 0;
	
	        //iterates to count all user inputed spaces
	        for (int i = 0; i < n; i++)
	        {     
	            if(str.contains(" "))
	            {  
	                int spacepos = str.indexOf(" ");
	                count +=1;
	                str = str.substring(spacepos+1);
	            }
	        }
	        return count;
	   }
	    
	    
	 	/**
	 	 * This is a Method that will return the tokens along with the sum and product of tokens.
	 	 * 
	 	 * @param str str is a String that is called from our main which is our input line statement
	 	 * @param freq freq is an int that is the amount of spaces within the input line statement
	 	 */
	    public static void canWeParse(String str, int freq)
	    {
	        // Variables For Our Tokens Final Sum and Product
	        int sum = 0;
	        int product = 1;

	        // Variable for Position In Array
	        int pos = 0;

	        // Variables for Converted String to Number
	        int num = 0;
	        String strBeforeSpace = "";
	        boolean state = true;
	        System.out.println("Tokens: ");
	        freq+=1;
	        for(int i = 0; i < freq; i++)
	        {
	            while(state)
	            {   
	                int spaceCharac = str.indexOf(" ");
	                if (spaceCharac==-1)
	                {        
	                    strBeforeSpace =  str.substring(0);
	                    try 
	                    {
	                        num = Integer.parseInt(strBeforeSpace);
	                        sum += num;
	                        product *= num;
	                        System.out.println(num);     
	                    }
	                    catch(Exception e) 
	                    {
	                        System.out.println("Error");
	                    } 
	                    state = false;               
	                } 
	                else
	                {
	                    strBeforeSpace =  str.substring(0,spaceCharac);
	                    pos = spaceCharac + 1 ;
	                    str = str.substring(pos); 
	                    try 
	                    {
	                        num = Integer.parseInt(strBeforeSpace);
	                        sum += num;
	                        product *= num;
	                        System.out.println(num);
	                    }
	                    catch(Exception e) 
	                    {
	                        System.out.println("FNF");  
	                    } 
	                }                      
	            }
	        }
	        System.out.println(retSum(sum));
	        System.out.println(retProduct(product));
	    }

	    // This Method Return The Sum
	    /**
	     * 
	     * @param num num is the number of our sum 
	     * @return  num num is our sum we are looking for
	     */
	    public static int retSum(int num)
	    {
	        System.out.print("Sum: "); 
	        return num;
	    }

	    // This Method Return The Product
	    // This Method Return The Sum
	    /**
	     * 
	     * @param num num is the number of our product
	     * @return num num is our product we are looking for
	     */
	    public static int retProduct(int num)
	    {
	        System.out.print("Product: "); 
	        return num;
	    }
	    
	
		public static void main(String[] args)
	    {   
	        boolean state = true;
	        while(state)
	        {
	            System.out.println("String?");
	            Scanner input = new Scanner(System.in);
	            String temp = input.nextLine();
	            int freq = spaceFreq(temp);
	            //Ends the While Loop
	            if(temp.equals("Goodbye"))
	            {
	                state = false;
	            }   
	            else  
	            {
	                canWeParse(temp, freq);
	                //System.out.println("---------");
	            }     
	        } 
	    }
}

