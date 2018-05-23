package pl.swiebodzin.pzs.kurs2;

public class Samochod implements Pojazd{

    private String marka;
    private String model;
    private double pojemnosc;
    private int przebieg;
    private String paliwo;

    public Samochod(){}

    public Samochod(String marka, String model, double pojemnosc, int przebieg, String paliwo){

        this.marka = marka;
        this.model = model;
        this.pojemnosc = pojemnosc;
        this.przebieg = przebieg;
        this.paliwo = paliwo;

    }

    @Override
    public String toString() {

        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", pojemnosc=" + pojemnosc +
                ", przebieg=" + przebieg +
                ", paliwo='" + paliwo + '\'' +
                '}';

    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setPojemnosc(double pojemnosc) {
        this.pojemnosc = pojemnosc;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public void setPaliwo(String paliwo) {
        this.paliwo = paliwo;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public String getPaliwo() {
        return paliwo;
    }

    @Override
    public void nowyPojazd(String s) {
        System.out.println(s);
    }
}
