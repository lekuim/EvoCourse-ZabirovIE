import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //💡- Ввести строку с датой формата: 31.12.2020
        //💡- Преобразовать строку даты в формат: 2020-12-31
        Scanner sin = new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        String str = sin.nextLine();
        String[] temp = str.split("[.]");
        System.out.printf("%s-%s-%s", temp[2], temp[1], temp[0]);
    }
}