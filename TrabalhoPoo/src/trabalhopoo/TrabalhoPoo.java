/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopoo;

import java.util.Date;

/**
 *
 * @author Acer
 */
public class TrabalhoPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mercado tioze=new Mercado();
        Desodorante d1=new Desodorante(2, "azul", "lecsona(man)",new Date(),24,"rexuna",1.20,0);
        tioze.addItem(d1);
        tioze.addPrateleira(new Prateleira(0));
        tioze.getPrateleira(0).addItem(d1);
        tioze.addCarrinho(new Carrinho(0));
        tioze.getCarrinho(0).addItem(d1);
        System.out.println(tioze.getCarrinho(0).getItem(10).getMarca());
    }
    
}
