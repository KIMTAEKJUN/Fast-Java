package ch03;

public class StringTextBlock {
    public static void main(String[] args) {
        String textBlock = """
                Hello,
                hi,
                How are you ?""";
        System.out.println(textBlock);
        System.out.println(getBlockOfHtml());
    }

    public static String getBlockOfHtml() {
        return """
                <html>
                    <body>
                        <span>example text</span>
                    </body>
                </html>""";
    }
}
