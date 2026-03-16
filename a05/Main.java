package a05;

public class Main {
    public static void main (String[]args){
        Piano p = new Piano();
        
        p.add(Nota.DO);
        p.add(Nota.MI);
        p.add( Nota.SOL);
        
        p.interpretar();
    }
}
