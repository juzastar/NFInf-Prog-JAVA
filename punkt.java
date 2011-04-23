/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diekmann.florian
 */
public class punkt {
    private int x;
    private int y;
    /**
     * @param args the command line arguments
     
     */
    public int getX(){
       return x ;
    }
    public int getY(){
       return y ;
    }
    
    public void setX(int i){
        x = i;
    }
    public void setY(int i){
        y = i;
    }
    public static void main(String[] args) {
       punkt p = new punkt();
        p.setX(10);
        p.setY(42);
        System.out.println(p.getX() + p.getY());
       
        
    }
}
