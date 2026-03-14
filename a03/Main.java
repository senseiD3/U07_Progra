package a03;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce la hora, los minutos y los segundos de h1");
        HoraExacta h1 = new HoraExacta(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Introduce la hora, los minutos y los segundos de h2");
        HoraExacta h2 = new HoraExacta(sc.nextInt(), sc.nextInt(), sc.nextInt());
        
        System.out.println("h1: " + h1.toString());
        System.out.println("h2: " + h2.toString());
        
        System.out.println("Son iguales h1 y h2: " + h1.equals(h2));
    }
}
