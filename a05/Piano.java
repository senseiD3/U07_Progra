package a05;

public class Piano extends Instrumento{
    
    Piano(){
        super();
    }
    
    void interpretar(){
        for (int cont = 0; cont < posicion; cont++) {
            System.out.print(melodia[cont] + " ");
        }
    }
}