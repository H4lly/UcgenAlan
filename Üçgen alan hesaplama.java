import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        double a,b,c,u,alan;
          Scanner girdi= new Scanner(System.in);
          System.out.print("1.Kenarı giriniz:");
          a = girdi.nextDouble();
        System.out.print("2.Kenarı giriniz:");
          b =girdi.nextDouble();
        System.out.print("3.Kenarı giriniz:");
          c = girdi.nextDouble();

         u = (a + b + c) / 2;

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı: " + alan);











    }
}