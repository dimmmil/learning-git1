package myfirstproject;

public class Myfirstclass {

    private boolean Value;

    public static void main(String[] args) {
        System.out.println("hello world");
        sayHello("Milanka");
        sayGoodBye("Milanka");


        boolean flag = true;

        if (flag == true)

        {
            System.out.println("Value of flag is true");
        }
        else

        {
            System.out.println("value of flag is false");
        }

    }



    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public Myfirstclass(boolean value) {
        Value = value;
    }

    public static void sayGoodBye(String name) {
        //one line comment
        /*
        more lines comment
         */
        System.out.println("Good bye " + name);
        //TODO: add support for multible users
    }
}
