public class Main {
    public static void main(String[] args) {
        int number = -1;
        int input1 = 4;
        int input2 = 22;
        String name = "Henk";

        positiveOrNegative(number);
        positiveOrZeroOrNegative(0);
        sum(input1, input2);
        bartender("thee");
        positiveOrZeroOrNegative(number);
    }

    public static void hello() {
        System.out.println("Hello, is it me you're looking for?");
    }

    public static void positiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("The provided number is a positive integer");
        } else {
            System.out.println("The provided number is a negative integer");
        }

    }

    public static void positiveOrZeroOrNegative(int number) {
        if (number == 0) {
            System.out.println("The provided number is a zero");
        } else if (number > 0) {
            System.out.println("The provided number is a positive integer");
        } else {
            System.out.println("The provided number is a negative integer");
        }
    }

    public static void bartender(String name) {
        switch (name) {
            case "koffie":
                System.out.println("Je hebt gekozen voor Koffie");
                break;
            case "thee":
                System.out.println("Je hebt gekozen voor Thee");
                break;
            case "frisdrank":
                System.out.println("Je hebt gekozen voor Frisdrank");
                break;
            default:
                System.out.println("Koop dan!");
        }
    }

    public static void sum(int input1, int input2) {
        System.out.println("input1 summed by input2="+ (input1 + input2));
    }
}
