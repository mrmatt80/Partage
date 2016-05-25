/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Matthieu
 */
public abstract class Unit {
     
    protected static ArrayList<String> quotes = null;
    
    private String name;
    private int hp;
    private int hpmax;
    
    public Unit(String name, int hpmax){
        this.name= name;
        this.hpmax=hpmax;
        this.hp=hpmax;
    }
    public String toString(){
        return String.format("%s : %s",this.name,this.hp);
    }
    public String Parler(){
        return quotes.get(new Random().nextInt(quotes.size()));
    }
    public void setHp(int hp)throws HPExeption {
        if(hp>this.hpmax){
            throw new HPExeption();
        }
        if(hp<0){
            throw new HPExeption();
        }
        hp=this.hp;
    }
}
