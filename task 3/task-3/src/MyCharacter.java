public class MyCharacter {
    private final char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char charValue() {
        return value;
    }

    public int compareTo(MyCharacter anotherCharacter) {
        return this.value - anotherCharacter.value;
    }

    public boolean equals(Object anotherCharacter) {
        if(this == anotherCharacter) return true;
        if(anotherCharacter == null || getClass() != anotherCharacter.getClass()) return false;
        MyCharacter that = (MyCharacter) anotherCharacter;
        return value == that.value;
    }

    public boolean isDigit() {
        return isDigit(this);
    }

    public static boolean isDigit(MyCharacter ch) {
        if (ch == null) return false;
        char c = ch.charValue();
        return c >= '0' && c <= '9';
    }

    public static boolean isLetter(MyCharacter ch) {
        if (ch == null) return false;
        char c = ch.charValue();
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static boolean isLetterOrDigit(MyCharacter ch) {
        return isLetter(ch) || isDigit(ch);
    }
}