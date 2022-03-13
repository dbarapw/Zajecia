import java.io.File;
import java.io.IOException;
// Tworzenie pliku
public class Plik {
    public static void main(String[] args) throws IOException {
        try {
            File plik = new File("plik_tekstowy.txt");
            if(plik.createNewFile()){
                System.out.println("Utworzono plik");
            }else{
                System.out.println("Nie udalo sie utworzyc pliku");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}