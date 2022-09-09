public class Main {

        // Домашнее задание 1
        // Задание 1
    public static void task1() {

        int purpose = 2_459_000;
        double totalSavings = 0;
        int sumInvesting = 29_000;
        int month = 0;
        double interestOnTheDeposit = 1.01;
        while (totalSavings < purpose) {

            totalSavings += sumInvesting * interestOnTheDeposit;
            month ++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        System.out.println();
    }

        // задание 2
    public static void task2() {

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }
        // Задание 3
    public static void task3() {

        long countryY = 12_000_000;
        int birthChildOneYear = 17;
        int deathChildOneYear = 8;
        long growthOfPeopleOneYear = (birthChildOneYear - deathChildOneYear) * (countryY / 1000);
        long sizeCountry = 0;

        for (int i = 1; i < 11; i++) {
            sizeCountry = growthOfPeopleOneYear + countryY;
            countryY += sizeCountry;
            System.out.println("Год " + i + ", численность населения составляет " + sizeCountry);
        }
        System.out.println();
    }

            // Домашнее задание 2
            // Задание 1

    public static void task4() {

        int purpose = 12_000_000;
        long sumDeposit = 15000;
        double percentInMonth = 1.07;

        for (int month = 1; sumDeposit < purpose; month++) {
            sumDeposit = (long) (sumDeposit * percentInMonth);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sumDeposit + " рублей");
        }
        System.out.println();
    }

            // Задание 2
    public static void task5() {

        int purpose = 12_000_000;
        long sumDeposit = 15000;
        double percentInMonth = 1.07;

        for (int month = 1; sumDeposit < purpose; month++) {
            sumDeposit = (long) (sumDeposit * percentInMonth);
            if (month % 6 ==0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sumDeposit + " рублей");
            }
        }
        System.out.println();
    }

            // Задание 3
    public static void task6() {

        long sumDeposit = 15000;
        double percentInMonth = 1.07;
        int termSavings = 12 * 9;

        for (int month = 1; month < termSavings; month++) {
            sumDeposit = (long) (sumDeposit * percentInMonth);
            if (month % 6 ==0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sumDeposit + " рублей");
            }
        }
        System.out.println();
    }

            // Задание 4
    public static void task7() {

        int firstFriday = 5;
        for (int day = firstFriday; day <= 31; day += 7) {
            firstFriday = day;
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();
    }

            // Домашнее задание 3
            // задание 1
    public static void task8() {

        int currentYear = 2022;
        int minYears = currentYear - 200;
        int maxYears = currentYear + 100;

        for (int year = 0; year < maxYears; year += 79) {
            if (year > minYears)
                System.out.println(year);
        }
        System.out.println();
    }

    public static void task9() {

        int number = 2;
        int table = 0;
        for (int i = 1; i < 11; i++) {
            table = number * i;
            System.out.println(number + "*" + i + "=" + table);
        }
    }
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();

    }
}