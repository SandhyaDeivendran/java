public class AllPrograms {
    public static void main(String[] args) {
        // Uncomment the program you want to run

        // leapYear();
        // maxNumber();
        // daySwitch();
        // arithmeticCalc();
    }

    static void leapYear() {
        int year = 2024;
        if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    static void maxNumber() {
        int a = 10, b = 20, c = 30;
        if (a > b && a > c)
            System.out.println("A is greater");
        else if (b > c && b > a)
            System.out.println("B is greater");
        else if (c > a && c > b)
            System.out.println("C is greater");
        else
            System.out.println("Not found");
    }

    static void daySwitch() {
        int day = 3; // input
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
    }

    static void arithmeticCalc() {
        int a = 1000, b = 2, c = 1;
        int d = a * b;
        int e = a * c;
        int f = ((d - e) - 100);
        System.out.println(f);
    }
}
