package ru.netology.services;

public class VacationService {

    public static void main(String[] args) {
        VacationService service = new VacationService();

        // Первый сценарий
        int monthlyIncome1 = 10000;
        int monthlyExpenses1 = 3000;
        int vacationMonths1 = service.calculateScenario1(monthlyIncome1, monthlyExpenses1);
        System.out.println("Количество месяцев отдыха (Сценарий 1): " + vacationMonths1);

        // Второй сценарий
        int monthlyIncome2 = 100000;
        int monthlyExpenses2 = 60000;
        int vacationMonths2 = service.calculateScenario2(monthlyIncome2, monthlyExpenses2);
        System.out.println("Количество месяцев отдыха (Сценарий 2): " + vacationMonths2);
    }

    public int calculateScenario1(int monthlyIncome, int monthlyExpenses) {
        int count = 0;
        int money = 0;

        for (int month = 1; month <= 12; month++) {
            System.out.print("Месяц " + month + ". Денег " + money + ". ");

            // Месяцы отдыха
            if (month == 4 || month == 7 || month == 11) {

                // Сумма порога для отдыха
                if (money >= 20000) {
                    System.out.println("Буду отдыхать.");
                    count++;

                    // Ежемесячные расходы
                    money -= 3000;

                    // Дополнительные расходы на отдых
                    money -= (month == 4 ? 12000 : month == 7 ? 11334 : 15778);
                } else {
                    System.out.println("Придётся работать.");
                    money += monthlyIncome; // Заработок
                    money -= monthlyExpenses; // Ежемесячные расходы
                }
            } else {
                System.out.println("Придётся работать.");
                money += monthlyIncome; // Заработок
                money -= monthlyExpenses; // Ежемесячные расходы
            }

            System.out.println("Заработал +" + monthlyIncome + ", потратил -" + monthlyExpenses);
        }

        return count;
    }

    public int calculateScenario2(int monthlyIncome, int monthlyExpenses) {
        int count = 0;
        int money = 0;

        for (int month = 1; month <= 12; month++) {
            System.out.print("Месяц " + month + ". Денег " + money + ". ");

            // Месяцы отдыха
            if (month == 5 || month == 9) {

                // Сумма порога для отдыха
                if (money >= 150000) {
                    System.out.println("Буду отдыхать.");
                    count++;

                    // Ежемесячные расходы
                    money -= monthlyExpenses;

                    // Дополнительные расходы на отдых
                    money -= (month == 5 ? 66667 : 62222);
                } else {
                    System.out.println("Придётся работать.");
                    money += monthlyIncome; // Заработок
                    money -= monthlyExpenses; // Ежемесячные расходы
                }
            } else {
                System.out.println("Придётся работать.");
                money += monthlyIncome; // Заработок
                money -= monthlyExpenses; // Ежемесячные расходы
            }

            System.out.println("Заработал +" + monthlyIncome + ", потратил -" + monthlyExpenses);
        }

        return count;
    }
}
