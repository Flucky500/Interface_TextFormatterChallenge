package pl.pasko;

import java.util.Locale;

public class ToLower implements TextFormatter {

    private String text;

    public ToLower(String text) {
        this.text = text;
    }

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
