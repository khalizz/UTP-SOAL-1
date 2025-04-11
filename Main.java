
/* Nama : Khaliz Irfanur Hafiz
 * NIM  : 245150707111039

'||'  |'  '||'  '||'     |     '||'      '||' |'''''||  
 || .'     ||    ||     |||     ||        ||      .|'   
 ||'|.     ||''''||    |  ||    ||        ||     ||     
 ||  ||    ||    ||   .''''|.   ||        ||   .|'      
.||.  ||. .||.  .||. .|.  .||. .||.....| .||. ||......| 
*/

package utp.mains;

import java.util.Scanner;
import utp.shapes.*;

public class Main {
    // ANSI escape codes for terminal colors
    public static final String CYAN = "\u001B[36m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String PURPLE = "\u001B[35m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(YELLOW + "=============================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println("Khaliz Irfanur Hafiz");
        System.out.println("245150707111039");
        System.out.println("=============================================" + RESET);

        // Prisma
        System.out.println(GREEN + "Prisma Segitiga Sama Kaki");
        System.out.println("=============================================" + RESET);
        System.out.print(CYAN + "Isikan alas     : " + RESET);
        double alas = input.nextDouble();
        System.out.print(CYAN + "Isikan kaki     : " + RESET);
        double kaki = input.nextDouble();
        System.out.print(CYAN + "Isikan tinggi   : " + RESET);
        double tinggiPrisma = input.nextDouble();
        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);
        System.out.println(PURPLE + "=============================================");
        prisma.printInfo();
        System.out.println("=============================================" + RESET);

        // Limas
        System.out.println(GREEN + "Limas Persegi");
        System.out.println("=============================================" + RESET);
        System.out.print(CYAN + "Isikan sisi     : " + RESET);
        double sisi = input.nextDouble();
        System.out.print(CYAN + "Isikan tinggi   : " + RESET);
        double tinggiLimas = input.nextDouble();
        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        System.out.println(PURPLE + "=============================================");
        limas.printInfo();
        System.out.println("=============================================" + RESET);

        // Tabung
        System.out.println(GREEN + "Tabung");
        System.out.println("=============================================" + RESET);
        System.out.print(CYAN + "Isikan radius   : " + RESET);
        double radius = input.nextDouble();
        System.out.print(CYAN + "Isikan tinggi   : " + RESET);
        double tinggiTabung = input.nextDouble();
        Tabung tabung = new Tabung(radius, tinggiTabung);
        System.out.println(PURPLE + "=============================================");
        tabung.printInfo();
        System.out.println("=============================================" + RESET);
    }
}