/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica3;

import Item.Item;

/**
 *
 * @author arthur
 */
public class Pratica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //@TODO: m = ordem da árvore, pesquisar o que siguinifica ordem de uma árvore.
        
        int total = 10000;
        
        ArvoreB a1 = new ArvoreB(0);
        ArvoreB a2 = new ArvoreB(0);
        ArvoreB a3 = new ArvoreB(0);
        ArvoreB a4 = new ArvoreB(0);
        ArvoreB a5 = new ArvoreB(0);
        ArvoreB a6 = new ArvoreB(0);
        ArvoreB a7 = new ArvoreB(0);
        ArvoreB a8 = new ArvoreB(0);
        ArvoreB a9 = new ArvoreB(0);
        ArvoreB a10 = new ArvoreB(0);
        
        for (total = 1000; total < 100000; total = total + 10000){
            for (int it = 0; it < total; it++){
                switch (total){
                    case 10000:
                        a1.insere(new Item(it));
                        break;
                    case 20000:
                        a2.insere(new Item(it));
                        break;
                    case 30000:
                        a3.insere(new Item(it));
                        break;
                    case 40000:
                        a4.insere(new Item(it));
                        break;
                    case 50000:
                        a5.insere(new Item(it));
                        break;
                    case 60000:
                        a6.insere(new Item(it));
                        break;
                    case 70000:
                        a7.insere(new Item(it));
                        break;
                    case 80000:
                        a8.insere(new Item(it));
                        break;
                    case 90000:
                        a9.insere(new Item(it));
                        break;
                    case 100000:
                        a10.insere(new Item(it));
                        break;
                }
            }
        }
                
    }
    
}
