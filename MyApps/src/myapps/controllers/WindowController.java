/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myapps.controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import myapps.models.citation;
import myapps.views.Window;


/**
 *
 * @author Matthieu
 */
public class WindowController {
    
    private Window maVue;
    private citation monModel;
    
    public WindowController(){
        maVue = new Window();
        this.initController();
        monModel = new citation();
    }
    public void initController(){
        ActionListener clickMeButtonListener = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                clickMeAction();
            }
        };
        
        this.maVue.getjButton1().addActionListener(clickMeButtonListener);
        this.maVue.setVisible(true);
    }
    public void clickMeAction(){
        this.maVue.getjTextArea1().setText(String.format("%s \n %s \n %s \n", this.monModel.getCitation(),this.monModel.getCitation(),this.monModel.getCitation()));
                
    }
}
