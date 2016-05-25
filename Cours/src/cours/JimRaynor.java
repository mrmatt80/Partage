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
public final class JimRaynor extends Marine {

    private static volatile JimRaynor instance = null;

    public static JimRaynor getJimRaynor() {

        if (instance == null) {
            instance = new JimRaynor();
        }
        return instance;
    }

    private JimRaynor() {
        super();
    }

    public void hourra() {
        System.out.println("Hourraaaaaaa");
    }
}
