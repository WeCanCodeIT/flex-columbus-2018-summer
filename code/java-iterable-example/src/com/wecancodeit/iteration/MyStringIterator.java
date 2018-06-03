package com.wecancodeit.iteration;

import java.util.Iterator;
import java.util.List;

// This class exists exclusively to iterate over items in MyStringIterable
public class MyStringIterator implements Iterator<String> {
	
	// We need a collection to iterate
	private List<String> privateCollection;
	
	// We need to keep track of which item we are on
	private int currentItemIndex = 0;
	
	// Our iterator accepts a collection, which it will iterate
	public MyStringIterator(List<String> privateCollection) {
		this.privateCollection = privateCollection;
	}
	
	// We need to implement this method as defined by the Iterator interface
	// This determines if there are any items remaining to iterate
	@Override
	public boolean hasNext() {
		return currentItemIndex < privateCollection.size();
	}

	// We need to implement this method as defined by the Iterator interface
	// This is where the iteration happens: we return the next item, then bump
	// our current index up one so next time we will return the next item
	@Override
	public String next() {
		String nextItem = this.privateCollection.get(currentItemIndex);
		this.currentItemIndex++;
		return nextItem;
	}

}
