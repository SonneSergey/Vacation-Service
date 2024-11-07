package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        VacationService service = new VacationService();

        // Сценарий 1
        int monthsOfVacationForScenario1 = service.calculateVacationMonths(10000, 3000, 20000);
        System.out.println("Сценарий 1: Количество месяцев отпуска: " + monthsOfVacationForScenario1);

        // Сценарий 2
        int monthsOfVacationForScenario2 = service.calculateVacationMonths(100000, 60000, 150000);
        System.out.println("Сценарий 2: Количество месяцев отпуска: " + monthsOfVacationForScenario2);
    }
}
