package Task2;

import java.util.*;

public class CommandMenu {

    private Scanner scanner = new Scanner(System.in);
    private Map<Integer,String> map = new HashMap<>();

    public void start()
    {
        boolean exit =false;
        String action;

        do {
            showMenu();
            action = scanner.nextLine();
            switch (action)
            {
                case "1": addNewUser(); break;
                case "2": delOldUser(); break;
                case "3": checkUser(); break;
                case "4": changeLogin(); break;
                case "5": changePassword(); break;
                case "6": exit = true; break;
                default:
                    System.out.println("Введите число от 1 до 6 включительно!");
            }
        }
        while(!exit);
        scanner.close();
    }

    private void changePassword() {

    }

    private void changeLogin() {

    }

    private void checkUser() {

    }

    private void delOldUser() {

    }

    private void addNewUser() {
        map.put(1,"new user");
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
