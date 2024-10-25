import java.lang.StringBuilder;

public class Sponge {

  /*
   * Create a method that takes a string consisting of one or more words 
   * separated by spaces. It should return a new string converted to "sponge 
   * case," where each word starts with a lowercase letter, and then alternates 
   * between upper and lower case for each following letter in the word.
   *
   * Examples:
   *
   * spongeCase("spongebob")  should return "sPoNgEbOb"
   * spongeCase("Who are YOU calling A Pinhead")  should return "wHo aRe yOu cAlLiNg a pInHeAd"
   * spongeCase("WHAT is UP my dude")  should return "wHaT iS uP mY dUdE"
   * spongeCase("E")  should return "e"
   * spongeCase("e")  should return "e"
   */
  public static void main(String[] args) {
    // Test cases
    assertEqual(1, spongeCase("spongebob"), "sPoNgEbOb");
    assertEqual(2, spongeCase("Who are YOU calling A Pinhead"), "wHo aRe yOu cAlLiNg a pInHeAd");
    assertEqual(3, spongeCase("WHAT is UP my dude"), "wHaT iS uP mY dUdE");
    assertEqual(4, spongeCase("E"), "e");
    assertEqual(5, spongeCase("e"), "e");
  }

  public static String spongeCase(String sentence) {
    // Convert sentence string into a String array of words
    sentence = sentence.strip();
    String[] sentences = sentence.split(" ");

    // Create a sentence builder
    StringBuilder sentenceBuilder = new StringBuilder();

    // for each word ... 
    for (String word : sentences) {
        // ... convert to lowecase
        word = word.toLowerCase();
        
        // create a wordBuilder in which to store letters
        StringBuilder wordBuilder = new StringBuilder();

        // for each letter ...
        for (int i = 0; i < word.length(); i ++) {
          String letter = String.valueOf(word.charAt(i));
          // ...if the letter is at an odd index...
          if (i % 2 != 0) {
              // ... convert letter to uppercase
              letter = letter.toUpperCase();
          }
          // store letter in wordBuilder
          wordBuilder.append(letter);
      }
      String newWord = wordBuilder.toString();
      // Stringbuilding to concat into sentence

      sentenceBuilder.append(newWord + " ");
      // return String sentence
    }
    // convert sentence Builder to String
    String newSentence = sentenceBuilder.toString();
    newSentence = newSentence.substring(0,newSentence.length() - 1);

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