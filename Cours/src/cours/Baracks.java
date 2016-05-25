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
public class Baracks <T extends Unit> {
    
    public T Baracks(Class <T> maclass) throws InstantiationException, IllegalAccessException{
        System.out.println("Train");
        return maclass.newInstance();
    }
}
