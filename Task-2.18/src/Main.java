import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String res = sin.next();
        System.out.println("Привет, " + res + "!");
    }
}