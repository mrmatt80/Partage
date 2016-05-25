/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapps.models;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Matthieu
 */
public class citation {
    
    private ArrayList<String> quote;
    private Random r = new Random();
        public citation(){
        quote = new ArrayList();
        this.remplissage();
    }
    
    public void setQuote(ArrayList<String> quote) {
        this.quote = quote;
    }
    public void remplissage(){
        quote.add("C'est les dresseurs Pokémouilles, ça faut connaître, madame ! Ca quand on connaît pas on ferme sa gueule madame !");
        quote.add("Ne mets pas tes tétons dans l'agrafeuse ! Tu risques de te faire pincer... Hmm... Très très fort...");
        quote.add("Allez Aspifouette, rentre à la Pokéboule. Mais tu vas rentrer... Sale... (explose) Et merde.");
        quote.add("OH C'EST QUI L'PATRON ? C'EST QUI L'PATRON ? OOOOOH J'SUIS BIEN LÀ. J'SUIS BIEN LÀ. OOOOH J'BOUGE PLUS. OOOOOOH !");
        quote.add("Mon coup n'est pas fatal, mais il fait parfois mal ! Souvent je suis dressé, et sens bon la marée... Quiiii suis-je ?");
        quote.add("Et là ton Aspifion, ça devient un Aspifouette.");
        quote.add("e dois absolument répondre à cette question, sans ça, je risque de perdre confiance en moi ! Mon équipe compte sur moi !");
        quote.add("Je me flétris au contact du vent, sous mes poils gris ça sent le parmesan... Qui suis-je ?");
        
        
    }
    
   public String getCitation(){
       return quote.get(r.nextInt(quote.size()));     
   }

    public ArrayList<String> getQuote() {
        return quote;
}

    
    
}
