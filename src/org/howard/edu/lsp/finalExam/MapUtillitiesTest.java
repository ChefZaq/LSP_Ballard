package org.howard.edu.lsp.finalExam;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.howard.edu.lsp.finalExam.MapUtillities;
import org.junit.internal.TextListener;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import org.junit.runner.*;

public class MapUtillitiesTest 
{
	
	 private List<Error> innerErrors = new ArrayList<>();
	 private List<Error> errors = new ArrayList<>();
	@Test
	@DisplayName("Test case for The Number of Pairs")
    public void numberOfPairs()
    {
			MapUtillities hm = new MapUtillities();
	        HashMap<String, String> map1 = new HashMap<String, String>();
	        HashMap<String, String> map2 = new HashMap<String, String>();
	        HashMap<String, String> map3 = new HashMap<String, String>();
	        HashMap<String, String> map4 = new HashMap<String, String>();
	        HashMap<String, String> map5 = new HashMap<String, String>();

	        map1.put("Alice","Healthy");
	        map1.put("Mary","Ecastic");
	        map1.put("Bob","Happy");
	        map1.put("Chuck","Fine");
	        map1.put("Felix","Sick");

	        map2.put( "Felix","Healthy");
	        map2.put("Mary","Ecastic");
	        map2.put("Bob","Happy");
	        map2.put("Tam","Fine");
	        map2.put("Ricardo","Subperb");
	        
	        map5.put("Tam","Fine");
	       
		try 
		{
			try
	        {
				assertEquals(hm.commonKeyValuePairs(map1, map2),2);
				assertEquals(hm.commonKeyValuePairs(map3, map4), "NullMapException: One or both maps are null!" );
				assertEquals(hm.commonKeyValuePairs(map1, map3), "NullMapException: One or both maps are null!" );
				assertEquals(hm.commonKeyValuePairs(map1, map5),3 );
	        }
			catch(Exception e)
	        {
	            System.out.println(e);
	        }
		}
		catch (AssertionError e)
		{
			errors.add(e);
		}
    	
    }
	
	@Test
	@DisplayName("Test case for True Statements")
    public void numberOfPairsTrue()
    {
			MapUtillities hm = new MapUtillities();
	        HashMap<String, String> map1 = new HashMap<String, String>();
	        HashMap<String, String> map2 = new HashMap<String, String>();
	        HashMap<String, String> map3 = new HashMap<String, String>();
	        HashMap<String, String> map4 = new HashMap<String, String>();
	        HashMap<String, String> map5 = new HashMap<String, String>();

	        map1.put("Alice","Healthy");
	        map1.put("Mary","Ecastic");
	        map1.put("Bob","Happy");
	        map1.put("Chuck","Fine");
	        map1.put("Felix","Sick");

	        map2.put( "Felix","Healthy");
	        map2.put("Mary","Ecastic");
	        map2.put("Bob","Happy");
	        map2.put("Tam","Fine");
	        map2.put("Ricardo","Subperb");
	        
	        map5.put("Tam","Fine");
	       
		try 
			{

				try
				
		        {
					assertTrue(hm.commonKeyValuePairs(map1, map2) == 2);
					assertTrue(hm.commonKeyValuePairs(map1, map5) == 0 );
		        }
				catch(Exception e)
		        {
		            System.out.println(e);
		        }
			}
		catch (AssertionError e)
			{
				errors.add(e);
			}
		    	
	    }
	
	@Test
	@DisplayName("Test case for False Statements")
    public void numberOfPairsFalse()
    {
			MapUtillities hm = new MapUtillities();
	        HashMap<String, String> map1 = new HashMap<String, String>();
	        HashMap<String, String> map2 = new HashMap<String, String>();
	        HashMap<String, String> map3 = new HashMap<String, String>();
	        HashMap<String, String> map4 = new HashMap<String, String>();
	        HashMap<String, String> map5 = new HashMap<String, String>();

	        map1.put("Alice","Healthy");
	        map1.put("Mary","Ecastic");
	        map1.put("Bob","Happy");
	        map1.put("Chuck","Fine");
	        map1.put("Felix","Sick");
	        
	        map2.put( "Felix","Healthy");
	        map2.put("Mary","Ecastic");
	        map2.put("Bob","Happy");
	        map2.put("Tam","Fine");
	        map2.put("Ricardo","Subperb");
	        
	        map5.put("Tam","Fine");
	       
		try 
			{
				try
				
		        {
					
					assertFalse(hm.commonKeyValuePairs(map1, map2) == 3);
					assertFalse(hm.commonKeyValuePairs(map1, map5) == 45);
		        }
				catch(Exception e)
		        {
		            System.out.println(e);
		        }
			}
		catch (AssertionError e)
			{
				errors.add(e);
			}
		    	
	    }
	
	
	
	
	public static void main(String[] args) 
    {
		JUnitCore junit = new JUnitCore();
		junit.addListener(new TextListener(System.out));
		junit.run(MapUtillitiesTest.class);
   
    }
	
	
}
