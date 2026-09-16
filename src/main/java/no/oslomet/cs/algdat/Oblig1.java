package no.oslomet.cs.algdat;

public class Oblig1 {

    private Oblig1() {}

    // Oppgave 0
    public static int gruppeMedlemmer() {
        return 1;
        // Skal returne hvor mange som er i gruppa deres.
    }

    // Oppgave 1
    public static int maks(int[] a) {
        if (a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom");
        }

        for (int i = 0; i < a.length - 1; i++){
            if (a[i] > a[i + 1]){ // hvis indeks i er større enn i + 1
                int temp = a[i]; // lagre verdien i indeks i i en temp variabel
                a[i] = a[i + 1]; // sett den minste verdien før den største
                a[i + 1] = temp; // sett den største verdien (som ligger i temp) til der den tidligere minste verdien var
            }
        }
        return a[a.length - 1]; // returnerer d største elementet som nå er bakerst

        // a) det blir n - 1 sammenligninger
        // b) det blir færrest ombyttinger hvis tabellen er i stigende rekkefølge
        // c) det blir flest ombyttinger hvis den største verdien ligger først
        // d) ?????
    }

    public static int ombyttinger(int[] a) {
        if (a.length < 1){
            throw new java.util.NoSuchElementException("Tabellen er tom");
        }

        int ombyttinger = 0;
        for (int i = 0; i < a.length - 1; i++){
            if (a[i] > a[i + 1]){ 
                int temp = a[i]; 
                a[i] = a[i + 1]; 
                a[i + 1] = temp; 
                ombyttinger++;
            }
        }
        return ombyttinger;
    }


    // Oppgave 2
    public static int antallUlikeSortert(int[] a) {throw new UnsupportedOperationException();}



















    
    // Oppgave 3
    public static int antallUlikeUsortert(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 4
    public static void sorter(int[] a, int fra, int til) {throw new UnsupportedOperationException();}

    // Oppgave 5
    public static void delsortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 6
    public static void rotasjon(char[] a) {throw new UnsupportedOperationException();}

    // Oppgave 7
    public static void rotasjon(char[] a, int k) {throw new UnsupportedOperationException();}

    // Oppgave 8
    public static String flett(String s, String t) {throw new UnsupportedOperationException();}

    public static String flett(String... s) {throw new UnsupportedOperationException();}

    // Oppgave 9
    public static int[] indeksSortering(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 10
    public static int[] tredjeMin(int[] a) {throw new UnsupportedOperationException();}

    // Oppgave 11
    public static boolean inneholdt(String a, String b) {throw new UnsupportedOperationException();}
}