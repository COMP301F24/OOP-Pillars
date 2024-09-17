package AsciiLab.Code;

public class Rock extends Hand {

    public Rock(String name, String ascii){
        super(name, ascii);
    }

    @Override
    public boolean equals(Object other) {
        return (other instanceof Rock);
    }

    @Override
    public boolean firstPlayerWins(Hand other) {
        return (other instanceof Scissors);
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
