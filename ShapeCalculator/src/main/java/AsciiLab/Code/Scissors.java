package AsciiLab.Code;

public class Scissors extends Hand{

    public Scissors(String name, String ascii){
        super(name, ascii);
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
