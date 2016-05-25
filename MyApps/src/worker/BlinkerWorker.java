/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;

import javax.swing.SwingWorker;

/**
 *
 * @author Matthieu
 */
public class BlinkerWorker extends SwingWorker<Object, Object> {
    
    private boolean continuePlaying = true;
    
    public void setContinuePlaying(boolean continuePlaying){
        this.continuePlaying = continuePlaying;
    }

    @Override
    protected Object doInBackground() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
