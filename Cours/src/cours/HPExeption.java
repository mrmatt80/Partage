/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours;

/**
 *
 * @author Matthieu
 */
public final class HPExeption extends Exception{
    
     public HPExeption(){
         System.out.println("HP must be equal to hpmax or superior to 0");
     }
}
