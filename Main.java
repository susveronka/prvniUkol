import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        try {
            Zakaznik zakaznik = new Zakaznik("Karel Dvořák", LocalDate.now(), "UH", 25.5);
            Zakaznik zakaznik2 = new Zakaznik("Karel Dvořák", LocalDate.now(), "UH", 25.5);

            Evidence evidence = new Evidence();

            evidence.pridejZakaznika(zakaznik);
            evidence.pridejZakaznika(zakaznik2);
            evidence.odeberZakaznika();

            evidence.zapisDoSouboru("src/uloziste.txt", ";");
        }

        catch (Exception e){
            e.getLocalizedMessage();
        }

    }
}