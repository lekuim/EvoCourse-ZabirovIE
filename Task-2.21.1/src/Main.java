import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //💡- Ввести с консоли строку, сохранить ее в строковой переменной
        //💡- Ввести с консоли подстроку, сохранить ее во второй строковой переменной
        //💡- Подсчитать сколько раз подстрока встречается в строке и вывести это значение на экран.
        Scanner sin = new Scanner(System.in);
        System.out.println("Введите строку");
        String str1 = sin.nextLine();
        System.out.println("Введите строку");
        String str2 = sin.nextLine();
        int count = (str1.length() - str1.replace(str2, "").length()) / str2.length();
        System.out.printf("Подстрока '%s' встречается %d раза", str2, count);
    }
}