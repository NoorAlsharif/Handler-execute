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
public class client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Handler h1 = new addnum();
        Handler h2 = new subnum();
        Handler h3 = new divnum();
        Handler h4 = new multnum();
        
        h1.setNextHandler(h2);
        h2.setNextHandler(h3);
        h3.setNextHandler(h4);
        
        Request req = new Request(3,4,"sub");
        
        h1.execute(req);
                
    }
}
