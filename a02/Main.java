package a02;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Scanner sc =new Scanner (System.in);
        
        HoraExacta hora = new HoraExacta (21, 45, 30);
        
        System.out.println(hora.toString());
        
        System.out.println("Modifica la hora: ");
        hora.setHora(sc.nextInt());
        System.out.println("Modifica los minutos: ");
        hora.setMinutos(sc.nextInt());
        System.out.println("Modifica los segundos: ");
        hora.setSegundos(sc.nextInt());
        hora.inc();
        
        System.out.println(hora.toString());
    }
}
