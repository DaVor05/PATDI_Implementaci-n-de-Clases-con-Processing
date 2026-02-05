package Models;

import processing.core.PApplet;

public class Circulo {
    private final Posicion posicion;
    private final int diametro;
    private final Borde borde;
    private final int color;

    public Circulo(Posicion posicion, int diametro, Borde borde, int color) {
        this.posicion = posicion;
        this.diametro = diametro;
        this.borde = borde;
        this.color = color;
    }

    public void dibujar(PApplet p) {
        p.stroke(this.borde.getColor());
        p.strokeWeight(this.borde.getAncho());
        p.fill(this.color);
        p.ellipse(posicion.getX(), posicion.getY(), diametro, diametro);
    }
}