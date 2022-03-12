

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

/////TYPY LOSOWANIA LICZB/////
//double random = Math.random() * 100;

//int random = (int)(Math.random() * 101);

//Random rand = new Random();
//int n = rand.nextInt(50);


/////Array i For/////
//for(int i = 0; i<10; i=i+3){
//    System.out.println(i*2);
//}
//int a[]={123,123,32,10,20};
//    for(int i = 0;i<=5;i++) {
//    System.out.print(i);
//    System.out.print("       ");
//    System.out.print(a[i]);
//    System.out.print("       ");
//    System.out.print(a[i]*100);
//    System.out.println("");
//}

//public static void main(String[] args) {
//    int a[]={123,123,32,10,20};
//    a[0]+=2000;
//    for(int i =0; i<a.length;i++){
//        System.out.println(a[i]);

//import java.util.Scanner;
//
//public class Kalkulator {
//    public static void main(String[] args) {
//        //Tworzymy obiekt Scanner
//        Scanner input = new Scanner(System.in);
//        //Deklarujemy zmienną string aby jej później używać
//        String dzialanie = "1";
//        //warunek pętli while jeśli jest true to ta pętla zawsze się wykonuje chyba że natrafi na break;
//        while (true){
//            //Pytamy o dzialanie
//            System.out.println("Wyjscie(x),Dodawanie(d),Odejmowanie(o),Mnozenie(m),Dzielenie(dz)");
//            dzialanie = input.next();
//            //Przerwanie aplikacji jesli x
//            if(dzialanie.equals("x")){
//                break;
//            }
//            //Pytamy o liczby
//            System.out.println("Podaj pierwszą:");
//            int a = input.nextInt();
//            System.out.println("Podaj drugą:");
//            int b = input.nextInt();
//            //Wykonywanie działań za pomocą switcha
//            switch(dzialanie){
//                case "d":
//                    System.out.println(String.valueOf(a)+"+"+String.valueOf(b)+"="+(a+b));
//                    break;
//                case "o":
//                    System.out.println(String.valueOf(a)+"-"+String.valueOf(b)+"="+(a-b));
//                    break;
//                case "m":
//                    System.out.println(String.valueOf(a)+"*"+String.valueOf(b)+"="+(a*b));
//                    break;
//                case "dz":
//                    System.out.println(String.valueOf(a)+"/"+String.valueOf(b)+"="+(a/b));
//                    break;
//                default:
//                    break;
//            }
//