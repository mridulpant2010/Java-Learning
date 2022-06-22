import java.util.Scanner;
/*
A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
*/
public class JavaInput {
    // we can even use buffered Reader class instead of the scanner class.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String myString = sc.next();
        System.out.println("value of a is "+a);
        System.out.println("value of mystring is "+myString);
        sc.close();
    }
}
