package Models;

public class Posicion {
    
    private float x;
    private float y;
    
    
    //Constructor con parametros
    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //Crea constructor sin parámetros
    public Posicion(){
        //Llama al constructor con parámetros
        //y pasa valores predeterminados
        this(0,0);    
    }
    
    public float getX() {
        return x;
    }
    
    public float getY() {
        return y;
    }
    
}


