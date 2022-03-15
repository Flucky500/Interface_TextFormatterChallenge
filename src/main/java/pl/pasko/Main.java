package pl.pasko;

public class Main {

    public static void main(String[] args) {

        ToLower text = new ToLower("Putin chuj");
        System.out.println(text.formatText("Putin chuj"));

        ToUpper text2 = new ToUpper("Putin idi na chuj");
        System.out.println(text2.formatText("Putin idi na chuj"));

    }
}
