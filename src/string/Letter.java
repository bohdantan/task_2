package string;

/**
 * This class is for letters or numerals.
 */
public class Letter extends Symbol{
    public Letter(char c) {
        super(c);
        if (!Symbol.isLetter(c))
            throw new IllegalArgumentException();
    }
}
