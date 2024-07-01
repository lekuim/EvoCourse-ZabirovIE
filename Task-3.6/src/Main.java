import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, List<User>> myMap = new HashMap<>();
        Scanner sin = new Scanner(System.in);
        for (int i = 1; i < 6; ++i) {

            System.out.printf("Введите имя пользователя %d\n", i);
            String name = sin.nextLine();

            System.out.printf("Введите возраст пользователя %d\n", i);
            int age = Integer.parseInt(sin.nextLine());

            if (!myMap.containsKey(age)) {
                List<User> tList = new ArrayList<>();
                tList.add(new User(name, age));
                myMap.put(age, tList);
            } else {
                myMap.get(age).add(new User(name, age));
            }
        }

        System.out.println("Введите требуемый возраст");
        int age = Integer.parseInt(sin.nextLine());
        if (myMap.containsKey(age)) {

            List<User> tList = myMap.get(age);
            Collections.sort(tList, new Comparator<User>() {
                @Override
                public int compare(User o1, User o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            for (User i : tList) {
                System.out.println(i.toString());
            }
        }
    }
}
