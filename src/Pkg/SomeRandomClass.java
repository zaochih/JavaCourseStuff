package Pkg;

public class SomeRandomClass {

    public static void main () {

        Phone p1 = new Phone();

        p1.brand = "Apple";
        p1.price = 114514.1919810;

        IO.println(p1.brand);
        IO.println(p1.price);

        p1.call();
        p1.play();

        int a = Integer.parseInt(IO.readln("Please input an integer a: "));
        int b = Integer.parseInt(IO.readln("Please input an integer b: "));

        String string = IO.readln("Please input a string: ");

        IO.println(string + " a + b = " + (a + b));
    }

}
