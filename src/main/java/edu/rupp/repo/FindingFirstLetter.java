package edu.rupp.repo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FindingFirstLetter extends CountriesList{
	//method
	public static String findFirstLetterHasLargestNumCountries(Map<String, Set<String>> countries) {
    	 Set set = countries.entrySet();
         Iterator iterator = set.iterator();
         Integer tmp=0;
         String firstLetterHasLargestCon = "";
         Integer largeSize = findFirstLetterBySize(countries,1);
         while(iterator.hasNext()) {
            Integer numCounties=0;
            Map.Entry mentry = (Map.Entry)iterator.next();           
            Set<String> hset =  new HashSet<String>();
            
            hset = (Set<String>) mentry.getValue();
            numCounties = hset.size();
            if(numCounties == largeSize){
            	firstLetterHasLargestCon = (String) mentry.getKey();
                System.out.println("\nThe first letter has largest number of countries is "+firstLetterHasLargestCon);
                getCountriesByFirstLetter(countries, firstLetterHasLargestCon);
            }
         }
         return firstLetterHasLargestCon;
    }
	
	public static void findFirstLetterHasLeastNumCountries(Map<String, Set<String>> countries) {		
   	 	Set set = countries.entrySet();
        Iterator iterator = set.iterator();
        Integer tmp=0;
        String firstLetterHasLeastCon = "";
        Integer leastSize = findFirstLetterBySize(countries,2);
        while(iterator.hasNext()) {
           Integer numCounties=0;
           Map.Entry mentry = (Map.Entry)iterator.next();          
           Set<String> hset =  new HashSet<String>();
           
           hset = (Set<String>) mentry.getValue();
           numCounties = hset.size();
           if(numCounties == leastSize){
        	   firstLetterHasLeastCon = (String) mentry.getKey();
               System.out.println("\nThe first letter has least number of countries is "+firstLetterHasLeastCon);
               getCountriesByFirstLetter(countries, firstLetterHasLeastCon);
           }           
        }
    }
	
	public static Integer findFirstLetterBySize(Map<String, Set<String>> countries, Integer type) {
   	 	Set set = countries.entrySet();
        Iterator iterator = set.iterator();
        Integer tmp=0;
        while(iterator.hasNext()) {
           Integer numCounties=0;
           Map.Entry mentry = (Map.Entry)iterator.next();          
           Set<String> hset =  new HashSet<String>();
           
           hset = (Set<String>) mentry.getValue();
           numCounties = hset.size();
           if(type == 1){//Large Countries
        	   if(numCounties > 0 && tmp < numCounties){
        		   tmp = numCounties;
        	   }
           }else if(type == 2){//Least Countries
        	   if(numCounties > 0 && tmp == 0){
	        	   tmp = numCounties;
	           }else if(numCounties > 0 && tmp > 0 && tmp >= numCounties){
	        	   tmp = numCounties;
	           }
           }	           
        }
        return tmp;
    }
	//end method	
}
