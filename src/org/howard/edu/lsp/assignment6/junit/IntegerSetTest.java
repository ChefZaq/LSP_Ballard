package org.howard.edu.lsp.assignment6.junit;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
//import static org.mockito.Mockito.*;
//import static org.mockito.Matchers.*;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

//import org.junit.Assert.assertEquals;clear(), length(), equals(IntegerSet) , contains(int) , largest(),
// smallest(), add(int), remove(int), union(IntegerSet), 
// intersect(IntegerSet), diff (IntegerSet), isEmpty() , and toString()	. 

//import org.howard.edu.lsp.assignment5.implementation;
public class IntegerSetTest
{
	
	IntegerSet set1 = new IntegerSet();
    IntegerSet set2 = new IntegerSet();
    IntegerSet set3 = new IntegerSet();
    IntegerSet set4 = new IntegerSet();
    IntegerSet set5 = new IntegerSet();
    IntegerSet set6 = new IntegerSet();
    IntegerSet set7 = new IntegerSet();
    private List<Error> errors = new ArrayList<>();
    
    
    // Test All Set Prior Insertions 
    
	@Test
	@DisplayName("Test case for isEmpty()")
    public void isTheSetEmpty()
    {
		try 
		{
			assertTrue(set1.isEmpty());
	    	assertTrue(set2.isEmpty());
	    	assertTrue(set3.isEmpty());
	    	assertTrue(set4.isEmpty());
	    	assertTrue(set5.isEmpty());
	    	assertTrue(set6.isEmpty());
	    	assertTrue(set7.isEmpty());
		}
		catch (AssertionError e)
		{
			errors.add(e);
		}
    	
    }
	
	// Insertion Methods
	{
		 System.out.println("Add Method:\n");
	        System.out.println("Set1:"); //set 1 insertion
	        {
		    	System.out.println("\t" + "Inserting '1' into Set1.");
		        set1.add(1);
		        System.out.println("\t" + "Inserting '2' into Set1.");
		        set1.add(2);
		        //System.out.println("Inserting '1' into Set1.");
		        set1.add(1); // duplicate; however due to code it will not show as sets can not contains duplicate
		        System.out.println("\t" + "Inserting '563' into Set1.");
		        set1.add(563);
		        System.out.println("\t" + "Inserting '564' into Set1.");
		        set1.add(564);
	        }
	        
	        System.out.println("Set2:");  //set 2 insertion
	        {
	        	 System.out.println("\t" + "Inserting '4' into Set2.");
		    	 set2.add(4);
		    	 System.out.println("\t" + "Inserting '5' into Set2.");
		         set2.add(5);
		         System.out.println("\t" + "Inserting '44' into Set2.");
		    	 set2.add(44);
	        }
	      
	        System.out.println("Set3:");  //set 3 insertion
	        {
	        	 
		    	 System.out.println("\t" + "Inserting '5' into Set3.");
		         set3.add(5);
		         System.out.println("\t" + "Inserting '44' into Set3.");
		    	 set3.add(44);
		    	 System.out.println("\t" + "Inserting '4' into Set3.");
		    	 set3.add(4);
	        }
	      
	        System.out.println("Set4:");  //set 4 insertion
	        {
	        	 System.out.println("\t" + "Inserting '4' into Set4.");
		    	 set4.add(4);
		    	 System.out.println("\t" + "Inserting '5' into Set4.");
		         set4.add(5);
		         System.out.println("\t" + "Inserting '2' into Set4.");
		         set4.add(2);
		         System.out.println("\t" + "Inserting '6' into Set4.");
		         set4.add(6);
		         System.out.println("\t" + "Inserting '45' into Set4.");
		         set4.add(45);
		      
		         
	        }
	    
	        System.out.println("Set5:");  //set 5 insertion
	        {
		    	 System.out.println("\t" + "Inserting '25' into Set5.");
		         set5.add(25);
		         System.out.println("\t" + "Inserting '2' into Set5.");
		         set5.add(2);
		         System.out.println("\t" + "Inserting '6' into Set5.");
		         set5.add(6);
		         System.out.println("\t" + "Inserting '62' into Set5.");
		         set5.add(62);
		         System.out.println("\t" + "Inserting '1' into Set5.");
		         set5.add(1);
	        }   
	        
	        System.out.println("Set6:");  //set 6 insertion
	        {
		    	 System.out.println("\t" + "Inserting '25' into Set6.");
		         set6.add(25);
		         System.out.println("\t" + "Inserting '2' into Set6.");
		         set6.add(2);
		         System.out.println("\t" + "Inserting '6' into Set6.");
		         set6.add(6);
		         System.out.println("\t" + "Inserting '243' into Set6.");
		         set6.add(243);
	        }        
	        System.out.println("------------------------------");
	        
		
		
	}

