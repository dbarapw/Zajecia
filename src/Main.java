public class Main {
    public static void main(String[] args) {
        int tab1[] = {12, 21, 33, 41, 56, 67, 57};
        int tab2[] = {52, 33, 14, 55, 67, 78, 94};
        //FOR EACH
        for (int liczba : tab1) ;
        for (int liczba : tab2) {
            liczba += 1;
            // liczba+=1 oznacza, ze liczba bedzie wieksza o 1
        }
        for (int i = 0; i < tab1.length; i++) {
            System.out.print(tab1[i]);
            System.out.print("\t");
            // \t sprawia ze "cos" jest na srodku
            // \n
            System.out.print(tab2[i]);
            System.out.print("\t");
            System.out.println(tab1[i] * tab2[i]);
        }
        // double a = 3+Math.PI;
        // liczba 3 + liczba PI
        for (int i = 0; i < tab1.length; i++) {
            int temp = Math.max(tab1[i], tab2[i]);
            if (temp == tab1[i]) {
                System.out.println("Tab1 nie jest wieksza");
            } else {
                System.out.println("Tab1 jest wieksza");
            }


        }
    }
}

