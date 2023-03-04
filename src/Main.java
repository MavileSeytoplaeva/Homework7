public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        int months = 0;
        while (total <= 2_459_000) {
            total = total + deposit;
            months++;
            System.out.println("Месяц "+months+" , сумма накоплений равна "+total+" рублей.");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number+" ");
        }
        System.out.println();
        for ( ; number >= 1 ;) {
            System.out.print(number+" ");
            number--;
        }
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int initialPeopleCount = 12_000_000;
        float fertility = 17/1000f;
        float mortality = 8/1000f;
        int peopleAYear = (int) ((initialPeopleCount*fertility)-(initialPeopleCount*mortality));
        for (int year = 0; year <= 10; year++) {
            int totalPeople = initialPeopleCount+(peopleAYear*year);
            System.out.println("Год "+year+", численность населения составляет "+totalPeople);
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int deposit = 15_000;
        float percent = 1.07f;
        int months = 0;
        while (deposit <= 12_000_000){
            months++;
            deposit = (int) (deposit * percent);
            System.out.println("Месяц "+months+". На вашем счету "+deposit+" рублей.");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int deposit = 15_000;
        float percent = 1.07f;
        int months = 0;
        while (deposit <= 12_000_000){
            months++;
            deposit = (int) (deposit * percent);
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ". На вашем счету " + deposit + " рублей.");
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int deposit = 15_000;
        float percent = 1.07f;
        int months = 0;
        while (months <= 108){
            months++;
            deposit = (int) (deposit * percent);
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ". На вашем счету " + deposit + " рублей.");
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int firstFriday = 3;
        for (int dayNumber = 3; dayNumber <= 31; ) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет");
            firstFriday += 7;
            dayNumber += 7;
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int presentYear = 2021;
        int pastYear = presentYear-200;
        int futureYear = presentYear+100;
        for (int year = 0; year <= futureYear; year += 79) {
            if (year > pastYear) {
                System.out.println(year);
            }
        }
    }
}