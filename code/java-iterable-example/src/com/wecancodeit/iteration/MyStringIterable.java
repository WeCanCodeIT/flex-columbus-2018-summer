package com.wecancodeit.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// An iterable is basically a custom collection
// We can act upon each item one-by-one
public class MyStringIterable implements Iterable<String> {
	
	// Maintain a private collection of Strings to be iterated over
	private List<String> privateCollection = new ArrayList<String>();
	
	// Return an iterator that returns each item one-by-one
	// Check the MyStringIterator class to see how it handles this
	// We pass our private collection to the iterator for it to work with
	@Override
	public Iterator<String> iterator() {
		return new MyStringIterator(privateCollection);
	}
	
	// Allow new Strings to be added to the private collection
	public MyStringIterable insert(String newString) {
		this.privateCollection.add(newString);
		
		// Allows method chaining (see IterationApp.java)
		return this;
	}

}
