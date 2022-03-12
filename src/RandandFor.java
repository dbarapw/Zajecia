import java.util.Random;
import java.util.Scanner;

public class RandandFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int random = (int) (Math.random() * 10);
        System.out.println("Podaj liczbe:");
        int naszaLiczba = input.nextInt();
        if (naszaLiczba == random) {
            System.out.println("Wygrales, moja liczba to:");
        } else {

            System.out.println("Przegrales, moja liczba to:");
            System.out.println(String.valueOf(random));
        }
        System.out.println(String.valueOf(random));

    }

    {

    }
}


/////TYPY LOSOWANIA LICZB/////
//double random = Math.random() * 100;

//int random = (int)(Math.random() * 101);

//Random rand = new Random();
//int n = rand.nextInt(50);
//n++;