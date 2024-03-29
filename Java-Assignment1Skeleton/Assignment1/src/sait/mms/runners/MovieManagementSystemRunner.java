package sait.mms.runners;

import java.io.*;
import java.util.*;

import sait.mms.managers.*;

/**
 * Runner class for implementing the MovieManagementSystem class.
 * @author Nick Hamnett
 * @version Aug 4, 2021
 */
public class MovieManagementSystemRunner {
	public static void main(String[] args) throws IOException {
		MovieManagementSystem mms = new MovieManagementSystem();
		
		/*
		 * Loads movies from the supplied text file.
		 */
		//mms.loadMovies();
		//
		
		/*
		 * Expected output:
		 * Added movie to the data file.
		 */
		int duration1 = 106;
		String title1 = "The Fast and the Furious";
		int year1 = 2001;
		
		mms.addMovie(duration1, title1, year1);
		//
		
		/*
		 * Expected output:
		 * Error: The movie duration should be any number greater than zero.
		 */
		int duration2 = -10;
		String title2 = "Invalid movie duration";
		int year2 = 2002;
		
		//mms.addMovie(duration2, title2, year2);
		//
		
		/*
		 * Expected output:
		 * Error: The movie title should have at least one character.
		 */
		int duration3 = 100;
		String title3 = "";
		int year3 = 2003;
		
		//mms.addMovie(duration3, title3, year3);
		//
		
		/*
		 * Expected output:
		 * Error: The release year should be any number greater than zero.
		 */
		int duration4 = 100;
		String title4 = "Invalid release year";
		int year4 = 0;
		
		//mms.addMovie(duration4, title4, year4);
		//
		
		/*
		 * Expected output:
		 * Movie List
		 * Duration	Year	Title
		 * 103		1996	DragonHeart
		 * 93		1996	Trainspotting
		 * 145		1996	Independence Day
		 * 
		 * Total duration: 341 minutes
		 */
		//mms.generateMoviesInYear​(1996);
		//
		
		/*
		 * Possible output:
		 * Movie List
		 * Duration	Year	Title
		 * 129		2016	Now You See Me 2
		 * 139		1999	Fight Club
		 * 136		2014	Captain America: The Winter Soldier
		 * 81		1995	Toy Story
		 * 103		2017	Life
		 * 
		 * Total duration: 588 minutes
		 */
		mms.generateRandomMovies​(5);
		//
		
		/**
		 * Expected output:
		 * Saving movies... 
		 * Movie list saved successfully!
		 * 
		 * 91,Minions,2015
		 * 141,Wonder Woman,2017
		 * 129,Beauty and the Beast,2017
		 * 113,Baby Driver,2017
		 * 102,Big Hero 6,2014
		 * ...
		 */
		//mms.writeMoviesToFile();
		
		//System.out.println();
		
		//Scanner fileReader = new Scanner(new File(MovieManagementSystem.TEXT_FILE));
		
		//while (fileReader.hasNextLine()) {
		//String line = fileReader.nextLine();
		//System.out.println(line);
		//}
		
		//fileReader.close();
		//
	}
}
