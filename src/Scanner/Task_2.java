package Scanner;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Year;
/*
Задача 2: «Калькулятор возраста» (Работа с числами)
Цель: Научиться считывать целые числа и производить с ними вычисления.
Условие: Напишите программу, которая:
Запрашивает у пользователя его год рождения.
Считывает год (целое число).
Вычисляет и выводит возраст пользователя, исходя из текущего 2024 года (или получите текущий год программно для усложнения).
Пример работы:
text
Введите ваш год рождения: 1995
Вам 29 лет.
 */
public class Task_2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Введите ваш год рождения: ");
        int age = a.nextInt();
        int currentYear = LocalDate.now().getYear();
        System.out.println("Вам " + (currentYear - age) + " лет");
    }
}