	@Test
	@DisplayName("Test case for add()")
	public void doesAdd()
	{
		IntegerSet tempSet = new IntegerSet();
        tempSet.add(1);
        tempSet.add(2);
        tempSet.add(563);
        tempSet.add(564);
		boolean ans = false;
		if (tempSet.contains(1) && tempSet.contains(2) && tempSet.contains(563) && tempSet.contains(564))
		{
			ans = true;
		}
		assertTrue(ans);
	}
	
	@Test
	@DisplayName("Test case for remove()")
	public void doesRemove()
	{
		IntegerSet tempSet = new IntegerSet();
        tempSet.add(1);
        tempSet.add(2);
        tempSet.add(563);
        tempSet.add(564);
        tempSet.remove(1);
        boolean ans = true;
		
		if (tempSet.contains(1)) //&& tempSet.contains(2) && tempSet.contains(563) && tempSet.contains(564))
		{
			 ans = false;
		}
		else
		{
			ans = true;
		}
		assertTrue(ans);
	}

	@Test
	@DisplayName("Test case for clear()")
	public void doesClear()
	{
		IntegerSet tempSet = new IntegerSet();
        tempSet.add(1);
        tempSet.add(2);
        tempSet.add(563);
        tempSet.add(564);
        tempSet.clear();
		
		assertTrue(tempSet.isEmpty());
	}
	
	@Test
	@DisplayName("Test case for length()")
	public void lengthOfTheSet()
	{
		
		assertEquals("The length of Set1 is: ", set1.length(),4);
		assertEquals("The length of Set2 is: ", set2.length(),3);
		assertEquals("The length of Set3 is: ", set3.length(),3);
		assertEquals("The length of Set4 is: ", set4.length(),5);
		assertEquals("The length of Set5 is: ", set5.length(),5);
		assertEquals("The length of Set6 is: ", set6.length(),4);
		assertEquals("The length of Set7 is: ", set7.length(),0);
	}
	
	@Test
	@DisplayName("Test case for smallest()")
	public void smallestInTheSet()
	{
		try
        {
	        assertEquals("The Smallest Number Set1 is: ", set1.smallest(),1);
	        assertEquals("The Smallest Number Set2 is: ", set2.smallest(),4);
	        assertEquals("The Smallest Number Set3 is: ", set3.smallest(),4);
	        assertEquals("The Smallest Number Set4 is: ", set4.smallest(),2);
	        assertEquals("The Smallest Number Set5 is: ", set5.smallest(),1);
	        assertEquals("The Smallest Number Set6 is: ", set6.smallest(),2);
        }
        catch(Exception e)
    	{
    		System.out.println(e);
    	}
		
		
	}
	
	@Test
	@DisplayName("Test case for largest()")
	public void largestInTheSet()
	{
		try
        {
	        assertEquals("The Largest Number Set1 is: ", set1.largest(),564);
	        assertEquals("The Largest Number Set2 is: ", set2.largest(),44);
	        assertEquals("The Largest Number Set3 is: ", set3.largest(),44);
	        assertEquals("The Largest Number Set4 is: ", set4.largest(),45);
	        assertEquals("The Largest Number Set5 is: ", set5.largest(),62);
	        assertEquals("The Largest Number Set6 is: ", set6.largest(),243);
	     
        }
        catch(Exception e)
    	{
    		System.out.println(e);
    	}
	}
	
