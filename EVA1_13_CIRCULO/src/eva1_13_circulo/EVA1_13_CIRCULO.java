/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_circulo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_13_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double peri, area, volu, radio;
        Scanner captu = new Scanner (System.in);
        System.out.println("Escribe el radio del circulo");
        radio  = captu.nextDouble();
        peri = radio * 3.1416 * 2;
        volu = 4/3 *3.1416 * (radio*radio*radio);
        area = 3.1416* (radio * radio);
        System.out.print("Perimetro:");
        System.out.println(peri);
        System.out.print("Volumen: ");
        System.out.println(volu);
        System.out.print("Area: ");
        System.out.print(area);        
        
    }
    
}
