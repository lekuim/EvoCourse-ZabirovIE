import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //💡- Сделать задание 4.3. с использованием классов Date и SimpleDateFormat и их соответствующих методов.
        Scanner sin = new Scanner(System.in);
        System.out.println("Введите дату в формате 'дд.мм.гггг'");
        String str = sin.nextLine();
        SimpleDateFormat init = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date d = init.parse(str);
            SimpleDateFormat newDf = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(newDf.format(d));
        } catch (ParseException e) {
            System.out.println("Неверный формат даты!(Верный формат: 'дд.мм.гггг')");
        }

    }
}