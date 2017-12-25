package lyubin.task1;

public class Main {
    public static void main(String[] args) {
        Word words = new Word("day");
        Sentence[] sentences = new Sentence[]{new Sentence(new Word[]{words})};
        Text text = new Text(sentences);

        System.out.println(sentences);
        System.out.println(" заголовок текста: " + text.getHeader());


    }
}
