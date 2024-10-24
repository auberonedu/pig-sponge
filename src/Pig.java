import java.util.List;

public class Pig {

    /*
    * Create a method that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    *
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */

   

    public static void main(String[] args) {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    // Implement your solution here!

     /* take string of words and divide into single words
    I need to take each token and look at its first letter
    for loop to grab each token individually from list
    inside loop take each token and turn into charArray
    Look at index 0 of charArray and check if starts with aeiou
    if so return token unchanged to new string
    else move first letter to end of token
    then add 'ay' to end of token
    then add altered token to new string
    return newString
    */
    public static String pigLatin(String sentence) {

            String newString = "";

            for (String word : sentence.split(" ")) {

                char letter = word.charAt(0);
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ) {
                    newString += word;
                } else {
                    String temp = word.substring(1);
                    temp = temp + letter + "ay";
                    newString += temp;
                }
                //to solve the problem regarding the extra space after the last word
                //I moved the space adding line outside my else loop
                newString += " ";

            }
            //check if newString is empty to avoid IndexOutOfBoundsException then
            if (!newString.isEmpty()) { 
                //remove space at end of newString
                newString = newString.substring(0, newString.length() - 1);
            }

        return newString;
    }



    // Method to help with testing, you do not need to read this.
    public static void assertEqual(int testNumber, String actual, String expected) {
        if (!expected.equals(actual)) {
        System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
        } else {
        System.out.println("Test " + testNumber + " passed!");
        }
    }
    }
  
  