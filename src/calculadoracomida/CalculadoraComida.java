/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;

import calculadoracomida.InformacionComida.InformacionComidaBuilder;

/**
 *
 * @author maguero
 */
public class CalculadoraComida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InformacionComida porcionOllaDeCarne;
        InformacionComidaBuilder builder = new InformacionComida.InformacionComidaBuilder("Olla De Carne",240,Medida.ML);
        builder = builder.calorias(150).carbohidratos(100).porciones(9);
        porcionOllaDeCarne = builder.createInformacionComida();
        System.out.println(porcionOllaDeCarne.toString());
        
    }
    
}
