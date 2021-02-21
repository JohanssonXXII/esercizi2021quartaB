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
    
    int rompi(int quantitabevuta,int volumeversato){
        System.out.println("Il bicchiere è stato rotto");
        if(volumeversato>0){
            quantitabevuta=0;
        }
        return quantitabevuta;
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

    public int getDurezza() {
        return durezza;
    }

    public void setDurezza(int durezza) {
        this.durezza = durezza;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public int getCapienza() {
        return capienza;
    }

    public void setCapienza(int capienza) {
        this.capienza = capienza;
    }

    public String getMaterialebicchiere() {
        return materialebicchiere;
    }

    public void setMaterialebicchiere(String materialebicchiere) {
        this.materialebicchiere = materialebicchiere;
    }

    public String getTipodibicchiere() {
        return tipodibicchiere;
    }

    public void setTipodibicchiere(String tipodibicchiere) {
        this.tipodibicchiere = tipodibicchiere;
    }

    public int getVolumeinserito() {
        return volumeinserito;
    }

    public void setVolumeinserito(int volumeinserito) {
        this.volumeinserito = volumeinserito;
    }

    public int getQuantitabevuta() {
        return quantitabevuta;
    }

    public void setQuantitabevuta(int quantitabevuta) {
        this.quantitabevuta = quantitabevuta;
    }

    @Override
    public String toString() {
        return "Bicchiere{" + "contenuto=" + contenuto + ", capienza=" + capienza + ", volumeinserito=" + volumeinserito + ", quantitabevuta=" + quantitabevuta + '}';
    }
    
    
    
    
    
    
}