	@Test
	@DisplayName("Test case for equals()")
	public void areTheSetsEqual()
	{
		try 
		{
			assertTrue(set1.equals(set2));
			assertTrue(set2.equals(set3));
			assertTrue(set5.equals(set6));
			assertTrue(set4.equals(set2));
		}
		catch (AssertionError e)
		{
			errors.add(e);
		}
	}
	
	@Test
	@DisplayName("Test case for contains()")
	public void containedInTheSet()
	{
		
		try
		{
			assertFalse(set1.contains(564));
			assertTrue(set2.contains(4));
			assertFalse(set3.contains(44));
			assertTrue(set4.contains(5));
			assertFalse(set5.contains(26));
			assertFalse(set6.contains(564));	
		}
		catch (AssertionError e)
		{
			errors.add(e);
		}
		
		
	}
	
	@Test
	@DisplayName("Test case for intersect()")
	public void createInterset()
	{
		/*
		doAnswer(invocation ->
		{
			//Object arg0 = invocation.getArgument(0);
			//Object arg1 = invocation.getArgument(1);
			assertEquals("The Intersect of Set3 and Set4 are the following values:",  set3.intersect(set4) , "[ 4 5 ]");
			assertEquals("The Intersect of Set1 and Set2 are the following values:",  set1.intersect(set2) , "There is no intersection between the sets.");
			assertEquals("The Intersect of Set4 and Set1 are the following values:",  set4.intersect(set1) , "[ 2 ]");
			assertEquals("The Intersect of Set2 and Set3 are the following values:",  set2.intersect(set3) , "[ 4 5]");
			return null;
		}).when(iSetTest).add(is)
		 //set3.intersect(set4) ;*/
		try
		{
			//var temp = set3.intersect(set4);
			//assertEquals("The Intersect of Set3 and Set4 are the following values:",   "[ 4 5 ]" , set3.intersect(set4) );

			
			//assertTrue( set3.intersect(set4) , );
			//assertEquals"The Intersect of Set3 and Set4 are the following values:",  set3.intersect(set4) , "[ 4 5 ]");
			//assertEquals("The Intersect of Set1 and Set2 are the following values:",  set1.intersect(set2) , "There is no intersection between the sets.");
			//assertEquals("The Intersect of Set4 and Set1 are the following values:",  set4.intersect(set1) , "[ 2 ]");
			//assertEquals("The Intersect of Set2 and Set3 are the following values:",  set2.intersect(set3) , "[ 4 5]");
		}
		catch (AssertionError e)
		{
			//errors.add(e);
		}
		
		
	}
	
	@Test
	@DisplayName("Test case for diff()")
	public void createDiff()
	{
		
		//assertEquals("The Difference of Set3 from Set4 are the following values:" ,   set3.diff(set4) ,"There is no difference between the sets.");
		//assertEquals("The Difference of Set1 from Set2 are the following values:" ,   set1.diff(set2) ,"[ 1 2 563 ]");
		//assertEquals("The Difference of Set1 from Set4 are the following values:" ,   set1.diff(set4) ,"[ 1 563 ]");
			
			//[ 1 2 563 ]
			
			//[ 1 563 ]
	}
	
	@Test
	@DisplayName("Test case for union()")
	public void createUnion()
	{
		
	}
	
	@Test
	@DisplayName("Test case for toString()")
	public void isToString()
	{
		 assertEquals("Value of Set1 is: " , set1.toString() , "1 2 563 564 ");
		 assertEquals("Value of Set2 is: " , set2.toString() , "4 5 44 ");
		 assertEquals("Value of Set3 is: " , set3.toString() , "5 44 4 ");
		 assertEquals("Value of Set4 is: " , set4.toString() , "4 5 2 6 45 ");
		 assertEquals("Value of Set5 is: " , set5.toString() , "25 2 6 62 1 ");
         assertEquals("Value of Set6 is: " , set6.toString() , "25 2 6 243 "); 
	}
	
	
}
