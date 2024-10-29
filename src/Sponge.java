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
    /*
     * Accept a string in a form of a word or sentence
     * Pass in the string in a for loop and go over every single character
     * Start with character at index 0 and leave it default
     * Go to the next character and capitalize it 
     * Repeat until the program creates a desired output
     */
    String output = "";
    char c = 0;
    boolean capital = true;
    
    for (int i = 0; i < sentence.length(); i++) {
      c = sentence.charAt(i);
      if (c == ' ') {
        capital = true;
      } else {
        capital = !capital;
      }
      
      if (!capital) {
        c = Character.toLowerCase(c);
      } else if (capital) {
        c = Character.toUpperCase(c);
      } else {
        output += sentence.charAt(i);
      }
      
      output += c;
    }

    System.out.println(output);
    return output;
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