
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("China Zodiac Value Calculater with Birthyear");
        System.out.println("----------------------------------------------------");
        System.out.print("Please enter your birthyear :");
        int year = scanner.nextInt();
        System.out.println("----------------------------------------------------");
        int reminder = year % 12;
        switch (reminder) {
            case (0):
                System.out.println("Accourding to China Zodiac Year, You are a Monkey");
                break;
            case (1):
                System.out.println("Accourding to China Zodiac Year, You are a Cockerel");
                break;
            case (2):
                System.out.println("Accourding to China Zodiac Year, You are a Dog");
                break;
            case (3):
                System.out.println("Accourding to China Zodiac Year, You are a Pig");
                break;
            case (4):
                System.out.println("Accourding to China Zodiac Year, You are a Mouse");
                break;
            case (5):
                System.out.println("Accourding to China Zodiac Year, You are a Taurus");
                break;
            case (6):
                System.out.println("Accourding to China Zodiac Year, You are a Tiger");
                break;
            case (7):
                System.out.println("Accourding to China Zodiac Year, You are a Rabbit");
                break;
            case (8):
                System.out.println("Accourding to China Zodiac Year, You are a Dragon");
                break;
            case (9):
                System.out.println("Accourding to China Zodiac Year, You are a Snake");
                break;
            case (10):
                System.out.println("Accourding to China Zodiac Year, You are a Horse");
                break;
            case (11):
                System.out.println("Accourding to China Zodiac Year, You are a Sheep");
                break;
        }
        System.out.println("********************************************");
    }
}
