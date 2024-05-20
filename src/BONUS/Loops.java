package BONUS;

public class Loops {
    public static void main(String[] args) {

        //evenNumberCounter();
        //multiplyByTwo();
        //numberPresence();
        //sumOfArray();
        emptyStringChecker();
    }

    //Opdracht 1: Som even getallen tot 100 berekenen
    public static void evenNumberCounter() {
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println("Opdracht 1 | " + (i + i));
            }
        }
    }

    //Opdracht 2: 1 tot 1000 vermenigvuldigen met 2
    public static void multiplyByTwo() {

        int increment = 1;
        int result = 0;
        while (result < 1000) {
            result = increment++ * 2;
            System.out.println("Opdracht 2 | " + result);
        }
    }

    //Opdracht 3: Lijst controleren op aanwezigheid value 45
    public static void numberPresence() {
        int[] arrayOfNumbers = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 45, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
        int i;
        for (i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] == 45) {
                System.out.println("Opdracht 3 | Matching number found in array");
            } else { //deze else kan net zo goed weggelaten worden. Want in dat geval krijg je aleen een reactie als daadwerkelijk 45 is gevonden
                System.out.println("Opdracht 3 | No matching number found in array");
            }
        }
    }

    //Opdracht 4: Som van array berekenen
    public static void sumOfArray() {
        int[] arrayOfNumbers = {12, 5, 7, 2, 18, 3, 9, 12};
        int totaal = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            totaal = arrayOfNumbers[i] + totaal;
            System.out.println("Opdracht 4 | " + totaal);
        }
    }

    //Opdracht 5: Print string tot lege waarde
    //https://www.oreilly.com/library/view/java-a-beginners/9780071606325/ch3lev1sec17.html
    public static void emptyStringChecker() {
        String[] sentence = {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"};
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i].equals("")) break;
            {
                System.out.println("Opdracht 5 | " + sentence[i]);
            }
        }

    }

    //Opdracht 6: Print alle priemgetallen tot 100
    public static void primeNumber() {

    }
}
