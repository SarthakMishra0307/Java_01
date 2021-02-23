public class _StringPracticeSet {
    public static void main(String[] args) {
        // Problem 1
        String name = " Sarthak Mishra";
        name = name.toLowerCase();  // yeh ek nyi string bnri h pr usi variable m store hori h bs 
        System.out.println(name);

        // Problem 2
        String text = "To convert Spaces";
        text = text.replace(" ", "_");
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Sarthak");
        System.out.println(letter);

        // Problem 4
        String myString = " This String contains  double and  triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Harry, \n\tThis Java Course is Nice.\n\t Thanks!";
        System.out.println(myLetter);







    }
}
