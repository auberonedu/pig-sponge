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

    // System.out.println(spongeCaseSingle("spongebob"));
    // System.out.println(spongeCase("WHAT is UP my dude"));
  }

  public static String spongeCase(String sentence) {
    String[] wordArray = sentence.split(" ");

    String spongeSentence = "";

    for(String words : wordArray){
      spongeSentence += spongeCaseSingle(words);
      spongeSentence += " ";
    }

    spongeSentence = spongeSentence.substring(0, spongeSentence.length()-1);

    return spongeSentence;
  }

  private static String spongeCaseSingle(String word){

    String wordUpperCase = word.toUpperCase();
    char[] characters = wordUpperCase.toCharArray();
    
    for(int i = 0; i < characters.length; i+=2){
      characters[i] = Character.toLowerCase(characters[i]); 
      
      }
      return new String(characters);
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