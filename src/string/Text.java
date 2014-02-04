package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * This class is for texts
 */
public class Text {
    private ArrayList<Sentence> t = new ArrayList<Sentence>();

    public Text() {
    }

    public Text(String s) {
        int sentenceBegin = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (Symbol.isEndMark(s.charAt(i))) {
                t.add(new Sentence(s.substring(sentenceBegin, i + 1)));
                sentenceBegin = i + 1;
            }
        }
        if (sentenceBegin < s.length())
            t.add(new Sentence(s.substring(sentenceBegin, s.length())));
    }

    public void add(Sentence s) {
        t.add(s);
    }

    public void sortByLength() {
        Collections.sort(t, new Comparator<Sentence>() {
            @Override
            public int compare(Sentence o1, Sentence o2) {
                return Integer.compare(o1.wordsNumber(), o2.wordsNumber());
            }
        });
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t.size(); ++i) {
            if (i > 0)
                sb.append(' ');
            sb.append(t.get(i));
        }
        return sb.toString();
    }
}
