package org.howard.edu.lsp.assignment5.implementation;

import java.util.ArrayList;
import java.util.Scanner;

/*
In mathematics, a set is a collection of elements. The elements that make up a set can be any kind of mathematical objects: numbers, symbols, points in space, lines, other geometrical shapes, variables, or even other sets. The set with no element is the empty set; a set with a single element is a singleton.  Additionally, a set cannot contain duplicates.  Your task is to
implement a class, IntegerSet, that contains only integers, given the specification below.  
*/
import java.io.*;
import java.util.*;

/**
 * This class IntegerSet holds the follwoing function
 * clear(), length(), equals(IntegerSet) , contains(int) , largest(),
 * smallest(), add(int), remove(int), union(IntegerSet), 
 * intersect(IntegerSet), diff (IntegerSet), isEmpty() , and toString()	. 
 * As they will be explained further down the object of this class is so the mathematical set can perform various operations as defined by the functions created.
 * *@author Izaac Ballard
 */
public class IntegerSet 
{
	
	// Hint: probably best to use an array list.  You will need to do a little research
	private List<Integer> arraySet = new ArrayList<Integer>();

	/**
	 * This is the Default Constructor
	 */
	public IntegerSet() 
    {
        
	}
	
	/**
	 * This is a Method that clears the internal representation of the set
	 */
	
    public void clear() 
    {
    	arraySet.clear();
    }

    /**
     * This is a Method that will return the length of the set
     * @return the length of the set
     */ 
    public int length() 
    {
        return arraySet.size(); 
    }

   
    /**
     *  This is a Method that Returns true if the 2 sets are equal, false otherwise;
     * 	Two sets are equal if they contain all of the same values in ANY order.
     * @param b b is an IntegerSet object that will be our placeholder for our second set
     * @return ans ans is a boolean that determines if the sets are equal
     */
    public boolean equals(IntegerSet b) 
    {
        boolean ans = true;
        Collections.sort(arraySet);
        Collections.sort(b.arraySet);   
        if(length() != b.length())
        {
            return false;
        }
        else
        {
            for(int i = 0; i < length() ; i++)
            {
                if(arraySet.get(i) == b.arraySet.get(i))
                {
                	
                }
                else
                {
                    ans = false;
                }
            }
        }
       return ans;
    }
    
    /**
     *   This is a Method that Returns true if the set contains the value, otherwise false
     * @param value value is an int that will be the element within the set we are trying to find
     * @return ans ans is a boolean that determines if the value exists within the set
     */
    public boolean contains(int value) 
    {
        boolean ans = arraySet.contains(value) ;
        return ans;
    }

    /**
     * This is a Method that returns the largest element within the set
     * @return arraySet.get(length()-1) which is the largest element in the set after it has been reordered 
     * @throws IntegerSetException IntegerSetException is an Expection that occurs when the set is empty.
     */
    public int largest() throws IntegerSetException 
    {
    	
        if(arraySet.size() == 0)
        {
            throw new IntegerSetException ("IntegerSetException: Can Not Find The Largest as The Set is Empty.");
           // return 0 ;
        }
        else
        {
            Collections.sort(arraySet);
            return arraySet.get(length()-1);
        }
    } 

    /**
     * This is a Method that returns the smallest element within the set
     * @return arraySet.get(0) which is the smallest element in the set after it has been reordered 
     * @throws IntegerSetException IntegerSetException is an Expection that occurs when the set is empty.
     */
    public int smallest() throws IntegerSetException 
    {
        if(arraySet.size() == 0)
        {
            throw new IntegerSetException ("IntegerSetException: Can Not Find The Smallest as The Set is Empty.");
            //return 0 ;
        }
        else
        {
            Collections.sort(arraySet);
            return arraySet.get(0);
        }
    }
    
    
    /** 
     * This method Adds an item to the set or does nothing it already there	
     * @param item item is an int that we want to add to our set only if it does not already exist as sets can not contain duplicates
     */ 
    public void add(int item) 
    {
        if (contains(item))
        {
        	// do nothing
        }
        else
        {
            arraySet.add(item);
        }
    } 

