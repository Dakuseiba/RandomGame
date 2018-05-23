package pl.swiebodzin.pzs.kurs2;

public class NumberList {
//psvm
    static String name;
    static int counter =0;
    public static void main(String[] args) {

       // name = "Łukasz";
       // counter++;
       // System.out.println(name + " " + counter);

      /*  Samochod samochod = new Samochod();

        samochod.marka = "Lancia";
        samochod.model = "Delta";
        samochod.paliwo = "benzyna";
        samochod.przebieg = 165289;
        samochod.pojemnosc = 15;

        System.out.println(samochod);

      */

        Samochod Nissan = new Samochod("Nissan","350Z",6.5,5,"benzyna");
        Samochod Mitsubishi = new Samochod("Mitsubishi","Eclipse",8.5,8795,"benzyna");

        System.out.println(Nissan);
        System.out.println(Mitsubishi);

        System.out.println(Nissan.getMarka());

        Nissan.setMarka("Lancia");
        System.out.println(Nissan.getMarka());

        Nissan.nowyPojazd("Ballon boy: Hello!");

        Pojazd bmw = new Samochod();

    }

}
