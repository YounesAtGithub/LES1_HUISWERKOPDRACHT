package BONUS;


public class Ifelse {
    public static void main(String[] args) {
        oddEvenChecker(3);
        grader(100);
        biggestNumber(4, 400);
        positiveNegativeZeroChecker(1);
        leeftijdsClassificatie(-671);
        lengthChecker("dfdfdfdfd");
        jaarChecker(2000);
        biggestOfThree(100, 200, 3000);
        triangleTypeDeterminator(2,2,2);
        calculator("divide", 1, 2);
    }

    //Opdracht 1: Even/Odd Checker
    public static void oddEvenChecker(int number) {
        if (number % 2 == 0) {
            System.out.println("Opdracht 1 | this number is even");
        } else {
            System.out.println("Opdracht 1 | this number is odd");
        }
    }

    //Opdracht 2: Grader
    public static void grader(int number) {
        switch (number) {
            case 1, 2:
                System.out.println("Opdracht 2 | F");
                break;
            case 3, 4:
                System.out.println("Opdracht 2 | D");
                break;
            case 5, 6:
                System.out.println("Opdracht 2 | C");
                break;
            case 7, 8:
                System.out.println("Opdracht 2 | B");
                break;
            case 9, 10:
                System.out.println("Opdracht 2 | A");
                break;
            default:
                System.out.println("Opdracht 2 | Impossible to compute the provided number");
        }
    }

    //Opdracht 3: Grootste van Twee Getallen
    public static void biggestNumber(int input1, int input2) {
        if (input1 > input2) {
            System.out.println("Opdracht 3 | " + input1);
        } else if (input1 == input2) {
            System.out.println("Opdracht 3 | + Both inputs are probably the same");

        } else {
            System.out.println("Opdracht 3 | " + input2);
        }
    }

    //Opdracht 4: Positief/Negatief/Zero Checker
    public static void positiveNegativeZeroChecker(int number) {
        if (number == 0) {
            System.out.println("Opdracht 4 | Provided number is a zero");
        } else if (number > 0) {
            System.out.println("Opdracht 4 | Provided number is a positive number");
        } else {
            System.out.println("Opdracht 4 | Provided number is a negative number");
        }
    }

    //Opdracht 5: Leeftijdsclassificatie
    //https://stackoverflow.com/questions/31497818/switches-in-java-can-i-include-a-condition-in-a-case
    public static void leeftijdsClassificatie(int number) {
        if (number >= 0 && number <= 10) {
            System.out.println("Opdracht 5 | Kind");
        } else if (number > 10 && number < 18) {
            System.out.println("Opdracht 5 | Puber");
        } else if (number >= 18 && number <= 66) {
            System.out.println("Opdracht 5 | Volwassen");
        } else if (number >= 67 && number <= 99) {
            System.out.println("Opdracht 5 | Senior");
        } else {
            System.out.println("Opdracht 5 | Opgegeven nummer slaat helemaal nergens op");
        }
    }

    //Opdracht 6: Tekstlengte Checker
    public static void lengthChecker(String name) {
        if (name.length() < 10) {
            System.out.println("Opdracht 6 | Kort");
        } else if (name.length() <= 20) {
            System.out.println("Opdracht 6 | Middellang");
        } else {
            System.out.println("Opdracht 6 | Lang");
        }
    }

    //Opdracht 7: Jaar Checker
    public static void jaarChecker(int number) {
        if ((number % 4 == 0 && number % 400 == 0) || (number % 100 != 0)) {
            System.out.println("Opdracht 7 | Opgegeven jaartal (" + number + ") is een schrikkeljaar");
        } else {
            System.out.println("Opdracht 7 | Opgegeven jaartal (" + number + ") is GEEN schrikkeljaar");
        }
    }

    //Opdracht 8: Grootste van Drie Getallen
    public static void biggestOfThree(int number1, int number2, int number3) {
        //als nummer1 groter dan nummer 2 && nummer1 groter dan nummer 3, print nummer 1
        //anders, als nummer 2 groter dan nummer3, print nummer 2
        //anders, print nummer3

        if(number1 > number2 && number1 > number3) {
            System.out.println("Opdracht 8 | " + number1 + " is het grootste van de 3");
        }else if (number2 > number3) {
            System.out.println("Opdracht 8 | " + number2 + " is het grootste van de 3");
        }else {
            System.out.println("Opdracht 8 | " + number3 + " is het grootste van de 3");
        }
    }

    //Opdracht 9: Driehoekstype
    //if (number1 == number 2 || number1 == number3) && (number1 != number2 || number1 != number3) = gelijkbenig
    //if number1 == number2 && number1 == number3 = gelijkzijdig
    //else = ongelijkzijdig

    public static void triangleTypeDeterminator(int number1, int number2, int number3) {
        if((number1 == number2 || number1 == number3) && (number1 != number2 || number1 != number3)) {
            System.out.println("Opdracht 9 | Gelijkbenig");
        } else if(number1 == number2 && number1 == number3) {
            System.out.println("Opdracht 9 | Gelijkzijdig");
        } else {
            System.out.println("Opdracht 9 | Ongelijkzijdig");
        }
    }

    //Opdracht 10: Calculator
    public static void calculator(String operator, int number1, int number2) {
        switch (operator) {
            case "add":
                System.out.println("Opdracht 10 | " + number1 + " plus " + number2 + " equals " + (number1 + number2));
                break;
            case "subtract":
                System.out.println("Opdracht 10 | " + number1 + " minus " + number2 + " equals " + (number1 - number2));
                break;
            case "multiply":
                System.out.println("Opdracht 10 | " + number1 + " multiplied by " + number2 + " equals " + (number1 * number2));
                break;
            case "divide":
                System.out.println("Opdracht 10 | " + number1 + " divided by " + number2 + " equals " + (number1 / number2));
                break;
            default:
                System.out.println("usage: add, subtract, multiply, divide, number1, number2");
        }

    }

}
