public class Main {


    int a = 111;      // <---------------------NAWIAZANIE KOMENDA Main ob = new Main();


    public static void main(String[] args) {

        {
            int a = 111;
            System.out.println(a);
        }
        // KLAMRA OTWARTA I ZAMKNIETA POWODUJE ODCIECIE KODU


        Main ob = new Main();              // <----------------NAWIAZANIE DO MAIN
        System.out.println(ob.a);



    }
}
