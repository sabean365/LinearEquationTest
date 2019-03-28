/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearequationtest;

/* Sarah E. Bean
 * Main method to test Linear Equation class methods
 * Get user input and output calculations.
 */

import java.util.*;

public class LinearEquationTest {

	public static void main(String[] args) {

		//Initialize variables
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double d = 0.0;
		double e = 0.0;
		double f = 0.0;

		//Create scanner
		Scanner input = new Scanner(System.in);

		//Header
		System.out.println("----------Algebraic Linear Equations----------");
		System.out.println("------x = (e*d) - (b*f) / (a*d) - (b*c)-------");
		System.out.println("------y = (a*f) - (e*c) / (a*d) - (b*c)-------");
		System.out.println("");


		//Prompt the user for 6 numbers and assign them to a, b, c, d, e, f
		System.out.print("Enter a number for a: ");
		a = input.nextDouble();

		System.out.print("Enter a number for b: ");
		b = input.nextDouble();

		System.out.print("Enter a number for c: ");
		c = input.nextDouble();

		System.out.print("Enter a number for d: ");
		d = input.nextDouble();

		System.out.print("Enter a number for e: ");
		e = input.nextDouble();

		System.out.print("Enter a number for f: ");
		f = input.nextDouble();

		input.close();

		//Create instance of LinearEquation object
		LinearEquation lineq = new LinearEquation(a, b, c, d, e, f);

		//Conditional statement
		if(lineq.isSolvable())
		{
			//output results
			System.out.printf("The value of x is: " + "%6.2f", lineq.getX());
			System.out.println("");
			System.out.printf("The value of y is: " + "%6.2f", lineq.getY());
		}
		else
		{

			//output error
			System.out.println("The equation has no solution. Cannot divide by 0");
		}

	}

}
