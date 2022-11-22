package sait.mms.managers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

import sait.mms.problemdomain.Movie;

public class MovieManagementSystem {
	private Scanner keyboard = new Scanner(System.in);;
	private ArrayList<Movie> movies;
	public final static String TEXT_FILE = "res/movies.txt";
	
	
	
	public MovieManagementSystem() throws FileNotFoundException{
		movies = new ArrayList<>();
	}
	
	public void displayMenu() throws IOException {
		loadMovies();
		while(true) {
		System.out.println("Movie Management system");
		System.out.println("1	Add New Movie and Save");
		System.out.println("2	Generate List of Movies Released in a Year");
		System.out.println("3	Generate List of Random Movies");
		System.out.println("4	Save & Exit");
		System.out.println("Enter an option");
		int a = keyboard.nextInt();
		if (a==1) {
			System.out.println("Enter duration : ");
			int duration = keyboard.nextInt();
			System.out.println("Enter Movie title : ");
			String title = keyboard.next();
			System.out.println("Enter year : ");
			int year = keyboard.nextInt();
			addMovie(duration, title, year);
		}else if(a==2) {
			System.out.println("Enter Year : ");
			int year = keyboard.nextInt();
			generateMoviesInYear​(year);
			
		}else if(a==3) {
			System.out.println("Enter Number of Movies : ");
			int count = keyboard.nextInt();
			generateRandomMovies​(count);
			
		}else if(a==4) {
			writeMoviesToFile();
			System.out.println("Success Save");
			System.out.println("Bye~");
			break;
		}else {
			System.out.println("No option!!");
		}
	}
}
		
	
	public void addMovie(int duration, String title, int year) {
		if(duration <=0) {
			System.out.println("error:duration");
			return;
		}else if (title.isEmpty())  {
			System.out.println("error:title");
			return;
		}else if (year<=0) {
			System.out.println("error:year");
		}
		movies.add(new Movie(duration,title,year));
		System.out.println("Success save!!");
	}
	
	public void generateMoviesInYear​(int year) {
		
		int totalDuration=0;
		for(Movie movie: movies) {
			int duration=movie.getDuration();	
			String title=movie.getTitle();
			int totalyear= movie.getYear();
			if (year == totalyear) {
				totalDuration+=duration;
				System.out.println(duration +","+title+","+year);
				
			}
		}	System.out.println("Total Duration :"+ totalDuration);
		
	}
	
	public void loadMovies() throws FileNotFoundException {
        Scanner sc = new Scanner(new File(TEXT_FILE));
        
        while (sc.hasNextLine()){
          String line = sc.nextLine();
          String[] splitLine = line.split(",");
          int duration = Integer.parseInt(splitLine[0]);
          String title= splitLine[1];
          int year = Integer.parseInt(splitLine[2]);
          Movie newMovie = new Movie(duration, title, year);
          movies.add(newMovie);
        }
               
	}
	public void generateRandomMovies​(int count) {
			int totalDuration=0;
			for(int i=0; i<count; i++) {
				int radomnum = (int)(Math.random()*movies.size());
				int radomDuration =movies.get(radomnum).getDuration();
				String radomTitle =movies.get(radomnum).getTitle();
				int radomYear=movies.get(radomnum).getYear();
				totalDuration+=radomDuration;
				System.out.println(radomDuration+radomTitle+radomYear);
			}System.out.println("Total Duration :"+ totalDuration);
	}	

	public void writeMoviesToFile() throws IOException{
		
//		 File file = new File("C:\\Users\\dudak\\Desktop\\spartacoding\\school\\Assignment1Skeleton\\Assignment1\\res\\test1.txt");

		 try(FileWriter fout= new FileWriter("res/test2.txt")) {
			    PrintWriter out = new PrintWriter(fout);
			    for( Movie movie:movies ) {
			        out.println(movie);
			    }
			}
		 
		 //		try
//		{
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("res/test1.txt"));
//			
//			for(Movie movie:movies) {
//				oos.writeObject(movie.getDuration());//자동 toString. 메모리 위치를 알려줌. 
//				oos.writeObject(movie.getTitle());//자동 toString. 메모리 위치를 알려줌. 
//				oos.writeObject(movie.getYear());//자동 toString. 메모리 위치를 알려줌. 
//				oos.close();
//			}
//		} catch (Exception ex)
//		{
//
}
	}



