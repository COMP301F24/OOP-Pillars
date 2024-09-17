package AsciiLab.Code;

public class Paper extends Hand {
    public Paper(String name, String ascii){
        super(name, ascii);
    }

    @Override
    public boolean equals(Object other) {
        return(other instanceof  Paper);

        // This is entirely too verbose
//        if(other instanceof Paper){
//            return true;
//        }else{
//            return false;
//        }
    }

    @Override
    public boolean firstPlayerWins(Hand other) {
        return (other instanceof Rock);
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
