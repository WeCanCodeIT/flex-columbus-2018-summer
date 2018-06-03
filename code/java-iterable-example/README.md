# Better Iterator

This project contains two examples of iterables in action.

MyStringIterable wraps a collection (an `ArrayList<String>`) and iterates over its items. Each iterator returned from the iterable will start with the first item and iterate one-by-one through the items.

MySquareIterable is an infinite iterable. Its iterator will return the mathematical square of whatever number is currently being iterated, starting at 1. All iterators returned by MySquareIterable are on the same index at all times, as the index is tracked by the iterable instead of the iterator.

Each file in this project is well-commented, so dig in for implementation details!