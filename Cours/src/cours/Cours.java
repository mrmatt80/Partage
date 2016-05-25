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
public abstract class Cours {

    public String name;
    public int hp;
    public int mineralCoast;

    public int vespenCoast;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMineralCoast() {
        return mineralCoast;
    }

    public int getVespenCoast() {
        return vespenCoast;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMineralCoast(int mineralCoast) {
        this.mineralCoast = mineralCoast;
    }

    public void setVespenCoast(int vespenCoast) {
        this.vespenCoast = vespenCoast;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
