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
public class Request {
    
    private int number1;
    private int number2;
    
    private String requested;
    
    public Request(int num1, int num2, String req){
        
        number1 = num1;
        number2 = num2;
        requested = req;
        
    }
    
    public int getNum1(){
        return number1;
    }
    
    public int getNum2(){
        return number2;
    }
    
    public String getReq() {
        return requested;
    }
    
    
    
    
}
