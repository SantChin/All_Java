package com.san.interviewprgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//A comparable object is capable of comparing itself with another object.
//The class itself must implements the java.lang.Comparable interface to compare its instances.

class Movie implements Comparable<Movie> {

	private String name;
	private int year;
	private double rating;

	public Movie() {
		super();
	}

	public Movie(String name, double rating, int year) {
		super();
		this.name = name;
		this.year = year;
		this.rating = rating;
	}

	// Used to Sort Movies by year
	@Override
	public int compareTo(Movie m) {
		//return this.year - m.year; // Sorting by Year Ascending
		return this.name.compareTo(m.name); // Sorting by Name
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", year=" + year + ", rating=" + rating + "]";
	}

}

public class ComparableExample {

	public static void main(String[] args) {

		// List Of Movies
		ArrayList<Movie> list = new ArrayList<Movie>();

		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));
		list.add(new Movie("Avengers", 8.4, 1983));

		//Comparator c = Collections.reverseOrder(); //For Sorting In reverse Order
		Collections.sort(list);

		System.out.println("Movies after sorting : ");

		for (Movie movie : list)
			System.out.println(movie.toString());

	}
}
