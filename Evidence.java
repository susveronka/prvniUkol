import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Evidence{

    private List <Zakaznik> evidence = new ArrayList<>();


    public void pridejZakaznika(Zakaznik zakaznik){
        evidence.add(zakaznik);
    }

    public void odeberZakaznika(){
        for(Zakaznik zakaznik3 : evidence)
        {
            int x =  evidence.size() - 1;
            evidence.remove(x);
        }
    }

    public void zapisDoSouboru(String soubor, String oddelovac) throws IllegalArgumentException
    {
        try(PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(soubor)))){
            for(Zakaznik zakaznik: evidence){
                String radek = zakaznik.getJmeno() + oddelovac + zakaznik.getDatumNarozeni() + oddelovac + zakaznik.getMesto() + oddelovac + zakaznik.getPocetProdeju();

                writer.println(radek);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
