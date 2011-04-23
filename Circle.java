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
	
	public  Circle (double x, double y, double r){
		this.x = x;
		this.y = y;
		this.r = r;
		
	}
	public double Umfang (){
		
		return 2*Math.PI*this.r;
	}
	
}
