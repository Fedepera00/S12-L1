import java.util.Scanner; // LETTURA INPUT IN CONSOLE

public class esercizio2 {

    // METODO che chiede tre stringhe e le stampa concatenate in ORDINE e in ORDINE INVERSO
    public static void esegui() {
        //FACCIO UNO SCANNER PER LEGGERE L'INPUT DEL'UTENTE
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci tre stringhe:");

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        String concatenato = str1 + str2 + str3;
        System.out.println("Concatenazione nell'ordine d'inserimento: " + concatenato);

        String concatenatoInverso = str3 + str2 + str1;
        System.out.println("Concatenazione nell'ordine inverso: " + concatenatoInverso);
    }
}