package src.restful.beans;

public class Comment {

    private static Long id;
    private String text;

    public Comment() {
        if (id == null) {
            id = 0L;
        }
        id += 1;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
