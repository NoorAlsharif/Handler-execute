/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_01_cor;

/**
 *
 * @author nooralsharif
 */
public class BaseHandler implements Handler{
    
    private Handler next;
    
    @Override
    public void setNextHandler(Handler nextH){
        this.next = nextH;
    }
    
    @Override
    public void execute (Request number){
        
        if(next != null){
            next.execute(number);
        }
    }
}
