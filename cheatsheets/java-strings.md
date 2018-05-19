# Java Strings

## String Literals

In Java, Strings are objects. This means they have their own properties and methods that we can use.

Usually we have to use the `new` operator to create a new object, but Java lets us create new Strings by just typing some text between `"double quotation marks"`. We aren't declaring a variable here - we are typing a literal value.

```java
// This is a variable of type String
String myString;

// The double-quoted text is a String literal
// Usually we use string literals to assign variable values
String exampleString = "Example String";

// We can also create a String this way, but then
// how would we put characters in it without a String literal?
String newString = new String();

// Notice how we can create a string and call its length method
// This shows that we are creating an object
int myStringLength = "This is a string".length();
```

## Common String Methods

TODO: Add Examples

```java
int length()
char charAt(int index)
String substring(int startPosition)
String substring(int startPosition, int endPosition)
int indexOf(char searchCharacter)
int indexOf(String searchString)
```
