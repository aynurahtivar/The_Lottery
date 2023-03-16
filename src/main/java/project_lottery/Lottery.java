package project_lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
     /*
           Create  n random numbers with user to generated for the ticket.
           Create  n random numbers  for the result of the lottery.
           There should be no repeated numbers in the numerical lottery.
           Take the min and max from user to use in the lottery...

           Compare the result and ticket than print  how many matches is there
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bilet kac haneli olsun?");
        int biletHane = scan.nextInt();

        System.out.println("Minimum degeri giriniz: ");
        int min = scan.nextInt();
        System.out.println("Maximum degeri giriniz: ");
        int max = scan.nextInt();

        List<Integer> biletList = new ArrayList<>();
        List<Integer> lotoList = new ArrayList<>();

        Random random = new Random();

        //bileti olustur
        do {
            int randomBilet = random.nextInt(min, max + 1);
            for (int i = 0; i < biletHane; i++) {
                if (!(biletList.contains(randomBilet))) {
                    biletList.add(randomBilet);
                }
            }
        } while (biletList.size() != biletHane);

        //lotosonucu
        do {
            int randomLoto = random.nextInt(min, max + 1);
            for (int i = 0; i < biletHane; i++) {
                if (!(lotoList.contains(randomLoto))) {
                    lotoList.add(randomLoto);
                }
            }
        } while (lotoList.size() != biletHane);

        //listleri karsilastir
        int counter = 0;
        for (int i = 0; i < biletHane; i++) {
            if (biletList.get(i) == lotoList.get(i)) {
                counter++;
            }
        }
        System.out.print("Biletiniz: ");
        System.out.println(biletList);
        System.out.print("Loto sonucu: ");
        System.out.println(lotoList);
        System.out.println();

        if (counter == biletHane) {
            System.out.println("Tebrikler!");
        } else if (counter > 0) {
            System.out.println(counter + " adet eslesme var");
        } else {
            System.out.println("Eslesme yok");
        }
    }


}



