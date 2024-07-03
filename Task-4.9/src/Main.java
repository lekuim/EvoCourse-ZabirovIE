import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        System.out.println("Введите число a");
        double a = Double.parseDouble(sin.nextLine());
        System.out.println("Введите число b");
        double b = Double.parseDouble(sin.nextLine());

        Calculator add = new Calculator(new Adder());
        System.out.println("Результат сложения a и b: " + add.calc(a, b));

        Calculator sub = new Calculator(new Substractor());
        System.out.println("Результат вычитания a и b: " + sub.calc(a, b));

        Calculator mul = new Calculator(new Multiplier());
        System.out.println("Результат умножения a и b: " + mul.calc(a, b));

        Calculator div = new Calculator(new Divider());
        System.out.println("Результат деления a и b: " + div.calc(a, b));
    }
}