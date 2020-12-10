/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.LinkedList;

/**
 *
 * @author host
 */
public class Carrinho {
    private int id;
    private LinkedList<Item> itens;
    /**
     * metodo construtor da classe carrinho
     * @param id 
     */
    public Carrinho(int id) {
        itens = new LinkedList<>();
        this.id = id;
    }
    /**
     * retorna a id do carrinho
     * @return 
     */
    public int getId() {
        return id;
    }
    /**
     * adiciona o item ao carrinho
     * @param item 
     */
    public void addItem(Item item){
        itens.add(item);
    }
    /**
     * remove item caso exista no carrinho
     * @param id
     */
    public void dellItem(int id){
        for(int i=0;i<itens.size();i++){
            if(itens.get(i).getId()==id){
                itens.remove(itens.get(i));
                break;
            }
        }
    }
    /**
     * retorna o produto quando o encontra,caso não encontre retorna null
     * @param id
     * @return produto ou null
     */
    public Item getItem(int id){
        for(int i=0;i<itens.size();i++){
            if(itens.get(i).getId()==id){
                return itens.get(i);
            }
        }
        return null;
    }
    /**
     * retorna oque tem dentro do carrinho
     * @return itens
     */
    public LinkedList<Item> getItens(){
        return this.itens;
    }
}
