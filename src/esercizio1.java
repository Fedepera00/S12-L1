public class esercizio1 {

    // MOLTIPLICO 2 NUMERI INTERI
    public static int moltiplica(int a, int b) {
        return a * b;
    }

    // CONCATENO UNA STRINGA CON UN NUMERO INTERO
    public static String concatena(String str, int num) {
        return str + num;
    }

    // INSERISCO UNA STRINGA IN UN NUOVO ARRAY E RESTITUISCO 6 ELEMENTI
    public static String[] inserisciInArray(String[] array, String str) {
        String[] nuovoArray = new String[6];
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        // NUOVA STRINGA AL 3 POSTO
        nuovoArray[2] = str;
        // COPIO I RESTANTI DEL VECCHIO ARRAY
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];
        return nuovoArray;
    }
}