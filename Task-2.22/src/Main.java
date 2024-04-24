import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //💡- Ввести с консоли дату в формата: 31.12.2020, сохранить ее в переменной класса Date (преобразовав введенную строку с использованием SimpleDateFormat)
        //
        //💡- Увеличить дату на 45 дней и вывести на экран
        //
        //💡- Сдвинуть дату на начало года и вывести на экран
        //
        //💡- Увеличить дату на 10 рабочих дней (считаем субботы и воскресенья выходными) и вывести на экран
        //
        //💡- Ввести с консоли вторую дату в том же формате и сохранить ее в другой переменной класса Date
        //
        //💡- Посчитать количество рабочих дней (субботы и воскресенья - выходные) между первой и второй датами введенными с консоли и вывести на экран

        Scanner sin = new Scanner(System.in);
        System.out.print("Введите дату в формате dd.MM.yyyy:");
        String str1 = sin.nextLine();
        SimpleDateFormat init = new SimpleDateFormat("dd.MM.yyyy");
        Date date = null;
        try {
            date = init.parse(str1);

        } catch (ParseException e) {
            System.out.println("Неверный формат даты!(Верный формат: 'дд.мм.гггг')");
        }
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        gc.add(Calendar.DATE, 45);
        System.out.println("Дата после увеличения на 45 дней: " + init.format(gc.getTime()));

        gc.set(Calendar.DATE, 1);
        gc.set(Calendar.MONTH, 0);
        System.out.println("Дата после сдвига на начало года: " + init.format(gc.getTime()));

        gc.setTime(date);
        int workDays = 10;
        int c = 0;
        while (c < workDays) {
            gc.add(Calendar.DATE, 1);
            if (!(gc.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || gc.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
                c++;
            }
        }
        System.out.println("Дата после увеличения на 10 рабочих дней: " + init.format(gc.getTime()));


        System.out.print("Введите дату в формате dd.MM.yyyy:");
        String str2 = sin.nextLine();
        Date date2 = null;
        try {
            date2 = init.parse(str2);

        } catch (ParseException e) {
            System.out.println("Неверный формат даты!(Верный формат: 'дд.мм.гггг')");
        }
        GregorianCalendar gc2 = new GregorianCalendar();
        gc.setTime(date);
        gc2.setTime(date2);
        c = 0;
        if (gc.before(gc2)) {
            gc.setTime(date2);
            gc2.setTime(date);
        }
        while (gc.get(Calendar.DATE) != gc2.get(Calendar.DATE)) {
            gc2.add(Calendar.DATE, 1);
            if (!(gc2.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || gc2.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
                c++;
            }
        }
        System.out.println("Количество рабочих дней между введенными датами: " + c);
    }
}