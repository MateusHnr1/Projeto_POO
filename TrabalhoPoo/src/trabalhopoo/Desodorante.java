/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.Date;

/**
 *
 * @author host
 */
public class Desodorante extends Item{
    private double ml;
    private String embalagem;
    private String nome;
    private Date Validade;
    /**
     * meto construtor da classe
     * @param ml
     * @param embalagem
     * @param nome
     * @param Validade
     * @param preco
     * @param marca
     * @param peso
     * @param id 
     */
    public Desodorante(double ml, String embalagem, String nome, Date Validade, double preco, String marca, double peso, int id) {
        super(preco, marca, peso, id);
        this.ml = ml;
        this.embalagem = embalagem;
        this.nome = nome;
        this.Validade = Validade;
    }

    public double getMl() {
        return ml;
    }

    public void setMl(double ml) {
        this.ml = ml;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getValidade() {
        return Validade;
    }

    public void setValidade(Date Validade) {
        this.Validade = Validade;
    }
    
}
