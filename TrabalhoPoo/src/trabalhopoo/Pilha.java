/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

/**
 *
 * @author Marcos
 */
public class Pilha extends Item{
    private String tipo;

    public Pilha(String tipo, double preco, String marca, double peso, int id) {
        super(preco, marca, peso, id);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
