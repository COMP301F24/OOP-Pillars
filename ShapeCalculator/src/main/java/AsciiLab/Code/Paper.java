package AsciiLab.Code;

public class Paper extends Hand {
    public Paper(String name, String ascii){
        super(name, ascii);
    }
    public Paper() {
        this("Paper",
                "        _______\n" +
                        "  ____(____     \\\n" +
                        " (________       |\n" +
                        "(_________       |\n" +
                        " (________       |\n" +
                        "  (___________  /"
        );
    }

}
