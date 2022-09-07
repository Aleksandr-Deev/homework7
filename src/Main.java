public class Main {

        // Домашнее задание 1
        // Задание 1
    public static void Task1() {

        int purpose = 2_459_000;
        int totalSavings = 0;
        int sumInvesting = 29_000;
        int month = 0;
        while (totalSavings < purpose) {

            totalSavings += sumInvesting;
            month ++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        System.out.println();
    }

        // задание 2
    public static void Task2() {

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
    public static void Task3() {

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

    public static void Task4() {

        long sumDeposit = 15000;
        double percentInMonth = 1.07;

        for (int i = 1; sumDeposit < 12_000_000; i++) {
            sumDeposit = (long) (sumDeposit * percentInMonth);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumDeposit + " рублей");
        }
        System.out.println();
    }

            // Задание 2
    public static void Task5() {

        long sumDeposit = 15000;
        double percentInMonth = 1.07;

        for (int i = 1; sumDeposit < 12_000_000; i++) {
            sumDeposit = (long) (sumDeposit * percentInMonth);
            if (i % 6 ==0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + sumDeposit + " рублей");
            }
        }
        System.out.println();
    }

            // Задание 3
    public static void Task6() {

        long sumDeposit = 15000;
        double percentInMonth = 1.07;
        int termSavings = 12 * 9;

        for (int i = 1; i < termSavings; i++) {
            sumDeposit = (long) (sumDeposit * percentInMonth);
            if (i % 6 ==0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + sumDeposit + " рублей");
            }
        }
        System.out.println();
    }

            // Задание 4
    public static void Task7() {

        int week = 7;
        int firstFriday = 5;
        for (int i = 1; i < 31; i++) {
            if (i ==  firstFriday) {
                System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
                firstFriday += week;
            }
        }
        System.out.println();
    }

            // Домашнее задание 3
            // задание 1
    public static void Task8() {

        int minYears = 1822;
        int maxYears = 2122;

        for (int i = 0; i < maxYears; i++) {
            if (i % 79 == 0) {
                if (i > minYears && i < maxYears)
                    System.out.println(i);
            }
        }
        System.out.println();
    }

    public static void Task9() {

        int number = 2;
        int table = 0;
        for (int i = 1; i < 11; i++) {
            table = number * i;
            System.out.println(number + "*" + i + "=" + table);
        }
    }
    public static void main(String[] args) {

        Task1();
        Task2();
        Task3();
        Task4();
        Task5();
        Task6();
        Task7();
        Task8();
        Task9();

    }
}