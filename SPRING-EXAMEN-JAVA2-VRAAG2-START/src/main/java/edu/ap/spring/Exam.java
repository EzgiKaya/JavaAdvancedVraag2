package edu.ap.spring;

import java.awt.Point;
import java.util.*;
import org.springframework.stereotype.Component;

@Component
public class Exam {
	
	// Maak gebruik van lambdas en streams om een array met alle
	// priemgetallen terug te geven
	// 2 punten
	public int[] getPrimes(int[] numbers) {
		return Arrays.stream(numbers).filter(i -> isPrime(i)).toArray();
	}

	// methode voor vergemakkelijking - ezgi
	public static boolean isPrime(int number) {
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// Maak gebruik van lambdas en streams alle lowercase characters
	// te tellen in de gegeven string
	// 1 punt
	public int countLowercaseCharacters(String string) {
        return (int)string.chars().filter(c -> Character.isLowerCase(c)).count();
	}
	
	// Maak gebruik van lambdas en streams om de som van alle
	// x-coordinaten uit de lijst van points te berekenen
	// 1 punt
	public int sumOfX(List<Point> points) {
	    return points
                .stream()
                .map( p -> p.getX())
                .mapToInt(x -> x.intValue() )
                .reduce((x,y) -> x+y).getAsInt();
	}
	
	// Maak gebruik van lambdas en streams om een comma-separated
	// string te maken die alle x-coordinaten bevat die groter of gelijk 
	// zijn aan twee
	// 2 punten
	public String getXOverTwo(List<Point> points) {


	    return points.stream()
                .map(p -> p.getX())
                .filter( x -> x > 2)
                .map( x -> x.toString())
                .reduce((x, y) -> x + "," + y)
                .toString();
	}
}
