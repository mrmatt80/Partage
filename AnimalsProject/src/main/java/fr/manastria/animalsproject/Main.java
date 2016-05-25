
package fr.manastria.animalsproject;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Animal;

/**
 *
 * @author Matthieu
 */
public class Main {
   public static void main(String[] args){
       try {
           for(Animal animal : Animal.findAll()){
               System.out.println(animal);
           }
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
           } catch (SQLException ex) {
               Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
           }
       
       System.out.println("Main");
       
   } 
}
