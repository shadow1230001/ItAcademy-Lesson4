package lyubin.task1;

import java.util.Arrays;

public class Text {
    private Sentence[] sentences;
    private String header;

    public Text(String header) {
        this.header = header;
    }

    Text(Sentence[] sentences) {
        this.sentences = sentences;
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    @Override
    public String toString() {
        return "Text{" +
                "sentences=" + Arrays.toString(sentences) +
                ", header='" + header + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Text text = (Text) o;
        if (!Arrays.equals(sentences, text.sentences)) return false;
        return header != null ? header.equals(text.header) : text.header == null;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(sentences);
        result = 31 * result + (header != null ? header.hashCode() : 0);
        return result;
    }
}
