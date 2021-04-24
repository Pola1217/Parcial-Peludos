package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	Controller controller;
	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		
		size(1300, 600);
		
	}
	
	public void setup() {
		
		controller= new Controller(this);
		
	}
	
	public void draw() {
		
		
		background(0);
		
		drawText();

		for (int i = 0; i < controller.dog().size(); i++) {

			textSize(13);
			controller.dog().get(i).drawInfo(23+(185*i),300); 
		}
		
	}
	
	public void drawText() {
		
		textSize(20);
		
		text("Fundación Peluditos Sin Hogar", 25, 50);
	
		text("I = ID", 25, 100+20);
		text("N = Name", 25, 100+40);
		text("B = Breed", 25, 100+60);
		text("D = Date of birth", 25, 100+80);
		
		
	}
	
	public void keyPressed() {
		
		controller.sortList(key);
		
	}

}
