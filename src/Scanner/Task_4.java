package Scanner;

import java.util.Scanner;

/*
Задача 4: «Регистрация пользователя» (Смешанный ввод)
Цель: Научиться последовательно считывать данные разных типов.
Условие: Напишите программу для краткой регистрации пользователя.
Запросите логин (строка).
Запросите возраст (целое число).
Запросите e-mail (строка).
Выведите все данные в отформатированном виде.
Пример работы:
text
Введите логин: java_pro
Введите возраст: 25
Введите e-mail: java_pro@example.com
 */
public class Task_4 {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String login = log.nextLine();
        System.out.println("Ваш логин: " + login);
    }
}
