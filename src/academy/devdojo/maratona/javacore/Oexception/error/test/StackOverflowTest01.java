package academy.devdojo.maratona.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {

    }

    public static void recursiveMethod(){
        recursiveMethod();
    }
}
