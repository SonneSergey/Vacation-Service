package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @Test
    public void testCalculateVacationMonthsScenario1() {
        VacationService service = new VacationService();
        int monthlyIncome = 10000;
        int monthlyExpenses = 3000;
        int vacationThreshold = 20000;

        int result = service.calculateVacationMonths(monthlyIncome, monthlyExpenses, vacationThreshold);

        // Ожидаемый результат: 3 месяца отпуска
        assertEquals(3, result);
    }

    @Test
    public void testCalculateVacationMonthsScenario2() {
        VacationService service = new VacationService();
        int monthlyIncome = 100000;
        int monthlyExpenses = 60000;
        int vacationThreshold = 150000;

        int result = service.calculateVacationMonths(monthlyIncome, monthlyExpenses, vacationThreshold);

        // Ожидаемый результат: 2 месяца отпуска
        assertEquals(2, result);
    }
}
