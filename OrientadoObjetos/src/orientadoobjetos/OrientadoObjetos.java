package orientadoobjetos;

import processing.core.PApplet;
import Models.*;

public class OrientadoObjetos extends PApplet {

    @Override
    public void settings() {
        // Definimos el tamaño de la ventana
        size(800, 600);
    }

    @Override
    public void setup() {
        // No necesitamos configuración inicial específica aquí
    }

    @Override
    public void draw() {
        // --- 1. CIELO Y SOL ---
        background(135, 206, 250); // Color azul cielo

        // El Sol (Un Círculo amarillo sin borde)
        Posicion posSol = new Posicion(700, 80);
        Borde sinBorde = new Borde(0, 0);
        Circulo sol = new Circulo(posSol, 80, sinBorde, color(255, 255, 0));
        sol.dibujar(this);

        // --- 2. EL SUELO/CARRETERA ---
        // Una Caja gris oscura grande en la parte inferior
        Posicion posSuelo = new Posicion(0, 500);
        Dimension dimSuelo = new Dimension(800, 100);
        Caja suelo = new Caja(posSuelo, dimSuelo, sinBorde, color(80, 80, 80));
        suelo.dibujar(this);

        // Línea amarilla de la carretera (Una caja muy delgada)
        Caja lineaCarretera = new Caja(new Posicion(0, 545), new Dimension(800, 10), sinBorde, color(255, 200, 0));
        lineaCarretera.dibujar(this);


        // --- 3. EDIFICIOS (Diferentes Cajas) ---
        Borde bordeEdificio = new Borde(2, color(30)); // Borde oscuro para los edificios

        // Edificio 1: Alto y gris
        Posicion pE1 = new Posicion(50, 200);
        Dimension dE1 = new Dimension(100, 300);
        Caja edificio1 = new Caja(pE1, dE1, bordeEdificio, color(150, 150, 150));
        edificio1.dibujar(this);

        // Edificio 2: Más bajo y marrón
        Posicion pE2 = new Posicion(180, 300);
        Dimension dE2 = new Dimension(150, 200);
        Caja edificio2 = new Caja(pE2, dE2, bordeEdificio, color(160, 82, 45));
        edificio2.dibujar(this);

        // Edificio 3: Un rascacielos azulado
        Posicion pE3 = new Posicion(360, 100);
        Dimension dE3 = new Dimension(120, 400);
        Caja edificio3 = new Caja(pE3, dE3, bordeEdificio, color(70, 130, 180));
        edificio3.dibujar(this);
        
        // Edificio 4: Ancho y bajo
        Posicion pE4 = new Posicion(500, 350);
        Dimension dE4 = new Dimension(200, 150);
        Caja edificio4 = new Caja(pE4, dE4, bordeEdificio, color(180, 180, 120));
        edificio4.dibujar(this);


        // --- 4. DETALLES (Ventanas y Puerta) ---
        // Usamos Cajas pequeñas para las ventanas. 
        // (Esto se podría hacer con un bucle 'for', pero lo haré manual para mantenerlo simple)
        
        Borde bordeVentana = new Borde(1, color(50));
        int colorLuz = color(255, 255, 200); // Amarillo claro

        // Ventanas Edificio 1
        new Caja(new Posicion(65, 220), new Dimension(20, 30), bordeVentana, colorLuz).dibujar(this);
        new Caja(new Posicion(115, 220), new Dimension(20, 30), bordeVentana, colorLuz).dibujar(this);
        new Caja(new Posicion(65, 270), new Dimension(20, 30), bordeVentana, colorLuz).dibujar(this);
        new Caja(new Posicion(115, 270), new Dimension(20, 30), bordeVentana, colorLuz).dibujar(this);

        // Puerta Edificio 2
        new Caja(new Posicion(240, 450), new Dimension(30, 50), bordeVentana, color(100, 50, 0)).dibujar(this);

        // Ventanas Edificio 3 (Rascacielos)
        new Caja(new Posicion(380, 150), new Dimension(80, 40), bordeVentana, color(200, 220, 255)).dibujar(this);
        new Caja(new Posicion(380, 210), new Dimension(80, 40), bordeVentana, color(200, 220, 255)).dibujar(this);
        new Caja(new Posicion(380, 270), new Dimension(80, 40), bordeVentana, color(200, 220, 255)).dibujar(this);
    }

    public static void main(String[] args) {
        PApplet.main("orientadoobjetos.OrientadoObjetos");
    }
}