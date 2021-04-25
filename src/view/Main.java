package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	Controller controller;
	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		
		size(1300, 500);
		
	}
	
	public void setup() {
		
		controller= new Controller(this);
		
	}
	
	public void draw() {
		
		//System.out.println(mouseX+","+mouseY);
		
		background(255);
		
		textSize(20);
		fill(50);
		
		text("Fundación Peluditos Sin Hogar", 500,44);
	
		// user "instructions"
		text("I = ID", 125, 110);
		text("N = Name", 325, 110);
		text("B = Breed", 635, 110);
		text("D = Date of birth", 955, 110);
			
		
		for (int i = 0; i < controller.dog().size(); i++) {

			textSize(15);
			
			System.out.println(controller.dog().get(i).getName());
			System.out.println("si mi reina");
			//draw dogs info
			controller.dog().get(i).drawInfo(23+(205*i),300); 
			
		}
		
	}
	
	
	public void keyPressed() {
		
		controller.sortList(key);
		
	}

}
