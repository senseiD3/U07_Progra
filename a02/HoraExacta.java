package a02;

public class HoraExacta extends Hora{
    private int s;
    
    HoraExacta(int h, int m, int s){
        super(h, m);
        this.s = s;
    }
    
    @Override
    public void inc(){
        s++;
        if (s > 59){
            s = 0;
            super.m++;
            if (super.m > 59){
                super.m = 0;
                super.h++;
                if(super.h > 23){
                    super.h = 0;
                }
            }
        }
    }
    
    boolean setSegundos(int s){
        boolean resultado = true;
        
        if(s > -1 & s < 60){
            this.s = s;
        } else{
            resultado = false;
        }
        
        return resultado;
    }
    
    @Override
    public String toString(){
        String cad;
        cad = "La hora es: " + super.h + ":" + super.m + ":" + s;
        return cad;
    }
}
