/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bevanda;

/**
 *
 * @author Aimen
 */
public class Bicchiere {
    
    int durezza;
    String contenuto;
    int capienza;
    String materialebicchiere;
    String tipodibicchiere;
    int volumeinserito;
    int quantitabevuta;
    
    
    
    
    int riempi(int volumeinserito , int capienza){

        if(volumeinserito>capienza){
            volumeinserito=capienza;
            
        }
        
        return volumeinserito;
    }
    
    void rompi(int quantitabevuta,int volumeversato){
        System.out.println("Il bicchiere è stato rotto");
        if(volumeversato>0){
            quantitabevuta=0;
        }
    }
    
    int bevi(int volumeinserito,int quantitabevuta,int capienza){
        if(quantitabevuta==volumeinserito || quantitabevuta>volumeinserito){
            capienza=0;
        }
        
        if(quantitabevuta<volumeinserito){
            capienza=volumeinserito-quantitabevuta;
        }
        
        return capienza;
    }
    
    
    
    
    
}
