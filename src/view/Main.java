package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	Controller controller;
	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		
		size(1300, 800);
		
	}
	
	public void setup() {
		
		controller= new Controller(this);
		
	}
	
	public void draw() {
		
		System.out.println(mouseX+","+mouseY);
		
		background(255);
		
		drawText();
		
		for (int i = 0; i < controller.dog().size(); i++) {

			textSize(15);
			
			controller.dog().get(i).drawInfo(23+(205*i),300); 
			
		}
		
	}
	
	public void drawText() {
		
		textSize(20);
		
		fill(50);
		text("Fundación Peluditos Sin Hogar", 500,44);
	
		text("I = ID", 125, 110);
		text("N = Name", 325, 110);
		text("B = Breed", 635, 110);
		text("D = Date of birth", 955, 110);
		
	}
	
	public void keyPressed() {
		
		controller.sortList(key);
		
	}

}
