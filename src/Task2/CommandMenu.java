package Task2;

import java.util.*;

public class CommandMenu {

    private Scanner scanner = new Scanner(System.in);
    private Map<Integer,String> map = new HashMap<>();
    //private Map<Integer, String> map = new HashMap<>();

    public void start()
    {
        boolean exit =false;
        String action;
//        System.out.println("Введите числа: ");
//        String name = scanner.nextLine();
//        String[] elements = name.split("\\s");
//        for (String element : elements)
//        {
//            list.add(Integer.parseInt(element));
//        }
        do {
            showMenu();
            action = scanner.nextLine();
            switch (action)
            {
                case "1": ; break;
                case "2": ; break;
                case "3": ; break;
                case "4": ; break;
                case "5": ; break;
                case "6": exit = true; break;
                default:
                    System.out.println("Введите число от 1 до 6 включительно!");
            }
        }
        while(!exit);
        scanner.close();
    }

    private void showMenu()
    {
        System.out.println("""
                1. Добавить нового пользователя;
                2. Удалить существующего пользователя;
                3. Проверить существует ли пользователь;
                4. Изменить логин существующего пользователя;
                5. Изменить пароль существующего пользователя;
                6. Завершить!""");
    }
}
