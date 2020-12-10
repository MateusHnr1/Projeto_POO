/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author host
 */
public class Item implements BasicI{
    private double preco;
    private String marca;
    private double peso;
    private int id;
    public static int counter=0;
    /**
     * Metodo construtor da classe
     * @param preco
     * @param marca
     * @param peso 
     */
    public Item(double preco, String marca, double peso,int id) {
        this.preco = preco;
        this.marca = marca;
        this.peso = peso;
        this.id=counter;
        counter++;
    }
    
    /**
     * retorna o peso
     * @return peso 
     */
    public double getPeso() {
        return peso;
    }
    /**
     * seta o peso
     *@param peso
    */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    /**
     *seta o preço 
     *@param Preco
    */
    @Override
    public void setPreco(double Preco) {
        this.preco=Preco;
    }
    /**
     * seta a Marca
     * @param Marca 
     */
    @Override
    public void setMarca(String Marca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * retorna o Preço
     * @return preco
     */
    public double getPreco() {
        return preco;
    }
    /**
     * retorna a Marca
     * @return marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     * retorna o ID
     * @return id
     */
    public int getId() {
        return id;
    }
    
}
