package org.howard.edu.lsp.finalExam;

import java.util.HashMap;

public class MapUtillities 
{
	 public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2)throws NullMapException 
	    {
	    // implementation
		    int count = 0;
		    if( map1.size()== 0 || map2.size()==0)//(map1 == null || map2 == null)
		    {
		        throw new NullMapException("NullMapException: One or both maps are null!");
		    }
		    else
		    {
		    	//if (map1.size() >  map2.size())
		    	
		    		if (map1.size() >=  map2.size())
			    	{
			    		for(String key: map1.keySet() )//int i = 0; i < map1.size(); i++)
				        {
				            
				            if(map1.get(key) == map2.get(key))
				            {
				                count +=1;
				            }//map2.containsValue(tempValue) && map2.containsKey(key) )
				        }
			    	}
		    	
		    	else
	    		if (map1.size() <  map2.size())
		    	{
		    		for(String key: map2.keySet() )//int i = 0; i < map1.size(); i++)
			        {
			            
			            if(map1.get(key) == map2.get(key))
			            {
			                count +=1;
			            }//map2.containsValue(tempValue) && map2.containsKey(key) )
			        }
		    	}
	    		//else
	    		{
	    			
	    		}
		       
		        
		    }
		    return count;
	    }
	
	 	public static void main(String[] args) 
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
	        //HashMap<String, String> map2


	        
	        map2.put( "Felix","Healthy");
	        map2.put("Mary","Ecastic");
	        map2.put("Bob","Happy");
	        map2.put("Tam","Fine");
	        map2.put("Ricardo","Subperb");
	        
	        map5.put("Tam","Fine");

	        try
	        {
	            System.out.println("HMap 1 is " + hm.commonKeyValuePairs(map1, map2));
	            System.out.println("HMap 2 is " + hm.commonKeyValuePairs(map3, map4));
	            System.out.println("HMap 3 is " + hm.commonKeyValuePairs(map1, map3));
	            System.out.println("HMap 4 is " + hm.commonKeyValuePairs(map1, map5));

	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	        
	        
	        
	    } 

}