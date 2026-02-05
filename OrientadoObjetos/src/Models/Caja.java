package Models;

import processing.core.PApplet;

public class Caja {
    
    private Posicion posicion;
    private Dimension dimension;
    private int color;
    private Borde borde;
    
    public Caja(){
        this(new Posicion(), new Dimension(100,100), new Borde(), 255);
    }
    
    public Caja(Posicion posicion, Dimension dimension, Borde borde, int color){
        this.posicion = posicion;
        this.dimension = dimension;
        this.borde = borde;
        this.color = color;
    }
    
    public Posicion getPosicion(){
        return this.posicion;
    }
    
    public Dimension getDimension(){
        return this.dimension;
    }
    
    public Borde getBorde(){
        return this.borde;
    }
    
    public int getColor(){
        return this.color;
    }
    
    public void setPosicion(Posicion nuevaPosicion){
        this.posicion = nuevaPosicion;
    }
    
    public void setColor(int nuevoValor){
        if (nuevoValor<0){
            System.out.println("Error: El numero debe ser mayor o igual a 0...");
            return;
        }  
        this.color = nuevoValor;
    }
    
    public void dibujar(PApplet p){
        p.stroke(this.borde.getColor());
        p.strokeWeight(this.borde.getAncho());
        p.fill(color);
        float origenX = posicion.getX();
        float origenY = posicion.getY();
        int pixelesBase = dimension.getHorizontal();
        int pixelesAltura = dimension.getVertical();
        p.rect(origenX, origenY, pixelesBase, pixelesAltura);
    }
}