package pl.swiebodzin.pzs.kurs2;

public class Samochod {

    private String marka;
    String model;
    double pojemnosc;
    int przebieg;
    String paliwo;

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
}
