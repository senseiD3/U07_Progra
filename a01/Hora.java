package a01;

public class Hora {
    protected int h;
    protected int m;
    
    Hora(int h, int m){
        this. h = h;
        this.m = m;
    }
    
    void inc(){
        m++;
        if (m > 59){
            m = 0;
            h++;
            if(h > 23){
                h = 0;
            }
        }
    }
    
    boolean setMinutos(int m){
        boolean resultado = true;
        
        if(m > -1 & m < 60){
            this.m = m;
        } else{
            resultado = false;
        }
        
        return resultado;
    }
    
    boolean setHora(int h){
        boolean resultado = true;
        
        if(h > -1 & h < 24){
            this.h = h;
        } else{
            resultado = false;
        }
        
        return resultado;
    }
    
    @Override
    public String toString(){
        String cad;
        cad = "La hora es: " + h + ":" + m;
        return cad;
    }
}
