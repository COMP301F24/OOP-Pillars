package AsciiLab.Code;

public class Scissors extends Hand{

    public Scissors(String name, String ascii){
        super(name, ascii);
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof Scissors;
    }

    @Override
    public boolean firstPlayerWins(Hand other) {
        return other instanceof Paper;
    }

    public Scissors(){
        this("Scissors",
                "    .-.\n" +
                        "    | |    / )\n" +
                        "    | |   / /\n" +
                        "    | |  / /\n" +
                        " _.-| |_/ /\n" +
                        "; \\( \\   /\n" +
                        "|\\_)\\ \\  |\n" +
                        "|    ) \\ |\n" +
                        "|   (    /\n" +
                        " \\______/"
                );
    }

}
