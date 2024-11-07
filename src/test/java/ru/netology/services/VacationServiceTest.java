package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @Test
    public void testCalculateVacationMonthsScenario1() {
        VacationService service = new VacationService();
        // Расчет для первого сценария
        int result = service.calculateVacationMonths(10000, 3000, 20000);
        // Ожидаем 3 месяца отпуска
        assertEquals(3, result);
    }

    @Test
    public void testCalculateVacationMonthsScenario2() {
        VacationService service = new VacationService();
        // Расчет для второго сценария
        int result = service.calculateVacationMonths(100000, 60000, 150000);
        // Ожидаем 2 месяца отпуска
        assertEquals(2, result);
    }

}
