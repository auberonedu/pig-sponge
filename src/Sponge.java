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
     * 1. split the sentence into words
     * 2. create an empty string to store the result
     * 3. for each work in the sentence:
     *    - create a empty string to hold the modified version
     *    - set a flag isLower to true so we know when to use lower and upper case.
     * 
     *    for each letter in word:
     *    - if islower is true, then chage to lowercase
     *    - if islower is false, then change to uppercase
     *    - flip the islower flag for the next letter
     * 4. remove the extra space
     */
    
     // Split the sentences into words
    String[] words = sentence.split(" ");
    String result = "";

    // Loop through each word
    for (String word : words) {
      result += spongeSingleWord(word);
      result += " ";
    }
    
    // Remove the extra space at the end
    result = result.substring(0, result.length() - 1);

    return result;
  }
  private static String spongeSingleWord(String word) {
    String newWord = "";

    boolean lower = true;

    for (char letter : word.toCharArray()) {
      if (lower) {
        // Adding the lowercase version of the letter
        newWord += Character.toLowerCase(letter);
      } else {
        // Adding the uppercase version of the letter
        newWord += Character.toUpperCase(letter);
      }
    lower = !lower;
    }
    return newWord;
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