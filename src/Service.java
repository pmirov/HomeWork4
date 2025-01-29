import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Service {


    private Scanner scanner = new Scanner(System.in);
    private List<Integer> list = new ArrayList<>();

    public void start()
    {
        boolean exit =false;
        String action;
        System.out.println("Введите числа: ");
        String name = scanner.nextLine();
        String[] elements = name.split("\\s");
        for (String element : elements)
        {
            list.add(Integer.parseInt(element));
        }
        do {
            showMenu();
            action = scanner.nextLine();
            switch (action)
            {
                case "1": add(); break;
                case "2": deleteItem(); break;
                case "3":
                    System.out.println(list); break;
                case "4": checkValue(); break;
                case "5": changeValue(); break;
                case "6": exit = true; break;
                default:
                    System.out.println("Введите число от 1 до 6 включительно!");
            }
        }
        while(!exit);
        scanner.close();
    }

    private void changeValue() {
        System.out.println("Введите значение, которое нужно заменить:");
        int oldValue = scanner.nextInt();
        System.out.println("Введите значение, на которое нужно заменить:");
        int newValue = scanner.nextInt();
        scanner.nextLine();
        Iterator<Integer> arrIterator = list.iterator();
        int count = 0;
        while(arrIterator.hasNext())
        {
            Integer nextInt = arrIterator.next();
            if(nextInt.equals(oldValue))
            {
                list.set(count,newValue);
            }
            count++;
        }

    }

    private void checkValue() {
        System.out.println("Введите значение, которое нужно проверить:");
        int value = scanner.nextInt();
        scanner.nextLine();
        boolean chekValue = list.contains(value);
        if (chekValue)
            System.out.println("Значение найдено!");
        else
            System.out.println("Значение не найдено!");

    }

    private void deleteItem() {
        System.out.println("Удалите элемент: ");
        int delInt = scanner.nextInt();
        Iterator<Integer> arrIterator = list.iterator();
        while(arrIterator.hasNext())
        {
            Integer nextInt = arrIterator.next();
            if(nextInt.equals(delInt))
            {
                arrIterator.remove();
            }
        }

    }

    private void add() {
        System.out.println("Введи новый элемент:");
        list.add(Integer.parseInt(scanner.nextLine()));

    }

    private void showMenu()
    {
        System.out.println("""
                1. Добавить элемент в список;
                2. Удалить элемент из списка;
                3. Показать содержимое списка;
                4. Проверить есть ли значение в списке;
                5. Заменить значение в списке;
                6. Завершить!""");
    }

}
