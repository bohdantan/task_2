package string;

/**
 * This class is for punctuation marks.
 */
public class PunctuationMark extends Symbol implements Lexeme{
    public PunctuationMark(char c) {
        super(c);
        if (!Symbol.isPunctuationMark(c))
            throw new IllegalArgumentException();
    }
}
