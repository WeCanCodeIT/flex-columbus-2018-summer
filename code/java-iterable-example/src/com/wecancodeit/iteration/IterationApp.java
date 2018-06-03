package com.wecancodeit.iteration;

import java.util.Iterator;

public class IterationApp {

	public static void main(String[] args) {
		
		// Create a new iterable... basically a custom collection
		MyStringIterable nurseryRhymeReader = new MyStringIterable();
		
		// BONUS: add all lines to the iterable with a single, multi-line statement
		// This is called "method chaining"
		// A class that allows method chaining has a "fluent API"
		// We could have done this line-by-line with individual insert() calls
		nurseryRhymeReader
			.insert("Twinkle twinkle little star")
			.insert("How I wonder what you are")
			.insert("Up above the world so high")
			.insert("Like a diamond in the sky")
			.insert("Twinkle twinkle little star")
			.insert("How I wonder what you are");
		
		// Use a "for each" loop to iterate!
		for (String line : nurseryRhymeReader) {
			System.out.println(line);
		}
		
		// Create a new iterable, this time one that would run infinitely...
		MySquareIterable mySquareIterable = new MySquareIterable();
		
		// We will print out all squares, starting with 1
		// We will stop when the square is over 9000
		int squareResult = 0;
		while (squareResult < 9000) {
			
			// Get a new iterator from the iterable
			// In this case it's OK that we create a new iterator each time
			// All iterators will be at the same position in the iterable
			Iterator<Integer> mySquareIterator = mySquareIterable.iterator();
			
			squareResult = mySquareIterator.next();
			System.out.println(squareResult);
		}

	}

}
