package AsciiLab.Code;

public class Hand extends Ascii{
    private String name;

    public Hand(String name, String ascii){
        super(ascii);
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name + "\n" + super.toString();
    }
}
