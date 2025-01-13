import java.time.LocalDate;

public class Zakaznik {

    private String jmeno;
    private LocalDate datumNarozeni;
    private String mesto;
    private double pocetProdeju;

    public Zakaznik(String jmeno, LocalDate datumNarozeni, String mesto, double pocetProdeju) {
        this.jmeno = jmeno;
        this.datumNarozeni = datumNarozeni;
        this.mesto = mesto;
        this.pocetProdeju = pocetProdeju;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public double getPocetProdeju() {
        return pocetProdeju;
    }

    public void setPocetProdeju(double pocetProdeju) {
        this.pocetProdeju = pocetProdeju;
    }



    public void ZvysProdeje()
}