    /** 
     * This method Removes an item from the set or does nothing if not there
     * @param item item is an int that we want to remove from our set 
     */
    public void remove(int item) 
    {
        if(length()== 0)
        {
        	// do nothing
        }
        else
        {
            int num = arraySet.indexOf(item);
            arraySet.remove(num);
        }
    }//  Throws a IntegerSetException of the set is empty

    /**
     *  This method combines the elements from both sets without any duplicates
     * @param intSetb intSetb is an IntegerSet object that will be our placeholder for our second set
     */
    public void union(IntegerSet intSetb) 
    {
       // combine all terms
    	
        List<Integer> unionSet = new ArrayList<Integer>();
        for(int i = 0; i < length(); i++)
    	{
    		int element = arraySet.get(i);
    		unionSet.add(element);
    	}
    	
       if (equals(intSetb))
       {
            // do nothing because they are the same
            //System.out.println("The Union is the same");
       }
       else
       {
            //if(length() < intSetb.length())
         
                for(int i = 0; i < intSetb.length() ; i++)
                {
                    int element = intSetb.arraySet.get(i);
                    add(element);  
                    unionSet.add(element);       
                }
           
       }
       //logic here works but not for our test cases 
       /*
       if(length() < intSetb.length())
       {
            for(int i = 0; i < length() ; i++)
            {
                int element = arraySet.get(i);
                intSetb.add(element);     
            }
       }
       else ///else if(length() > intSetb.length()) // switch to just else
       {
            for(int i = 0; i < intSetb.length() ; i++)
            {
                int element = intSetb.arraySet.get(i);
                add(element);     
            }
       }
       /*else  if (length() == intSetb.length())
       {
            for(int i = 0; i < intSetb.length() ; i++)
            {
                int element = arraySet.get(i);
                add(element);     
            }
           //System.out.print("The Union is ");
       }
       */

    }

    /**
     * This method takes the same exact elements from both sets without any duplicates and prints them
     * @param intSetb intSetb is an IntegerSet object that will be our placeholder for our second set
     */
    public void intersect(IntegerSet intSetb)
    {
        List<Integer> intersectSet = new ArrayList<Integer>();

        if(isEmpty() || intSetb.isEmpty())
        {
            System.out.println("One Of The Sets Inputed Are Empty .");
        }
        else
        if(length() < intSetb.length())
        {
            for(int i = 0; i < length() ; i++)
            {
                int element = arraySet.get(i);
                if(intSetb.contains(element))                
                {
                //ans = true
                   intersectSet.add(element);
                
                }

            }
            if (intersectSet.size()==0)
            {
                System.out.println("There is no intersection between the sets.");
            }
            else
            {
                System.out.print("[ ");
                //returns the intersecting list
                for(int i = 0; i < intersectSet.size() ; i++)
                {
                  System.out.print(intersectSet.get(i)+ " ");
                }
                System.out.println("]");    
            }
        }
        
        else
        {
            for(int i = 0; i < intSetb.length() ; i++)
            {
    
                int element = intSetb.arraySet.get(i);
                
                if(arraySet.contains(element))                 
                {
                intersectSet.add(element);
                }
            }
            if (intersectSet.size()==0)
            {
                System.out.println("There is no intersection between the sets.");
            }
            else
            {
                System.out.print("[ ");
                //returns the intersecting list
                for(int i = 0; i < intersectSet.size() ; i++)
                {
                    System.out.print(intersectSet.get(i) + " ");
                }
                System.out.println("]");
            }        
        }
    } 

