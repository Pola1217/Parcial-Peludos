package view;

import controller.Controller;
import processing.core.PApplet;
import processing.core.PFont;

public class Main extends PApplet {

	Controller controller;
	PFont roney, futura;
	
	public static void main(String[] args) {
		
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		
		size(1300, 500);
		
	}
	
	public void setup() {
		
		roney = createFont("RooneySansBlk.OTF",17);
		futura = createFont("Futura Book font.ttf",20);
		
		controller= new Controller(this);
		
	}
	
	public void draw() {
		
		//System.out.println(mouseX+","+mouseY);
		
		background(219,252,255);
		
		//textSize(20);
		fill(50);
		textFont(roney);
		text("Fundación Peluditos Sin Hogar", 425,44);
	
		textSize(10);
		fill(50);
		
		// user "instructions"
		text("I = ID", 125, 110);
		text("N = Name", 325, 110);
		text("B = Breed", 635, 110);
		text("D = Date of birth", 955, 110);
			
		
		for (int i = 0; i < controller.dog().size(); i++) {

			
			textFont(futura);
			//System.out.println(controller.dog().get(i).getName());
			//System.out.println("si mi reina");
			
			//draw dogs info
			controller.dog().get(i).drawInfo(53+(255*i),350); 
			
		}
		
	}
	
	
	public void keyPressed() {
		
		controller.sortList(key);
		
	}

}
