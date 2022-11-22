package sait.mms.runners;

import sait.mms.problemdomain.*;

/**
 * Runner class for implementing the Movie class.
 * @author Nick Hamnett
 * @version Aug 3, 2021
 */
public class MovieRunner {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Creates a Movie object using a user-defined constructor.
		 */
		int duration = 125;
		String title = "Tron: Legacy";
		int year = 2010;
		
		Movie movie = new Movie(duration, title, year);
		//
		
		// Expected output: 125
		System.out.println(movie.getDuration());
		//
		
		// Expected output: Tron: Legacy
		System.out.println(movie.getTitle());
		//
		
		// Expected output: 2010
		System.out.println(movie.getYear());
		//
		
		// Expected output: 125,Tron: Legacy,2010
		System.out.println(movie.formatForFile());
		//
		
		// Expected output: 125		Tron: Legacy	2010
		System.out.println(movie);
		//
	}

}
