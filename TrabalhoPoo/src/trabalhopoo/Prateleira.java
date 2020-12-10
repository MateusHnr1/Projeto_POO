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
public class Prateleira  {
    private LinkedList<Item> itens;
    private int id;
    public static int counter=0;

    public Prateleira(int id) {
        this.id = counter;
        counter++;
        itens = new LinkedList<>();
    }
    /**
     * adiciona item na Pratileira
     * @param item 
     */
    public void addItem(Item item){
        itens.add(item);
    }
    /**
     * apaga o item da pratileira
     * @param item 
     */
    public void delItem(Item item){
        itens.remove(item);
    }
    /**
     * retorna o produto quando o encontra,caso não encontre retorna null 
     * @param id
     * @return produto, null 
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
     * retorna id da pratileira
     * @return id
     */
    public int getId() {
        return id;
    }
}
