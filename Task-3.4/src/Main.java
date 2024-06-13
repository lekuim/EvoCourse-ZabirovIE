import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sin = new Scanner(System.in);

        System.out.println("Введите имя первого пользователя");
        String name1 = sin.nextLine();
        System.out.println("Введите возраст первого пользователя");
        Integer age1 = Integer.parseInt(sin.nextLine());
        User User1 = new User(name1, age1);
        System.out.println("Введите имя второго пользователя");
        String name2 = sin.nextLine();
        System.out.println("Введите возраст второго пользователя");
        Integer age2 = sin.nextInt();
        User User2 = new User(name2, age2);
        System.out.println(User1.getAge() <= User2.getAge() ? User1.toString() : User2.toString());
    }
}