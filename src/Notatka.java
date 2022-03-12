import java.util.Scanner;

public class Notatka{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dzialanie = "1";
        while (dzialanie != "x") {
            System.out.println("Podaj dzialanie(d-dodawanie, o-odejmowanie, x-wyjscie): ");
            String a = String.valueOf(input.nextInt());
        }

    }
}




























/*import java.util.Scanner;
public class Testowa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dzialanie = "1";
        while ( dzialanie!= "x") {
            System.out.println("Podaj dzialanie(d-dodawanie, o-odejmowanie, x-wyjscie): ");
            String a = String.valueOf(input.nextInt());

    }
}
    /*
    void - nic
    short / int / long - liczba calkowita
    char - jeden znak
    float - liczba zmienno przecinkowa
    boolean - True False
    String - ciag znakow
    TYP NAZWA = WARTOSC;
    TYP NAZWA2 = WARTOSC;
    int a = 100
    int b = 10;
    float a = 10.21f;

    */

