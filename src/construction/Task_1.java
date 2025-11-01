package construction;

/*
Задание 1. Объявление и вывод переменных
Цель: Научиться объявлять переменные разных типов и выводить их значения.
Задание:
Создайте класс VariablesDemo. В методе main объявите следующие переменные:
int age = 25;
double price = 19.99;
char grade = 'A';
boolean isActive = true;
String name = "Алиса";
Выведите каждую переменную на экран с поясняющим текстом, например:
Имя: Алиса
Возраст: 25
и т.д.
 */
public class Task_1 {
    public static void main(String[] args) {
        int age = 25;
        double price = 19.99;
        char grade = 'A';
        boolean isActive = true;
        String name = "Алиса";
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Уровень: " + grade);
        System.out.println("Стоимость: " + price);
        if (isActive == true) {
            System.out.println("Наличие: да");
        } else {
            System.out.println("Наличие: нет");
        }
    }
}