    /**
     * This method takes the difference of elements, i.e. set a and set b the difference will be all the elements from set a without the intersection
     *  from the sets and finally prints the difference.
     *  (    // set difference, i.e. s1 - s2)
     * @param intSetb intSetb is an IntegerSet object that will be our placeholder for our second set
     */
    public void diff(IntegerSet intSetb)
    {
        // The difference is all the elms in set a (our first set in the testcase) without any elms from set b (our second set in the testcase)
    	if(isEmpty() || intSetb.isEmpty())
        {
            System.out.println("One Of The Sets Inputed Are Empty .");
        }
        else
        if(length() < intSetb.length())
        {
            for(int i = 0; i <  intSetb.length() ; i++)
            {
                int element = intSetb.arraySet.get(i);
                if(contains(element))                
                {
                   remove(element);
                }
            }
            if (length()==0)
            {
                System.out.println("There is no difference between the sets.");
            }
            else
            {
                System.out.print("[ ");
                //returns the set a list
                for(int i = 0; i < length() ; i++)
                {
                  System.out.print(arraySet.get(i)+ " ");
                }
                System.out.println("]");    
            }
        }
        else
        {
            for(int i = 0; i <  length() ; i++)
            {
                int element = arraySet.get(i);
                if(intSetb.contains(element))                
                {
                   remove(element);
                }
            }
            if (length()==0)
            {
                System.out.println("There is no difference between the sets.");
            }
            else
            {
                System.out.print("[ ");
                //returns the set a list
                for(int i = 0; i < length() ; i++)
                {
                  System.out.print(arraySet.get(i)+ " ");
                }
                System.out.println("]");    
            }
        }
    	/*
    	List<Integer> diffSet = new ArrayList<Integer>(); // temp array so it doesnt remove from the official arraylsit
    	List<Integer> diffSet2 = new ArrayList<Integer>(); // temp array so it doesnt remove from the official arraylsit
    	
    	for(int i = 0; i < length(); i++)
    	{
    		int element = arraySet.get(i);
    		diffSet.add(element);
    	}
    	
    	for(int i = 0; i < intSetb.length(); i++)
    	{
    		int element = intSetb.arraySet.get(i);
    		diffSet2.add(element);
    	}
	   	
    	if(isEmpty()||intSetb.isEmpty())
    	{
            System.out.println("One of the Inputed Sets Are Empty!");
    	}
    	else
        if (equals(intSetb)) // (length() == 0 || intSetb.length() == 0)
        {
            System.out.println("There is no difference between the sets because they are equal.");
        }
        else
        if(length() < intSetb.length())//diffSet.size() < diffSet2.size()) //length() < intSetb.length())
        {
            for(int i = 0; i <  diffSet2.size() ; i++)
            {
                int element = diffSet2.get(i);
                int index = diffSet2.indexOf(element);
                
                if(diffSet.contains(element))                
                {
                   diffSet.remove(index);
                }
            }
            if (diffSet.size()==0)
            {
                System.out.println("There is no difference between the sets.");
            }
            else
            {
                System.out.print("[ ");
                //returns the set a list
                for(int i = 0; i < diffSet.size() ; i++)
                {
                  System.out.print(diffSet.get(i)+ " ");
                }
                System.out.println("]");    
            }
        }
        else
        {
            for(int i = 0; i <  diffSet.size()  ; i++)
            {
                int element = diffSet.get(i);
                int index = diffSet.indexOf(element);
                if(diffSet2.contains(element))                
                {
                   diffSet.remove(index);
                }
            }
            if (diffSet.size()==0)
            {
                System.out.println("There is no difference between the sets.");
            }
            else
            {
                System.out.print("[ ");
                //returns the set a list
                for(int i = 0; i < diffSet.size() ; i++)
                {
                  System.out.print(diffSet.get(i)+ " ");
                }
                System.out.println("]");    
            }
        }
    	*/
    	
    	
    }

    /**
     * This method Returns true if the set is empty, false otherwise
     * @return boolean is it true or false
     */
    public boolean isEmpty()
    {
        if (length() <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    } 

    /**
     * This method Returns the  String representation of the set
     */
    public String toString() 
    {
    	if(isEmpty())
    	{
    		return "[]";
    	}
    	else
    	{
    		 String values = "";
    	        for(int i = 0; i < arraySet.size() ; i++)
    	        {
    	           values +=  arraySet.get(i) + " " ;
    	        }
    	        return values;
    	}
       
    }	// return String representation of your set



}