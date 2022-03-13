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

    /*
    //Przeciążanie metod funkcji czyli tworzenie tej samej nazwy z różnymi parametrami
    public int suma(int a,int b,int c){
        return a+b+c;
    }
    public int suma(int a,int b){
        return a+b;
    }
    public float suma(float a,float b){
        return a+b;
    }
    public float suma(int a,float b){
        return a+b;
    }*/
}




