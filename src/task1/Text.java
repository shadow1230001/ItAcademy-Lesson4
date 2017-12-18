package task1;

import java.util.Arrays;

public class Text {  //агрегация ,так как 1 состоит из другога,наследование не нид.
    private Sentence[] sentences = null;
    private String header=null;

   public  Text(Sentence[] sentences) {
        this.sentences = sentences;
        this.header = header;
    }


    void addSentence(Sentence sentence) {
        Sentence[] sentences = new Sentence[this.sentences.length + 1];
        for (int i = 0; i < this.sentences.length; i++) {
            sentences[i] = this.sentences[i];
        }
        sentences[this.sentences.length] = sentence;
        this.sentences = sentences;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Arrays.equals(sentences, text.sentences);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(sentences);
    }

    @Override
    public String toString() {
        return "Text{" +
                "sentences=" + Arrays.toString(sentences) +
                '}';
    }

}

