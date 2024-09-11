package AsciiLab.Code;

public class Rock extends Hand {

    public Rock(String name, String ascii){
        super(name, ascii);
    }

    public Rock() {
        this("Rock",
                " _.-.-.-.\n" +
                        ";_|_|_|_|_\n" +
                        "|_|_|\\__  \\\n" +
                        "|    . '  |\n" +
                        "|   (    /\n" +
                        " \\______/"
        );
    }
}
