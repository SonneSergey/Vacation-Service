package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
    public void testCalculateScenario1() {
        VacationService service = new VacationService();

        // Сценарий 1. Входные данные
        int monthlyIncome = 10000;
        int monthlyExpenses = 3000;

        // Ожидаемое количество месяцев отдыха
        int expectedVacationMonths = 3;

        // Вычисление количества месяцев отдыха
        int actualVacationMonths = service.calculateScenario1(monthlyIncome, monthlyExpenses);

        // Проверка результата
        Assertions.assertEquals(expectedVacationMonths, actualVacationMonths, "Количество месяцев отдыха не совпадает.");
    }

    @Test
    public void testCalculateScenario2() {
        VacationService service = new VacationService();

        // Сценарий 2. Входные данные
        int monthlyIncome = 100000;
        int monthlyExpenses = 60000;

        // Ожидаемое количество месяцев отдыха
        int expectedVacationMonths = 2;

        // Вычисление количества месяцев отдыха
        int actualVacationMonths = service.calculateScenario2(monthlyIncome, monthlyExpenses);

        // Проверка результата
        Assertions.assertEquals(expectedVacationMonths, actualVacationMonths, "Количество месяцев отдыха не совпадает.");
    }
}
