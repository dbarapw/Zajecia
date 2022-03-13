public class PrzeciazanieMetodFunkcji2 {
    int a;
    String b;

    PrzeciazanieMetodFunkcji2() {
        this.a = 123;
        this.b = "TEST";
    }

    PrzeciazanieMetodFunkcji2(int a, String b) {
        this.a = a;
        this.b = b;

    }

    PrzeciazanieMetodFunkcji2(int a) {
        this.a = a;

    }

    public static void main(String[] args) {
        PrzeciazanieMetodFunkcji2 ob = new PrzeciazanieMetodFunkcji2(100);
        ob.a = 111111;

        System.out.println(ob.a);

    }
}




