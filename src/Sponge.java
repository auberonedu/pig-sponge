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
    // new sentence string
    String finishedSentence = "";
    // split up sentence by words
    String[] words = sentence.split(" ");


    // loop through the word
    for (String word : words){
      
      finishedSentence += convertSpongeCase(word);
      finishedSentence += " ";

    }
    
    // return new sentence string
    return finishedSentence.trim();
  }

  public static String convertSpongeCase(String word) {
    String finishedWord = "";
    for(int i = 0; i < word.length(); i++){
      char letter = word.charAt(i);
      if (i == 0){
        letter = Character.toLowerCase(letter);
      } else if (i == 1){
        letter = Character.toUpperCase(letter);
      } else if (i % 2 == 0 || i == 0){
        letter = Character.toLowerCase(letter);
      } else {
        letter = Character.toUpperCase(letter);
      }
      finishedWord += letter;

    }

    // alternate sponge case
    return finishedWord;
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