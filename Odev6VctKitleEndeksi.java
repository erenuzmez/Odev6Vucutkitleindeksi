package Java101odevler;
import java.util.Scanner;
public class Odev6VctKitleEndeksi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double boy,kilo,indeks;
        System.out.println("Boyunuzu giriniz(m):");
        boy=input.nextDouble();
        System.out.println("Kilonuzu giriniz:");
        kilo=input.nextDouble();
        indeks=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz:"+indeks);
    }
}
