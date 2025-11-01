package construction;
/*
Задание 5. Практическая задача — расчёт зарплаты
Цель: Применить переменные для решения простой реальной задачи.

Задание:
Сотрудник получает почасовую оплату — 20.5 долларов в час.
Он отработал 40 часов в неделю.
Рассчитайте его недельную зарплату и месячную зарплату (считайте, что в месяце 4 недели).
Используйте переменные:

double hourlyRate
int hoursPerWeek
int weeksPerMonth
double weeklySalary
double monthlySalary
Выведите результаты в формате:
Недельная зарплата: ...
Месячная зарплата: ...
 */
public class Task_5 {
    public static void main(String[] args) {
        double hourlyRate = 20.5;
        int hoursPerWeek = 40;
        int weeksPerMonth = 4;
        double weeklySalary = hourlyRate * hoursPerWeek;
        double monthlySalary = weeklySalary * weeksPerMonth;
        System.out.println("Недельная зарплата: " + weeklySalary);
        System.out.println("Месячная зарплата: " + monthlySalary);
    }
}
