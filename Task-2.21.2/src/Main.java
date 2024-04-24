import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //💡- Ввести строку
        //💡- Заменить в строке все слова "кака" и "бяка" на "вырезано цензурой"
        System.out.println("Введите строку");
        Scanner sin = new Scanner(System.in);
        String str = sin.nextLine();
        System.out.println(str
                .replace("кака", "вырезано цензурой")
                .replace("бяка", "вырезано цензурой"));
    }
}