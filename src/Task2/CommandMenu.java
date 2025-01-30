package Task2;

import java.util.*;

public class CommandMenu {

    private Scanner scanner = new Scanner(System.in);
    private Map<Integer,User> map = new HashMap<>();
    private int count = 1;
    public void start()
    {
        boolean exit =false;
        String action;

        do {
            showMenu();
            action = scanner.nextLine();
            switch (action)
            {
                case "1": {
                    addNewUser();
                    count++;
                    break;
                }
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

        System.out.println("Введите Ваш логин:");
        System.out.println(map.get(count-1).getLogin());

    }

    private void delOldUser() {

    }

    private void addNewUser() {

        System.out.println("Введите Login: ");
        String login = scanner.nextLine();
        System.out.println("Введите пароль; ");
        String password = scanner.nextLine();
        User user = new User(login, password);

        map.put(count,user);
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
