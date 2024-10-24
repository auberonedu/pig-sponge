import java.lang.reflect.Array;

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
    public static String pigLatin(String sentence) {
        String [] words = sentence.split("\\s");
        String newSentence = ""; 
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];

            // checks if it starts with vowels
            if (currentWord.startsWith("a") || currentWord.startsWith("e") || currentWord.startsWith("i") || currentWord.startsWith("o") || currentWord.startsWith("u")) {
                newSentence += currentWord;
            } else { // no vowels means it will be changed to pig latin syntax
                String letter = currentWord.substring(0, 1);
                String restOfWord = currentWord.substring(1);
                newSentence += restOfWord + letter + "ay";
            }
            // if it's multiple words in a string this will add a space between words if it is not last word of the array
            if (i != words.length - 1) {
                newSentence += " ";
            }
        }
        return newSentence;
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
  
  