package string;

/**
 * This class is for all symbols.
 */
public class Symbol {
    private char c;

    public Symbol(char c) {
        this.c = c;
    }

    public char getC() {
        return c;
    }

    @Override
    public String toString() {
        return Character.toString(c);
    }

    static boolean isLetter(char c) {
        return ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z' || '0' <= c && c <= '9');
    }

    static boolean isEndMark(char c) {
        return (c == '.' || c == '!' || c == '?');
    }

    static boolean isPunctuationMark(char c) {
        return (c == '.' || c == ',' || c == ':' || c == ';' || c == '!' || c == '?' || c == '-');
    }
}
