package org.howard.edu.lsp.assignment5.test;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;

//import org.howard.edu.lsp.assignment5.implementation;
public class Driver 
{
	public static void main(String[] args)
    {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        IntegerSet set3 = new IntegerSet();
        IntegerSet set4 = new IntegerSet();
        IntegerSet set5 = new IntegerSet();
        IntegerSet set6 = new IntegerSet();
        IntegerSet set7 = new IntegerSet();

       
        //ISEMPTY? METHOD BEFORE INSERTION
        System.out.println("isEmpty Method (Before Insertion):\n");
        System.out.println("Currently is the Set1 Empty ? (true/false): " + set1.isEmpty());
        System.out.println("Currently is the Set2 Empty ? (true/false): " + set2.isEmpty());
        System.out.println("Currently is the Set3 Empty ? (true/false): " + set3.isEmpty());
        System.out.println("Currently is the Set4 Empty ? (true/false): " + set4.isEmpty());
        System.out.println("Currently is the Set5 Empty ? (true/false): " + set5.isEmpty());
        System.out.println("------------------------------");

        
        //ADD METHOD BEFORE INSERTION
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
	         System.out.println("\t" + "Inserting '8' into Set5.");
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
        
         //ISEMPTY? METHOD AFTER INSERTION
        System.out.println("isEmpty Method (After Insertion):\n");
        System.out.println("Currently is the Set1 Empty ? (true/false): " + set1.isEmpty());
        System.out.println("Currently is the Set2 Empty ? (true/false): " + set2.isEmpty());
        System.out.println("Currently is the Set3 Empty ? (true/false): " + set3.isEmpty());
        System.out.println("Currently is the Set4 Empty ? (true/false): " + set4.isEmpty());
        System.out.println("Currently is the Set5 Empty ? (true/false): " + set5.isEmpty());
        System.out.println("Currently is the Set6 Empty ? (true/false): " + set6.isEmpty());
        System.out.println("------------------------------");
        
       
      
        //LENGTH METHOD
        System.out.println("Length Method:\n");
        System.out.println("The length of Set1 is: " + set1.length());
        System.out.println("The length of Set2 is: " + set2.length());
        System.out.println("The length of Set3 is: " + set3.length());
        System.out.println("The length of Set4 is: " + set4.length());
        System.out.println("The length of Set5 is: " + set5.length());
        System.out.println("------------------------------");
        
        //TOSTRING METHOD AFTER INSERTION
        System.out.println("toString Method:\n");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        System.out.println("Value of Set3 is: " + set3.toString());
        System.out.println("Value of Set4 is: " + set4.toString());
        System.out.println("Value of Set5 is: " + set5.toString());
        System.out.println("Value of Set6 is: " + set6.toString());
        System.out.println("------------------------------");
        
        
        //LARGEST METHOD
        System.out.println("Largest Method:\n");
        try 
    	{
        	  System.out.println("The Largest Number Set1 is: " + set1.largest()); 
              System.out.println("The Largest Number Set2 is: " + set2.largest());
              System.out.println("The Largest Number Set3 is: " + set3.largest());
              System.out.println("The Largest Number Set4 is: " + set4.largest());
              System.out.println("The Largest Number Set5 is: " + set5.largest());
              System.out.println("The Largest Number Set6 is: " + set6.largest());
              System.out.println("The Largest Number Set7 is: " + set7.largest());
    	}
    	catch(Exception e)
    	{
    		System.out.println("Error!" + e);
    	}
        System.out.println("------------------------------");
        
        
        //SMALLEST METHOD
        System.out.println("Smallest Method:\n");
        try
        {
        System.out.println("The Smallest Number Set1 is: " + set1.smallest());
        System.out.println("The Smallest Number Set2 is: " + set2.smallest());
        System.out.println("The Smallest Number Set3 is: " + set3.smallest());
        System.out.println("The Smallest Number Set4 is: " + set4.smallest());
        System.out.println("The Smallest Number Set5 is: " + set5.smallest());
        System.out.println("The Smallest Number Set6 is: " + set6.smallest());
        System.out.println("The Smallest Number Set7 is: " + set7.smallest());
        }
        catch(Exception e)
    	{
    		System.out.println(e);
    	}
        System.out.println("------------------------------");
        
        
        //REMOVE METHOD
        System.out.println("Remove Method:\n");
        System.out.println("Removing '564' From Set1");
        set1.remove(564);
        System.out.println("Removing '44' From Set2");
        set2.remove(44);
        System.out.println("Removing '44' From Set3");
        set3.remove(44);
        System.out.println("Removing '45' From Set4");
        set4.remove(45);
        System.out.println("Removing '62' From Set5");
        set5.remove(62);
        System.out.println("Removing '243' From Set6");
        set6.remove(243);
        System.out.println("------------------------------");
        
        
        //CONTAINS METHOD 
        System.out.println("Contains Method:\n");
        System.out.println("Does Set1 contain '564' (true/false): " + set1.contains(564));
        System.out.println("Does Set2 contain '4' (true/false): " + set2.contains(4));
        System.out.println("Does Set3 contain '44' (true/false): " + set3.contains(44));
        System.out.println("Does Set4 contain '5' (true/false): " + set4.contains(5));
        System.out.println("Does Set5 contain '26' (true/false): " + set5.contains(26));
        System.out.println("Does Set6 contain '564' (true/false): " + set6.contains(564));
        System.out.println("------------------------------");
        
        //TOSTRING METHOD AFTER REMOVING 1 ELEMENT FROM EACH SET
        System.out.println("toString Method (After Removal of an Element):\n");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        System.out.println("Value of Set3 is: " + set3.toString());
        System.out.println("Value of Set4 is: " + set4.toString());
        System.out.println("Value of Set5 is: " + set5.toString());
        System.out.println("Value of Set6 is: " + set6.toString());
        System.out.println("------------------------------");
        
        
        //EQUALS METHOD
        System.out.println("Equals Method:\n");
        System.out.println("Does Set1 equal Set2(true/false): " + set1.equals(set2));
        System.out.println("Does Set2 equal Set3(true/false): " + set2.equals(set3));
        System.out.println("Does Set5 equal Set6(true/false): " + set5.equals(set6));
        System.out.println("Does Set4 equal Set2(true/false): " + set4.equals(set2));
        System.out.println("------------------------------");
        
        
        
        
        //System.out.println("The length of Set1 is: " + set1.length());
        //System.out.println("Value of Set1 is: " + set1.toString());
        //System.out.println("Smallest value in Set1 is: " + set1.smallest());
        //System.out.println("Largest value in Set1 is: " + set1.largest());
        
        
        
        // set1.remove(564);
        //System.out.println("After removing the element 564 the new largest element is: " + set1.largest());
        //System.out.println("Currenty is the set Empty ? (true/false): " + set1.isEmpty());

        
        //INTERSECTION METHOD
        System.out.println("Intersection Method:\n");
        System.out.println("The Intersect of Set3 and Set4 are the following values:" ); 
        set3.intersect(set4);

        System.out.println("The Intersect of Set1 and Set2 are the following values:" ); 
        set1.intersect(set2);

        System.out.println("The Intersect of Set4 and Set1 are the following values:" ); 
        set4.intersect(set1);
        
        System.out.println("The Intersect of Set2 and Set3 are the following values:" ); 
        set2.intersect(set3);
        System.out.println("------------------------------");
        
        
        //DIFFERENCE METHOD
        System.out.println("Difference Method:\n");
        
        System.out.println("The Difference of Set3 from Set4 are the following values:" ); 
        set3.diff(set4);

        System.out.println("The Difference of Set1 from Set2 are the following values:" ); 
        set1.diff(set2);

        System.out.println("The Difference of Set1 from Set4 are the following values:" ); 
        set1.diff(set4);
                     
        System.out.println("------------------------------");
        
        //CLEAR METHOD
        System.out.println("Clear Method:\n");
        System.out.println("Clearing Set2:" );
        set2.clear();
        System.out.println("Value of Set2 is: " + set2.toString());
        
        System.out.println("Clearing Set3:" );
        set3.clear();
        System.out.println("Value of Set3 is: " + set3.toString());
        
        System.out.println("Clearing Set5:" );
        set5.clear();
        System.out.println("Value of Set5 is: " + set5.toString());
        System.out.println("------------------------------");
        
        
        //ADDING BACK FOR UNION METHOD
        set2.add(4);
        set2.add(5);
        set3.add(4);
        set3.add(5);
        set5.add(2);
        set5.add(6);
        set5.add(25);
        
 
        
        
        //UNION METHOD
        System.out.println("Union Method:\n");
        System.out.println("Union of Set1 and Set2");
        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Value of Set2 is: " + set2.toString());
        set1.union(set2);	// union of set1 and set2
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());	// result of union of set1 and set2
        System.out.println("------------------------------");

        System.out.println("Union of Set2 and Set3");
        System.out.println("Value of Set2 is: " + set2.toString());
        System.out.println("Value of Set3 is: " + set3.toString());
        set2.union(set3);	// union of set2 and set3
        System.out.println("Result of union of Set1 and Set2: " + set2.toString());	// result of union of set2 and set3      
        System.out.println("------------------------------");
        
 

        System.out.println("Union of Set4 and Set5");
        System.out.println("Value of Set4 is: " + set4.toString());
        System.out.println("Value of Set5 is: " + set5.toString());
        set4.union(set5);	// union of set4 and set5
        System.out.println("Result of union of Set4 and Set5: " + set4.toString());	// result of union of set4 and set5
    }
}
