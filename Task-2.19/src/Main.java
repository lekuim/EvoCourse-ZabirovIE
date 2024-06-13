import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);
        int a, b, c;
        System.out.println("Введите 3 числа");
        try {
            a = sin.nextInt();
            b = sin.nextInt();
            c = sin.nextInt();
        } catch (Exception e) {
            System.out.println("НЕВЕРНЫЙ ВВОД!");
            return;
        }
        String res = "";
        res += a % 5 == 0 ? "a=" + a + ", " : "";
        res += b % 5 == 0 ? "b=" + b + ", " : "";
        res += c % 5 == 0 ? "c=" + c + ", " : "";
        System.out.println(!res.isEmpty() ? res.substring(0, res.length() - 2) : "нет значений, кратных 5");
        System.out.println("Результат целочисленного деления a на b: " + a / b);
        System.out.println("Результат деления a на b: " + a / (double) b);
        System.out.println("Результат деления a на b с округлением в большую сторону: " + (int) Math.ceil(a / (double) b));
        System.out.println("Результат деления a на b с округлением в меньшую сторону: " + Math.floorDiv(a, b));
        System.out.println("Результат деления a на b с математическим округлением: " + Math.round(a / (double) b));
        System.out.println("Остаток от деления b на c: " + b % c);
        System.out.println("Наименьшее значение из a и b: " + Integer.min(a, b));
        System.out.println("Наибольшее значение из b и c: " + Integer.max(b, c));
    }
}