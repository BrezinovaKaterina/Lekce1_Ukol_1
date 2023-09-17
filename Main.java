import java.math.BigDecimal;

public class Main {

    public static void ukol1() {
        System.out.println("Hello world!");
// chybějící uvozovky a středník
    }
    public static void ukol2() {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
        // uvozovky u textu "Karel"
    }

    public static void ukol3() {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
        // chyba v použití proměnné chybnwě String místo int (pro číslo)
    }

    public static void ukol4() {
        double cena = 10.0;
        System.out.println(cena);
        // u desetinného čísla používáme tečku místo čárky
    }

    public static void ukol5() {
        BigDecimal cena = BigDecimal.ZERO; // Nastavíme do proměnné hodnotu 0
        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 0; i < 10; i++) {
            cena = cena.add(BigDecimal.valueOf(0.1));
            // operátor "+=" znamená: přičti ke stávající
            // hodnotě navíc 0.1
        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
        //úprava celého kódu na objektový typ BigDecimal - dvojková vs. desítková soustava tak aby vypsal 1
    }

    public static void ukol5a() {
        double cena = 0; // Nastavíme do proměnné hodnotu 0
        // Desetkrát přičteme hodnotu jedna desetina (0,1):
        for (int i = 0; i < 10; i++) {
            cena += 0.1;
            // operátor "+=" znamená: přičti ke stávající
            // hodnotě navíc 0.1
        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
        //původní kód pro úkol 5
    }

    public static void ukol6() {
        BigDecimal cena = BigDecimal.valueOf(0);
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
        // opraveno zobrazení hodnoty
    }

    public static void ukol7() {
        int vykonMotoru = 120;
        //String kW = "kW."; //není nutné
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
        //oprava číselné hodnoty pro vykonMotoru - nemají být v uvozovkách
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: "+velikostKosile+ ".");
        //upraveno přidání hodnoty 37 do textu a to odstranit částky a místo toho +dopředu a +dozadu
    }

    public static void ukol9() {
        System.out.println("Metoda *skoro* bez chybičky!");
        // chybělo "static"
    }

    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol5a();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }
}