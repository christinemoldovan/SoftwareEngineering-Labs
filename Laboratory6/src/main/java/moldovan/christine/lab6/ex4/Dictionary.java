package moldovan.christine.lab6.ex4;

import java.util.*;

public class Dictionary {
    HashMap<Word, Definition> dictionary = new HashMap<>();

    public void addWord(Word w, Definition d) {
        dictionary.put(w, d);

    }

    public Definition getDefinition(Word w) {
        return dictionary.get(w);
    }

    public Set<Word> getAllWords() {
        return dictionary.keySet();
    }

    public ArrayList<Definition> getAllDefinition() {
        return new ArrayList<>(dictionary.values());
    }

}
