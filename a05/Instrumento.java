package a05;

public abstract class Instrumento {
    Nota[] melodia;
    int posicion;
    
    Instrumento(){
        melodia = new Nota[10];
        posicion = 0;
    }
    
    public void add(Nota n){
        if (posicion < melodia.length){
            melodia[posicion] = n;
            posicion ++;
        } else{
            System.out.println("has alcanzado el maximo");
        }
    }
    
    abstract void interpretar();
}

/*@Override
    void interpretar(){
        for (int cont= 0; i < posicion; cont++) {
            System.out.print(melodias[cont] + " ");
        }
    }*/