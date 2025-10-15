package Variables;
/*
Задача 2: Конвертер валют
Условие: Напишите программу для конвертации суммы в долларах США в евро.
Создайте переменную usdAmount для хранения суммы в долларах и переменную exchangeRate для хранения
курса обмена (например, 1 USD = 0.92 EUR). Рассчитайте и выведите сумму в евро.

Цель: Практика работы с переменными типа double и арифметическими операциями.ъ

Комментарий: Для финансовых расчетов, где важна точность, в реальных приложениях лучше использовать тип BigDecimal, но для простоты здесь используется double.

 */
public class Task_2 {
    public static void main(String[] args) {
        double usdAmount = 100;
        double exchangeRate = 0.92;
        double evroAmount = usdAmount*exchangeRate;
        System.out.println("Сумма в евро составляет " + evroAmount + " евро");

    }
}
