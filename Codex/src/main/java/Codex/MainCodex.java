/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codex;
import fr.manastria.codex.Controller.BDController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import fr.manastria.codex.Controller.WindowController;
import java.util.ArrayList;
import Models.Personne;

/**
 *
 * @author Matthieu
 */
public class MainCodex {

    public static void main(String[] args) {

        ArrayList<Personne> plist = new ArrayList();
        try {
            for (Personne out : BDController.findAll()) {
                System.out.println(out);
                plist.add(out);

            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainCodex.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainCodex.class.getName()).log(Level.SEVERE, null, ex);
        }
        WindowController WindowController = new WindowController(plist);

    }
}
