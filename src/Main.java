import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Es1 CHIAMATA
        int prodotto = esercizio1.moltiplica(3, 5); // CALCOLA LA MOLTIPLICAZIONE DI 3 E 5
        System.out.println("Prodotto: " + prodotto);

        String concatenato = esercizio1.concatena("Numero: ", 7); //AFFIANCA LE STRINGHE CON IL NUMERO 7 , concateno
        System.out.println("Stringa concatenata: " + concatenato);

        //CREO UN ARRAY DI STRINGHE E LE MODIFICO INSERENDO UNA NUOVA STRINGA
        String[] array = {"a", "b", "c", "d", "e"};
        String[] nuovoArray = esercizio1.inserisciInArray(array, "new");
        System.out.println("Nuovo array: " + Arrays.toString(nuovoArray));

        // Es2 CHIAMATA
        esercizio2.esegui();

        // Es3 CHIAMATA
        esercizio3.esegui();
    }
}