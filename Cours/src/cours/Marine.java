/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours;

import java.util.ArrayList;

/**
 *
 * @author Matthieu
 */
public class Marine extends Unit {

    static{
        quotes = new ArrayList();
        quotes.add("Gogogo");
    }
    
    public Marine(){
        super("Marine",50);
    }
    
}
