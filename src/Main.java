import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean isLogin = false;
        while (!isLogin) {
            System.out.print("Введите строку: ");
            Scanner src = new Scanner(System.in);

            // считываем строку с экрана
            String str = src.nextLine();

            if (str.isEmpty()) {
                System.out.println("Ошибка! Вы ничего не ввели.");
                continue;
            } else {
                User user = new User();
                try {
                    user.setLogin(str);
                    isLogin = true;
                } catch (LoginException le) {
                    System.out.println(le.getMessage() );
                    //le.printStackTrace();
                }


            }
        }
        System.out.println("Строка прошла все проверки!");
    }

}

