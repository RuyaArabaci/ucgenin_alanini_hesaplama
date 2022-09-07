import java.util.Scanner;

public class ucgenin_alanini_hesaplama {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz:");
        a = input.nextDouble();

        System.out.print("2. Kenarı Giriniz:");
        b = input.nextDouble();

        System.out.print("3. Kenarı Giriniz:");
        c = input.nextDouble();

        double u = (a + b + c) / 2 ;
        double yol = u * (u-a) * (u-b) * (u-c);
        double alan = Math.sqrt(yol);
        
        System.out.println(alan);
         
    }
}
