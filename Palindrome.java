package week1.day2.assignments.mandatory;

public class Palindrome {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
String value = "madam";
String revvalue ="";
char[] rev = value.toCharArray();
int length =value.length();
for(int i=length-1;i>=0;i--) {
	revvalue = revvalue+rev[i];
}
	if(value.equalsIgnoreCase(revvalue))
		System.out.println(value+" is a Palindrome");
	else
		System.out.println(value+" is not a Palindrome");

	}

}
