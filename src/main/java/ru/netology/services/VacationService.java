package ru.netology.services;

public class VacationService {

    public static void main(String[] args) {
        VacationService service = new VacationService();

        // Первый сценарий
        int monthlyIncome1 = 10000; // Заработок
        int monthlyExpenses1 = 3000; // Обязательные расходы
        int vacationThreshold1 = 20000; // Порог для отдыха
        int vacationMonths1 = service.calculateVacationMonths(monthlyIncome1, monthlyExpenses1, vacationThreshold1);
        System.out.println("Количество месяцев отпуска для первого сценария: " + vacationMonths1);

        // Второй сценарий
        int monthlyIncome2 = 100000; // Заработок
        int monthlyExpenses2 = 60000; // Обязательные расходы
        int vacationThreshold2 = 150000; // Порог для отдыха
        int vacationMonths2 = service.calculateVacationMonths(monthlyIncome2, monthlyExpenses2, vacationThreshold2);
        System.out.println("Количество месяцев отпуска для второго сценария: " + vacationMonths2);
    }

    public int calculateVacationMonths(int monthlyIncome, int monthlyExpenses, int threshold) {
        int balance = 0;
        int vacationMonths = 0;

        for (int month = 0; month < 12; month++) {

            // Обновление баланса пользователя после учета его доходов и расходов за месяц:
            balance += monthlyIncome - monthlyExpenses;

            // Проверяем достиг ли баланс установленного порога:
            if (balance >= threshold) {

                // Увеличение количества месяцев отпуска:
                vacationMonths++;

                // Снятие порога с баланса:
                balance -= threshold;

                // Делим на 3 для расчета расходов во время отпуска
                int vacationExpense = threshold / 3;

                // Вычет расходов на отпуск:
                balance -= vacationExpense;
            }
        }
        return vacationMonths;
    }
}
