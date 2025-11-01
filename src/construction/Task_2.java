package construction;

/*
Задание 2. Инициализация и изменение значения
Цель: Понять, как можно изменять значение переменной после её инициализации.

Задание:
Объявите переменную типа int с именем counter и присвойте ей значение 10.
Выведите её значение.
Затем увеличьте значение на 5 и снова выведите.
После этого уменьшите значение вдвое (используя деление) и выведите результат.
 */
public class Task_2 {
    public static void main(String[] args) {
        int counter = 10;
        System.out.println(counter);
        counter = counter + 5;
        System.out.println(counter);
        counter = counter / 2;
        System.out.println(counter);
    }
}
