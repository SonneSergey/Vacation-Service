package ru.netology.services;

// Объект, который будет выполнять расчет количества месяцев отдыха для фрилансера
public class VacationService {
    private int income; // доход
    private int expenses; // расходы
    private int threshold; // порог накоплений

    // Конструкктор класса
    public VacationService(int income, int expenses, int threshold) {
        this.income = income;
        this.expenses = expenses;
        this.threshold = threshold;
    }

    // Метод calculateRestMonths
    public int calculateRestMonths() {
        // Количество месяцев отдыха
        int vacationMonths = 0;
        // Начальный баланс
        int balance = 0;

        // Цикл for для расчета по месяцам
        for (int month = 1; month <= 12; month++) {
            // Информация о текущем месяце
            System.out.print("Месяц " + month + ". Денег " + balance + ". ");

            // Проверяем, может ли фрилансер отдыхать
            if (balance >= threshold) {
                System.out.println("Буду отдыхать.");
                // Потраченные деньги
                balance -= expenses;
                // Допустим, на отдых фрилансер тратит остаток
                if (balance >= expenses) {
                    System.out.println("Потратил -" + expenses + ", затем ещё -" + (balance - expenses));
                    // Потраченные деньги
                    balance -= (balance - expenses);
                }

                // Увеличиваем количество месяцев отдыха
                vacationMonths++;
            } else {
                System.out.println("Придётся работать.");
                // Заработок за месяц
                balance += income;
                // Потраченные деньги
                balance -= expenses;
            }
            // Вывод текущего состояния после операций
            System.out.println("Заработал +" + income + ", потратил -" + expenses + ", осталось " + balance);
        }
        // Вывод общего количества месяцев отдыха
        System.out.println("Всего месяцев отдыха: " + vacationMonths);

        // Возвращаем количество месяцев отдыха
        return vacationMonths;
    }

    // Различные случаи с фиксированными значениями дохода, расходов и порога накоплений.
    public static void main(String[] args) {
        System.out.println("Ситуация 1: Заработок 10.000, Расходы 3.000, Порог 20.000");
        VacationService scenario1 = new VacationService(10000, 3000, 20000);
        scenario1.calculateRestMonths();

        System.out.println("\n Ситуация 2: Заработок 100.000, Расходы 60.000, Порог 150.000");
        VacationService scenario2 = new VacationService(100000, 60000, 150000);
        scenario2.calculateRestMonths();
    }
}