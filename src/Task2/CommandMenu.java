package Task2;

import java.util.*;

public class CommandMenu {

    private Scanner scanner = new Scanner(System.in);
    private Map<String,String> map = new HashMap<>();

    public void start()
    {
        boolean exit =false;
        String action;

        do {
            System.out.println(map.entrySet());
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

        System.out.println("Введите Login пользователя, который нужно поменять: ");
        String login = scanner.nextLine();
        System.out.println("Введите новый  Login пользователя: ");
        String newLogin = scanner.nextLine();
        String password = map.get(login);
        map.remove(login);
        map.put(newLogin,password);
        System.out.printf("Login пользователя %s успешно изменен \n", login);
    }

    private void checkUser() {

       System.out.println("Введите логин для проверки: ");
       String login = scanner.nextLine();
       if (map.containsKey(login))
       {
           System.out.println("Логин существует");
       }
       else
       {
           System.out.println("Такого логина нет");

       }
    }

    private void delOldUser() {

        System.out.println("Введите Login пользователя, которого нужно удалить: ");
        String login = scanner.nextLine();
        Iterator<Map.Entry<String,String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext())
        {
            Map.Entry<String,String> entry = entryIterator.next();
            if (entry.getKey().equals(login))
            {
                entryIterator.remove();
            }
        }
        System.out.printf("Пользователь %s успешно удален", login);
    }

    private void addNewUser() {

        System.out.println("Введите Login: ");
        String login = scanner.nextLine();
        if (map.containsKey(login))
        {
            System.out.println("Пользователь с таким логином существует");
            return;
        }
        System.out.println("Введите пароль; ");
        String password = scanner.nextLine();
        User user = new User(login, password);

        map.put(user.getLogin(),user.getPassword());
        System.out.println("Пользователь успешно добавлен\n");
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
