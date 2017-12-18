package task1;

public class Main {
    public static void main(String[] args) {
        Word[] words = new Word[]{new Word("mother")};
        Sentence[] sentences = new Sentence[]{new Sentence(words)};
        Text text = new Text(sentences);

        text.addSentence(new Sentence(new Word[]{new Word("perfect")}));
        System.out.println(text);
        System.out.println(" заголовок текста: "  + text.getHeader());
    }
}
