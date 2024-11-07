package ru.netology.services;

public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {

        // Начальный баланс
        int balance = 0;
        // Подсчёт месяцев отпуска
        int vacationMonths = 0;

        // Цикл по месяцам (от 1 до 12)
        for (int month = 1; month <= 12; month++) {

            // Проверка, если баланс превышает или равен порогу, то можно отдыхать
            if (balance >= threshold) {

                // Отпуск: используем расходы, затем делим оставшуюся сумму на 3
                balance -= expenses;
                balance /= 3;

                // Увеличение количество месяцев отпуска
                vacationMonths++;
                System.out.println("Месяц " + month + ": Отдых. Баланс после трат и деления: " + balance);
            } else {

                // Работа: доход/расход
                balance += income - expenses;
                System.out.println("Месяц " + month + ": Работа. Баланс после доходов и расходов: " + balance);
            }
        }

        // Возвращаем количество месяцев отпуска
        return vacationMonths;
    }
}