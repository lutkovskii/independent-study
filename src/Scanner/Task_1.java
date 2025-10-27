package Scanner;

import java.util.Scanner;

/*
Задача 1: «Привет, пользователь!» (Базовая)
Цель: Научиться считывать строку и выводить её.
Условие: Напишите программу, которая:
Запрашивает у пользователя его имя.
Считывает введённое имя.
Выводит приветствие в формате: "Привет, [имя]!".
Пример работы:
text
Введите ваше имя: Алексей
Привет, Алексей!
 */
public class Task_1 {
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = txt.nextLine();
        System.out.println("Привет " + name);
        txt.close();
    }

}
