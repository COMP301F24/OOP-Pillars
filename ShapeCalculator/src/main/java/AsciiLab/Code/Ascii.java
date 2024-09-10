package AsciiLab.Code;

public class Ascii {
    private String ascii;

    public Ascii(String ascii){
        this.ascii = ascii;
    }

    public String toString(){
        return this.getAscii();
    }

    public String getAscii(){
        return this.ascii;
    }


}
