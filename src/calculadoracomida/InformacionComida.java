/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;

/**
 *
 * @author maguero
 */
public class InformacionComida {
    private final String nombre; 
    private final int cantidadPorcion;
    private final Medida unidadDeMedida;
    private final int porciones;
    private final int calorias;
    private final int grasa;
    private final int sodio;
    private final int carbohidratos;

    private InformacionComida(String pNombre, int pCantidadPorcion, Medida pMedida, 
                              int pPorciones, int pCalorias, int pGrasa, int pSodio, int pCarbohidratos){
        this.nombre = pNombre;
        this.cantidadPorcion = pCantidadPorcion;
        this.unidadDeMedida = pMedida;
        this.porciones = pPorciones;
        this.calorias = pCalorias;
        this.grasa = pGrasa;
        this.sodio = pSodio;
        this.carbohidratos = pCarbohidratos;
    }
    
    
 

	@Override
	public String toString() {
		return "InformacionComida [nombre=" + nombre + ", cantidadPorcion=" + cantidadPorcion + ", unidadDeMedida="
				+ unidadDeMedida + ", porciones=" + porciones + ", calorias=" + calorias + ", grasa=" + grasa
				+ ", sodio=" + sodio + ", carbohidratos=" + carbohidratos + "]";
	}




	public static class InformacionComidaBuilder {
		private String nestedNombre; 
	    private int nestedCantidadPorcion;
	    private Medida nestedUnidadDeMedida;
	    private int nestedPorciones;
	    private int nestedCalorias;
	    private int nestedGrasa;
	    private int nestedSodio;
	    private int nestedCarbohidratos;
	    
	    public InformacionComidaBuilder (final String nombre, final int cantidadPorcion,final Medida unidadDeMedida) {
	    	this.nestedNombre = nombre;
	    	this.nestedCantidadPorcion = cantidadPorcion;
	    	this.nestedUnidadDeMedida = unidadDeMedida;
	    }
	    
	    public InformacionComidaBuilder porciones(int porciones) {
	    	this.nestedPorciones = porciones;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder calorias (int calorias) {
	    	this.nestedCalorias = calorias;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder grasa (int grasa) {
	    	this.nestedGrasa = grasa;
	    	return this;
	    }
	    
	    public InformacionComidaBuilder sodio (int sodio) {
	    	this.nestedSodio = sodio;
	    	return this;
	    } 
	    
	    public InformacionComidaBuilder carbohidratos (int carbohidratos) {
	    	this.nestedCarbohidratos = carbohidratos;
	    	return this;
	    }
	    
	    
	    public InformacionComida createInformacionComida() {
	    	return new InformacionComida(nestedNombre, nestedCantidadPorcion, nestedUnidadDeMedida, nestedPorciones,
	    			nestedCalorias, nestedGrasa, nestedSodio, nestedCarbohidratos);
	    }
	
	}
 
 
    
    
}
