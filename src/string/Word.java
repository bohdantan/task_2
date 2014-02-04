package string;

import java.util.ArrayList;

/**
 * This class is for words
 */
public class Word implements Lexeme{
    private ArrayList<Letter> w = new ArrayList<Letter>();

    public Word() {
    }

    public Word(String s) {
        for (int i = 0; i < s.length(); ++i) {
            w.add(new Letter(s.charAt(i)));
        }
    }

    public void add(Letter l) {
        w.add(l);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Letter l : w) {
            sb.append(l);
        }
        return sb.toString();
    }
}
