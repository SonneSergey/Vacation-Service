package ru.netology.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Объявление класса
public class VacationServiceTest {

    // Сценарий 1: Заработок 10,000, Расходы 3,000, Порог 20,000
    @Test
    public void testCalculateMonthsOfRestScenario1() {
        VacationService service = new VacationService(10000, 3000, 20000);

        // Вызов метода calculateRestMonths для получения количества месяцев отдыха
        int result = service.calculateRestMonths();

        // Ожидаемое количество месяцев отдыха
        assertEquals(3, result);
    }

    // Сценарий 2: Заработок 100,000, Расходы 60,000, Порог 150,000
    @Test
    public void testCalculateMonthsOfRestScenario2() {
        VacationService service = new VacationService(100000, 60000, 150000);

        // Вызов метода calculateRestMonths для получения количества месяцев отдыха
        int result = service.calculateRestMonths();

        // Ожидаемое количество месяцев отдыха
        assertEquals(2, result);
    }

    // Сценарий 3: Заработок 10,000, Расходы 9,000, Порог 20,000
    @Test
    public void testCalculateMonthsOfRestScenario3() {
        VacationService service = new VacationService(10000, 9000, 20000);

        // Вызов метода calculateRestMonths для получения количества месяцев отдыха
        int result = service.calculateRestMonths();

        // Ожидаемое количество месяцев отдыха
        assertEquals(0, result);
    }

    // Сценарий 4: Заработок 100,000, Расходы 80,000, Порог 150,000
    @Test
    public void testCalculateMonthsOfRestScenario4() {
        VacationService service = new VacationService(100000, 90000, 150000);

        // Вызов метода calculateRestMonths для получения количества месяцев отдыха
        int result = service.calculateRestMonths();

        // Ожидаемое количество месяцев отдыха
        assertEquals(0, result);
    }
}
