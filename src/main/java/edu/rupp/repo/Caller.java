package edu.rupp.repo;

import java.util.Map;
import java.util.Set;

public class Caller extends FindingFirstLetter{
	public static void main(String[] args) {
		Map<String, Set<String>> tmap = getCounties();
        
        System.out.println("\n------------finding firstLetter which has the largest number of countries and display it-----------");
        findFirstLetterHasLargestNumCountries(tmap);
        
        System.out.println("\n------------finding firstLetter which has the least number of countries and display it-----------");
        findFirstLetterHasLeastNumCountries(tmap);
	}
	
}
