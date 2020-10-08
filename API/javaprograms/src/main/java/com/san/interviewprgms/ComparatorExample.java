package com.san.interviewprgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//We create multiple separate classes (that implement Comparator) to compare by different members.

class RatingCompare implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2) {
		if (m1.getRating() < m2.getRating())
			return -1;
		if (m1.getRating() > m2.getRating())
			return 1;
		else
			return 0;
	}
}

// Class to compare Movies by name 
class NameCompare implements Comparator<Movie> {
	public int compare(Movie m1, Movie m2) {
		return m1.getName().compareTo(m2.getName());
	}
}

public class ComparatorExample {

	public static void main(String[] args) {

		// List Of Movies
		ArrayList<Movie> list = new ArrayList<Movie>();

		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));
		list.add(new Movie("Avengers", 8.4, 1983));

		
		 // Sort by rating : (1) Create an object of ratingCompare 
        //                  (2) Call Collections.sort 
        //                  (3) Print Sorted list 
        System.out.println("Sorted by rating"); 
        RatingCompare ratingCompare = new RatingCompare(); 
        Collections.sort(list, ratingCompare); 
        for (Movie movie: list) 
            System.out.println(movie.getRating() + " " + 
                               movie.getName() + " " + 
                               movie.getYear()); 
  
  
        // Call overloaded sort method with RatingCompare 
        // (Same three steps as above) 
        System.out.println("\nSorted by name"); 
        NameCompare nameCompare = new NameCompare(); 
        Collections.sort(list, nameCompare); 
        for (Movie movie: list) 
            System.out.println(movie.getName() + " " + 
                               movie.getRating() + " " + 
                               movie.getYear()); 
  
        // Uses Comparable to sort by year 
        System.out.println("\nSorted by year"); 
        Collections.sort(list); 
        for (Movie movie: list) 
            System.out.println(movie.getYear() + " " + 
                               movie.getRating() + " " + 
                               movie.getName()+" "); 
        
        
	}
}
