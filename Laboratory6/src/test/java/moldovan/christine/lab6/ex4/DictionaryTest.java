package moldovan.christine.lab6.ex4;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DictionaryTest {
    @Test
    void TestDictionary() {
        Dictionary dictionary = new Dictionary();
        dictionary.addWord(new Word("someName"), new Definition("someDefinition"));
        dictionary.addWord(new Word("otherName"), new Definition("otherDefinition"));
        dictionary.addWord(new Word("somethingNew"), new Definition("newDefinition"));

        assertEquals(new Definition("someDefinition"), dictionary.getDefinition(new Word("someName")));

        HashSet<Word> expected = new HashSet<>();
        expected.add(new Word("someName"));
        expected.add(new Word("otherName"));
        expected.add(new Word("somethingNew"));

        assertEquals(expected, dictionary.getAllWords());

        ArrayList<Definition> definitions = new ArrayList<>();
        definitions.add(new Definition("someDefinition"));
        definitions.add(new Definition("newDefinition")); //??
        definitions.add(new Definition("otherDefinition"));

        assertEquals(definitions, dictionary.getAllDefinition());

    }
}
