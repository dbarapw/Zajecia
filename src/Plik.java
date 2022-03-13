import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Tworzenie pliku
public class Plik {
    public static void main(String[] args) throws IOException {
        try {
            File plik = new File("plik_tekstowy.txt");
            if (plik.createNewFile()) {
                System.out.println("Utworzono plik");
            } else {
                System.out.println("Nie udalo sie utworzyc pliku");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ZAPIS DO PLIKU
        try {
            FileWriter plik = new FileWriter("plik_tekstowy.txt");
            plik.write("zapiszmy cos na pliku");
            plik.write("\nzapiszmy cos na pliku");
            plik.close();

        } catch (IOException e) {
            System.out.println("Nie udalo sie zapisac do pliku");
            e.printStackTrace();
        }
    }
}