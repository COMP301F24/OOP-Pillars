package Polymorphism;

import People.*;

public class Main {
    public static void main(String[] args){
        Professor prairie1 = new Professor("prairie");
        Person prairie2 =  prairie1;

        Professor prairie3 = new Professor("prairie");
        Person prairie4 = (Person) prairie1;

    }

    public static String example1(){
        String retval = "";

        Person jane = new Person("Jane");


        if (jane instanceof Professor) {
            retval += "foo";
        }


        if (jane instanceof Student) {
            retval += "bar";
        }


        if (jane instanceof Person) {
            retval += "!";
        }
        return retval;
    }
    
    public static String pollEv1(){
        String retval = "";
        Student hanna = new Student("hanna");


        if (hanna instanceof Student) {
            retval += "foo";
        }


        if (hanna instanceof Person) {
            retval += "bar";
        }

        return retval;
    }

    public static String pollEv2(){
        String retval = "";
        Person prg = new Professor("prg");


        if (prg instanceof Professor) {
            retval += "foo";
        }


        if (prg instanceof Student) {
            retval += "bar";
        }


        if (prg instanceof Person) {
            retval += "!";
        }
        return retval;
    }

    public static void pollEv3(){

        Student hanna = new Student("hanna");
        Person prairie = new Professor("Prairie");

        Person hanna2 = (Person) hanna;// 1)


        Professor prairie2 = (Professor) prairie;// 2)


        Student prairie3 = (Student) prairie;// 3)


    }

    public static void pollEv5(){
        Person chloe = new Professor("chloe");
        ((Professor)chloe).promote(); // Promote to "Associate"
        ((Professor)chloe).promote(); // Promote to "Full"
        System.out.println(((Professor)chloe).getStatus());

    }




}
