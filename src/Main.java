import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    private static List<Kolcsonozheto> katalogus = new ArrayList<>();
    private static List<Dvd> dvdKatalogus = new ArrayList<>();
    public static void main(String[] args) {
        Konyv konyv1 = new Konyv("Gyűrűk ura", "Lajos", "IS-234");
        Konyv konyv2 = new Konyv("Adsza Lali bomba", "Lajos", "IS-235");
        Konyv konyv3 = new Konyv("Gypsy commando", "Porsches Norbi", "IS-244");
        Konyv konyv4 = new Konyv("Gypsy commando - Újra akcióban", "Porsches Norbi", "IS-245");

        Dvd dvd1 = new Dvd("Cigny vagyok", 250);
        Dvd dvd2 = new Dvd("Cigny vagyok 2", 230);
        Dvd dvd3 = new Dvd("Cigny vagyok 3", 240);
        Dvd dvd4 = new Dvd("Cigny vagyok 4", 232);
        Dvd dvd5 = new Dvd("Cigny vagyok 5", 212);

        Ujsag ujsag1 = new Ujsag("Wannabe gypsy", 2000, 12);
        Ujsag ujsag2 = new Ujsag("Wannabe gypsy2", 2001, 13);
        Ujsag ujsag3 = new Ujsag("Wannabe gypsy3", 2002, 14);
        Ujsag ujsag4 = new Ujsag("Wannabe gypsy4", 2003, 32);
        Ujsag ujsag5 = new Ujsag("Wannabe gypsy5", 2004, 13);

        System.out.println(konyv1.megjelenitheto());
        System.out.println(konyv1.getIsbn());
        katalogus.add(konyv1);
        katalogus.add(konyv2);
        katalogus.add(konyv3);
        katalogus.add(konyv4);
        dvdKatalogus.add(dvd1);
        dvdKatalogus.add(dvd2);
        dvdKatalogus.add(dvd3);
        dvdKatalogus.add(dvd4);
        dvdKatalogus.add(dvd5);
        katalogus.add(ujsag1);
        katalogus.add(ujsag2);
        katalogus.add(ujsag3);
        katalogus.add(ujsag4);
        katalogus.add(ujsag5);
        for (Kolcsonozheto k : katalogus){
            System.out.println(k.megjelenitheto());
            if (k instanceof Konyv){
                System.out.println("\n" + (Konyv) k).getIsbn());
//Ezt miert nem latja?
            }
        }
        System.out.println();



        System.out.println();
        Collections.sort(dvdKatalogus);
        for (Dvd dvd : dvdKatalogus){
            System.out.println(dvd.megjelenitheto());
        }

    }
}