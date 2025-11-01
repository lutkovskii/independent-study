package construction;

/*
Задание 4. Преобразование типов (кастинг)
Цель: Понять явное и неявное преобразование типов.

Задание:
Объявите переменную int num = 100;.
Присвойте её значение переменной типа double — это неявное преобразование.
Затем объявите переменную double bigNum = 123.456; и присвойте её значение переменной типа int
с использованием явного приведения типов ((int)).
Выведите оба результата и объясните, что произошло с дробной частью.
 */
public class Task_4 {
    public static void main(String[] args) {
        int num = 100;
        double bigNum = 123.456;
        //bigNum=(int)bigNum;
        System.out.println(num * 1.0);
        System.out.println((int)bigNum);
    }
}
