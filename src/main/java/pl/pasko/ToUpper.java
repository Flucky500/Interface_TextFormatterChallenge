package pl.pasko;

public class ToUpper implements TextFormatter{

    private String text;

    public ToUpper(String text) {
        this.text = text;
    }

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
