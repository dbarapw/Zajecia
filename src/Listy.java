import java.util.ArrayList;

public class Listy {
    private int a;
    private int b;

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        // ZMIANA
        lista.add("Niebieski");
        lista.add("Czerwony");
        lista.add("Czarny");
        lista.set(0,"Zielony");
        // POBIERANIE
        String zmienna_dodatkowa = lista.get(0);
        System.out.println(zmienna_dodatkowa);
        System.out.println(lista);
        // USUWANIE
        lista.remove(1);
        System.out.println(zmienna_dodatkowa);
        System.out.println(lista);

        for (String i : lista){
            System.out.println(i);
        }
    }
}
