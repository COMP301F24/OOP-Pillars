package Polymorphism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolymorphismTest {


    @Test
    void test_example1() {

    }

    @Test
    void pollEv1(){
        assertEquals("foobar", Main.pollEv1());
    }

    @Test
    void pollEv3(){
        try {
            Main.pollEv3();
        }catch(Exception e){
            assertTrue(e instanceof ClassCastException);
        }
    }

    @Test
    void pollEv5(){
        Main.pollEv5();
    }

}