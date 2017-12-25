package lyubin.task1;

import java.util.Arrays;

public class Sentence {
    private Word[] word;

    Sentence(Word[] word) {
        this.word = word;
    }

    public Word[] getWord() {
        return word;
    }

    public void setWord(Word[] word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "word=" + Arrays.toString(word) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sentence sentence = (Sentence) o;
        return Arrays.equals(word, sentence.word);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(word);
    }
}
