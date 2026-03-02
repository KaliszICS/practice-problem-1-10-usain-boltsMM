/**
 * Lesson: String Manipulation
 * Author: Mr. Kalisz
 * Date Created: Feb 26, 2026
 * Date Last Modified: Feb 26, 2026
 */


class Notes {
	public static void main(String[] args) {

		//method - running a bunch of for a singular purpose by using a command
		//The returned copy does not alter the original variable

		String bString;
		
		//var.toUpperCase() - makes the string all uppercase letters

		bString = "hello";
		bString.toUpperCase();
		System.out.println(bString);

		String aString = bString.toUpperCase();
		System.out.println(aString);
		System.out.println(bString);

		//var.toLowerCase()

		bString = "HeLLo";

		bString = bString.toLowerCase();
		System.out.println(bString);

		//var.length - gives you the length of the string in integer form
		bString = "Hello World";
		System.out.println(bString.length());

		// var.trim() - removes all leading and trailing whitespace

		bString = "a   Hello. ";
		System.out.println(bString.trim());

		//var.substring() - creates a substring(partial string) of the original string

		//indexes - locations in a Strings, start at 0


		bString = "Hello World";
		//H e l l o   w o r l d
		//0 1 2 3 4 5 6 7 8 9 10

		//var.substring(start, end) - start is inclusive, end is exclusive
		//length of the new substring is always the end-start
		
		System.out.println(bString.substring(2, 9));

		//var.substring(start) - this will go from the start index to the end of the string
		System.out.println(bString.substring(9));

		// \n - newline character

		bString = "\n";

		// \ - escape character - changes the functionality of the following character

		// \t - tab

		// \" - removes the functionality to end a string with the quotation mark

		// \\

		System.out.println("\" \\");

		//var.contains(String) - does the var have the String inside it
		//true when it does, false otherwise

		bString = "Hello World";
		System.out.println(bString.contains("hello"));

		//var.endsWith(String) - true when the var ends with the string
		System.out.println(bString.endsWith("d"));

		//var.startWith(String)

		//var.
		//Of(String) - return the index of the FIRST occurance of the string

		System.out.println(bString.indexOf("ell"));

		//var.lastIndexOf(String)

		//var.replaceAll(StringToReplace, StringThatReplaces)

		System.out.println(bString.replaceAll("l", "o"));
		System.out.println(bString);
	}
}
