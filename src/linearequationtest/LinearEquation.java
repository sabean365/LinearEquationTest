/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearequationtest;

/* Sarah E. Bean
 * This program will prompt the user for 6 numbers and then calculate the following linear equations:
 * ax + by = e; cx + dy= f; where x = (ed - bf) / (ad - bc) and y = (af - ec) / (ad - bc)
 */



public class LinearEquation {

	//declare private variables
	private double a, b, c, d, e, f;

	//default constructor
	public LinearEquation() {

	}

	//parameterized constructor
	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	//getter methods
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	//isSolvable method to determine if denominator is 0 (cannot divide by 0).
	public boolean isSolvable() {

		if((a*d) - (b*c) == 0) {
			return false;
		}
		else
		{
			return true;
		}
	}

	//method getX
	public double getX() {

		//declare x variable
		double x;
		//assign value to x
		x = (e*d) - (b*f) / (a*d) - (b*c);
		//return x
		return x;

	}

	public double getY() {

		//declare y variable
		double y;
		//assign value to x
		y = (a*f) - (e*c) / (a*d) - (b*c);
		//return y
		return y;

	}

}
