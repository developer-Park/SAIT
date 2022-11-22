package sait.mms.runners;

import java.io.*;

import sait.mms.managers.*;

/**
 * Runner class for implementing the menu functionality of the MovieManagementSystem.
 * @author Nick Hamnett
 * @version Aug 4, 2021
 */
public class MovieManagementSystemMenuRunner {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		MovieManagementSystem mms = new MovieManagementSystem();
		
		/*
		 * Loads movies from the supplied text file.
		 */
//		mms.loadMovies();
//		
		
		/*
		 * Expected input/output:
		 * Movie Management system
		 * 1	Add New Movie and Save
		 * 2	Generate List of Movies Released in a Year
		 * 3	Generate List of Random Movies
		 * 4	Save & Exit
		 * 
		 * Enter an option: <input>1</input>
		 * 
		 * Enter duration: <input>100</input>
		 * Enter movie title: <input>We are Gold</input>
		 * Enter year: <input>2019</input>
		 * Saving movies... 
		 * Added movie to the data file.
		 */
		mms.displayMenu();
		

		//
		
		/*
		 * Expected input/output:
		 * Movie Management system
		 * 1	Add New Movie and Save
		 * 2	Generate List of Movies Released in a Year
		 * 3	Generate List of Random Movies
		 * 4	Save & Exit
		 * 
		 * Enter an option: <input>2</input>
		 * 
		 * Enter in year: <input>1996</input>
		 * 
		 * Movie List
		 * Duration	Year	Title
		 * 103		1996	DragonHeart
		 * 93		1996	Trainspotting
		 * 145		1996	Independence Day
		 * Total duration: 341 minutes
		 */
		//mms.displayMenu();
		//
		
		/*
		 * Possible input/output:
		 * Movie Management system
		 * 1	Add New Movie and Save
		 * 2	Generate List of Movies Released in a Year
		 * 3	Generate List of Random Movies
		 * 4	Save & Exit
		 * 
		 * Enter an option: <input>3</input>
		 * 
		 * Enter number of movies: 5
		 * 
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
		//mms.displayMenu();
		//
		
		/*
		 * Expected input/output:
		 * Movie Management system
		 * 1	Add New Movie and Save
		 * 2	Generate List of Movies Released in a Year
		 * 3	Generate List of Random Movies
		 * 4	Save & Exit
		 * 
		 * Enter an option: <input>4</input>
		 * 
		 * Saving movies... 
		 * Movie list saved successfully!
		 * Goodbye!
		 */
		//mms.displayMenu();
		//
		
		/*
		 * Expected input/output:
		 * Movie Management system
		 * 1	Add New Movie and Save
		 * 2	Generate List of Movies Released in a Year
		 * 3	Generate List of Random Movies
		 * 4	Save & Exit
		 * 
		 * Enter an option: <input>5</input>
		 * 
		 * Invalid option! Please try again.
		 */
		//mms.displayMenu();
		//

	}

}
