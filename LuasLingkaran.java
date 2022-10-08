package tugas1;

import java.util.Scanner;

public class LuasLingkaran {
    
    public static void main(String[] args) {
        final double phi = 3.14;
        double l , k , r ,d;
        
        Scanner input = new Scanner(System.in);
        System.out.print("\n Masukan r :");

        r = input.nextDouble();
        d = 2 * r;
        l = phi * r*r;
        k = phi * d;
        System.out.println("luas lingkaran     : "+ l );
        System.out.println("keliling lingkaran : "+ k);
}
}