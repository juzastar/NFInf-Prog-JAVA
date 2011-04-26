/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author diekmann.florian
 */ 
public class Circle {

	protected double x, y;
	protected double r;
	
	// Der Code con Herrn Simon sieht hier ein this in den Paramtern vor, dies ist jedoch syntaktisch nicht java konform!
	public  Circle (double x, double y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
		
	}
	public double Umfang (){
		
		return 2*Math.PI*this.r;
	}
	
}
 
// Circle myCircle = new Circle (2.0 ,2.0 1.0);
