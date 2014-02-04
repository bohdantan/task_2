package string;

import java.util.ArrayList;

/**
 * This class is for sentences.
 */
public class Sentence {
    private ArrayList<Lexeme> se = new ArrayList<Lexeme>();

    public Sentence() {
    }

    public Sentence(String s) {
        int wordBegin = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (Symbol.isPunctuationMark(s.charAt(i))) {
                if (wordBegin < i)
                    se.add(new Word(s.substring(wordBegin, i)));
                se.add(new PunctuationMark(s.charAt(i)));
                wordBegin = i + 1;
                if (Symbol.isEndMark(s.charAt(i)))
                    return;
            } else if (!Symbol.isLetter(s.charAt(i))) {
                if (wordBegin < i)
                    se.add(new Word(s.substring(wordBegin, i)));
                wordBegin = i + 1;
            }
        }
        if (wordBegin < s.length())
            se.add(new Word(s.substring(wordBegin, s.length())));
    }

    public void add(Lexeme l) {
        se.add(l);
    }

    public int wordsNumber() {
        int n = 0;
        for (Lexeme l : se) {
            if (l instanceof Word)
                ++n;
        }
        return n;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < se.size(); ++i) {
            if ((se.get(i) instanceof Word) && i > 0)
                sb.append(' ');
            sb.append(se.get(i));
        }
        return sb.toString();
    }
}
