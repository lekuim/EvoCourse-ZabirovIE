import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<User> array = new ArrayList<>();
        Scanner sin = new Scanner(System.in);
        for (int i = 1; i < 6; ++i) {
            System.out.printf("Введите имя пользователя %d\n", i);
            String name = sin.nextLine();
            System.out.printf("Введите возраст пользователя %d\n", i);
            int age = Integer.parseInt(sin.nextLine());
            array.add(new User(name, age));
        }

        Collections.sort(array, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (User i : array) {
            System.out.println(i.toString());
        }
    }
}