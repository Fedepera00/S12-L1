import java.util.Scanner; // LETTURA INPUT IN CONSOLE

public class esercizio3 {

    // QUI CALCOLO IL PERIMETRO DEL RETTANGOLO NEI DUE LATI
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2); // USO Formula, 2* (1+2)
    }

    // DETERMINA NUMERO PARI O DISPARI
    public static int pariDispari(int num) {
        return num % 2 == 0 ? 0 : 1; // 0 SE PARI 1 SE DISPARI
    }

    // IL DOUBLE LO USIAMO PER I NUMERI DECIMALI

    // CALCOLO L'AREA USANDO LA FORMULA DI ERONE
    public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        // SEMIPERIMETRO
        double semiPerimetro = (lato1 + lato2 + lato3) / 2;
        // CALCOLO E RESTITUISCO CON ERONE
        return Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));
    }

    // ESEGUIAMO LE OPERAZIONI
    public static void esegui() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserisci la lunghezza dei due lati del rettangolo:");
        double lato1 = scanner.nextDouble();
        double lato2 = scanner.nextDouble();
        System.out.println("Perimetro del rettangolo: " + perimetroRettangolo(lato1, lato2));

        System.out.println("Inserisci un numero intero:");
        int num = scanner.nextInt();
        System.out.println("Il numero è " + (pariDispari(num) == 0 ? "pari" : "dispari"));

        // LUNGHEZZA PER TROVARE AREA
        System.out.println("Inserisci le lunghezze dei lati del triangolo:");
        double latoA = scanner.nextDouble();
        double latoB = scanner.nextDouble();
        double latoC = scanner.nextDouble();
        // AREA DEL TRIANGOLO
        System.out.println("Area del triangolo: " + perimetroTriangolo(latoA, latoB, latoC));
    }
}