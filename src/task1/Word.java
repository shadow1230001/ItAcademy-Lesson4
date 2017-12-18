package task1;

class Word {
    private String text = null;


    Word(String text) {
        this.text = text;
    }

    String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return text != null ? text.equals(word.text) : word.text == null;
    }

    @Override
    public int hashCode() {
        return text != null ? text.hashCode() : 0;
    }


    @Override
    public String toString() {
        return "Word{" +
                "text='" + text + '\'' +
                '}';
    }
}

