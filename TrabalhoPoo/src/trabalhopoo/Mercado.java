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
public class Mercado {
    private LinkedList<Prateleira> pratileiras;
    private LinkedList<Item> itens;
    private LinkedList<Carrinho> carrinhos;

    public Mercado() {
        pratileiras = new LinkedList<>();
        itens= new LinkedList<>();
        carrinhos= new LinkedList<>();
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
     * adiciona itens ao mercado
     * @param item 
     */
    public void addItem(Item item){
        itens.add(item);
    }
    /**
     * retira o item do mercado
     * @param item 
     */
    public void delItem(Item item){
        itens.remove(item);
    }
    /**
     * retorna o que há de produto no mercado
     * @return itens
     */
    public LinkedList<Item> getItens(){
        return this.itens;
    }
    /**
     * adiciona uam prateleira a mais no mercado
     * @param p 
     */
    public void addPrateleira(Prateleira p){
        pratileiras.add(p);
    }
    /**
     * removendo uma prateleira
     * @param id 
     */
    public void delPrateleira(int id){
        for(Prateleira p:pratileiras){
            if(p.getId()==id){
                pratileiras.remove(p);
            }
        }
    }
    /**
     * retorna prateleira caso exista no mercado
     * @param id
     * @return prateleira ou null
     */
    public Prateleira getPrateleira(int id){
         for(Prateleira p:pratileiras){
            if(p.getId()==id){
                return p;
            }
        }
         return null;
    }
    /**
     * adiciona 1 carrinho ao mercado
     * @param c 
     */
    public void addCarrinho(Carrinho c){
        carrinhos.add(c);
    }
    /**
     * remove o carrinho do Mercado
     * @param c 
     */
    public void delCarrinho(Carrinho c){
        carrinhos.remove(c);
    }
    public void delCarrinho(int id){
         for(Carrinho c:carrinhos){
            if(c.getId()==id){
                carrinhos.remove(c);
            }
        }
    }
    /**
     * retorna o carrinho procurado
     * @param id
     * @return 
     */
    public Carrinho getCarrinho(int id){
        for(Carrinho c:carrinhos){
            if(c.getId()==id){
               return c;
            }
        }
        return null;
    }
}
