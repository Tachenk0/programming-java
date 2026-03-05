public class nclass {
    public static void main(String[] args) {

        MyCharacter char1 = new MyCharacter('E');
        MyCharacter char2 = new MyCharacter('8');
        MyCharacter char3 = new MyCharacter('G');
        MyCharacter char4 = new MyCharacter('F');

        System.out.println("    ");
        System.out.println("char1 value: " + char1.charValue());
        System.out.println("char2 value: " + char2.charValue());
        System.out.println("char3 value: " + char3.charValue());
        System.out.println("char4 value: " + char4.charValue());
        System.out.println("    ");

        System.out.println("char1 equals char2: " + char1.equals(char2));
        System.out.println("char1 equals char3: " + char1.equals(char3));
        System.out.println("char1 equals char4: " + char1.equals(char4));
        System.out.println("    ");

        System.out.println("char1 compareTo char4: " + char1.compareTo(char4));
        System.out.println("char4 compareTo char1: " + char4.compareTo(char1));
        System.out.println("    ");

        System.out.println("char1 isDigit: " + char1.isDigit());
        System.out.println("char2 isDigit: " + char2.isDigit());
        System.out.println("char3 isDigit: " + char3.isDigit());
        System.out.println("char4 isDigit: " + char4.isDigit());
        System.out.println("    ");
        System.out.println("MyCharacter.isDigit(char1): " + MyCharacter.isDigit(char1));
        System.out.println("MyCharacter.isDigit(char2): " + MyCharacter.isDigit(char2));
        System.out.println("MyCharacter.isDigit(char3): " + MyCharacter.isDigit(char3));
        System.out.println("MyCharacter.isDigit(char4): " + MyCharacter.isDigit(char4));
        System.out.println("    ");
        System.out.println("MyCharacter.isLetter(char1): " + MyCharacter.isLetter(char1));
        System.out.println("MyCharacter.isLetter(char2): " + MyCharacter.isLetter(char2));
        System.out.println("MyCharacter.isLetter(char3): " + MyCharacter.isLetter(char3));
        System.out.println("MyCharacter.isLetter(char4): " + MyCharacter.isLetter(char4));
        System.out.println("    ");
        System.out.println("MyCharacter.isLetterOrDigit(char1): " + MyCharacter.isLetterOrDigit(char1));
        System.out.println("MyCharacter.isLetterOrDigit(char2): " + MyCharacter.isLetterOrDigit(char2));
        System.out.println("MyCharacter.isLetterOrDigit(char3): " + MyCharacter.isLetterOrDigit(char3));
        System.out.println("MyCharacter.isLetterOrDigit(char4): " + MyCharacter.isLetterOrDigit(char4));

    }
}