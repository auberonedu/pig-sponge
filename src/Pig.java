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
        // This splits the sentence in to words
        String[] words = sentence.split(" ");
        // Stores the pigLatin words
        String result = "";
    
        // Iterates over each word in the words array
        for (String word : words) {
          // Calls the method to convert current word to pigLatin
          result += pigLatinSingleWord(word);
          // Result as string with a space to separate words
          result += " ";
        }
    
        // This removes the space at the end of the result string
        result = result.substring(0, result.length() - 1);
        return result;
      }

    // I got helped here form the interviewer for declaring a private static method.
    private static String pigLatinSingleWord(String word) {
        // Used boolean to check if vowel is found in word
        boolean isVowel = false;
        // Initialize an integer to iterate through characters
        int i = 0;
        // Chose a for-loop to iterate each character of the word
        for(i = 0; i < word.length(); i++) {
            // Checks if character found in string "aeiou"
            if("aeiou".indexOf(word.charAt(i)) != -1) {
                isVowel = true;
                break;
            }
        }
        // Ternary condition
        // if isVowel is true, it evaluates to word
        // if false, it evaluates after the colon
        // Substring method helps with separating word to the i(first vowel's index)
        // The substrings are then concatenated with String "ay"
        return isVowel ? word : word.substring(i) + word.subSequence(0, i) + "ay";
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
  
  