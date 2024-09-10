package AsciiLab;

import AsciiLab.Code.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AsciiTest {
    @Test
    void testingTheTest(){
        System.out.println("you successfully ran the test.");
    }

    @Test
    void asciiToStringTest(){
        String ascii = ":)";
        Ascii a = new Ascii(ascii);
        assertEquals(ascii, a.toString());

    }

    @Test
    public void rockTest(){
        //assertEquals(expected, actual);
        Hand rock = new Rock();
        System.out.println(rock);
        String expected = " _.-.-.-.\n;_|_|_|_|_\n|_|_|\\__  \\\n|    . '  |\n|   (    /\n \\______/";

        assertEquals(expected, rock.getAscii());
    }

    @Test
    public void paperTest(){
        //assertEquals(expected, actual);
        Hand paper = new Paper();
        System.out.println(paper);
        String expected = "        _______\n  ____(____     \\\n (________       |\n(_________       |\n (________       |\n  (___________  /";
        assertEquals(expected, paper.getAscii());
    }

    @Test
    public void scissorsTest(){
        //assertEquals(expected, actual);
        Hand scissors = new Scissors();
        System.out.println(scissors);
        String expected = "    .-.\n    | |    / )\n    | |   / /\n    | |  / /\n _.-| |_/ /\n; \\( \\   /\n|\\_)\\ \\  |\n|    ) \\ |\n|   (    /\n \\______/";
        assertEquals(expected, scissors.getAscii());
    }
}