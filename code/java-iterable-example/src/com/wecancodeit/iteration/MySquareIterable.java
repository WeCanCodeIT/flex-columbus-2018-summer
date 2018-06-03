package com.wecancodeit.iteration;

import java.util.Iterator;

// You could create an iterable that iterates infinitely
// If you wanted, you could have your iterator return to the beginning of a collection
// In this case, we just keep incrementing our index and returning its square
public class MySquareIterable implements Iterable<Integer> {
	
	// The current index, which will be squared
	private int currentBaseNumber = 1;

	@Override
	public Iterator<Integer> iterator() {
		return new MySquareIterator();
	}
	
	// We nest the iterator inside the iterable, so no matter how many times we
	// return a MySquareIterator, all iterators will use the same currentBaseNumber
	private class MySquareIterator implements Iterator<Integer> {
		
		@Override
		public boolean hasNext() {
			// This is an infinite iterator, so it always has a next number
			return true;
		}

		@Override
		public Integer next() {
			int squareOfCurrentNumber = currentBaseNumber * currentBaseNumber;
			currentBaseNumber++;
			return squareOfCurrentNumber;
		}

	}

}
