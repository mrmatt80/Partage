package fr.manastria.codex.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.CodexWindow;
import Models.Personne;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

/*
 * @author Matthieu
 */
public class WindowController {
    
    private CodexWindow maVue;
    private Personne monModel;
    private ArrayList<Personne> plist;
    
    public WindowController() {
        maVue = new CodexWindow();
        this.initController();
        monModel = new Personne();
    }
    
    public WindowController(ArrayList<Personne> plist) {
        maVue = new CodexWindow();
        this.initController();
        monModel = new Personne();
        this.plist = plist;        
    }
    
    public void initController() {
        ActionListener refresh = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clickMeActionRefresh();
            }
        };
        ActionListener add = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    clickMeActionAdd();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(WindowController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(WindowController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        
        this.maVue.getjButton3().addActionListener(refresh);
        this.maVue.getjButton1().addActionListener(add);
        this.maVue.setVisible(true);
    }
    
    public void clickMeActionRefresh() {
        DefaultListModel listModel = new DefaultListModel();
        int i ;
        for (i=0 ;i<plist.size();i++) {
           listModel.addElement(plist.get(i));
        }
        this.maVue.getjList1().setModel(listModel);
        
    }
    public void clickMeActionAdd() throws ClassNotFoundException, SQLException{
        String nom = this.maVue.getjTextField1().getText();
        String prenom=this.maVue.getjTextField2().getText();
        int age =Integer.parseInt(this.maVue.getjTextField3().getText());
        String comment =this.maVue.getjTextArea2().getText();
        String photo =this.maVue.getjScrollPane3().getName();
        Personne personne = new Personne(-1,nom, prenom, age, comment, photo);
        personne.save();
        
    }
}
