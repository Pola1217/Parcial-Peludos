package model;


import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	
	private String[] text1;
	private String[] text2;
	
	private LinkedList<Dog> dog;
	
	private String[] saveId, saveName, saveBreed, saveDate;
	
	public Logic (PApplet app) {
		
		this.app = app;
		
		dog = new LinkedList<Dog>();
		
		saveId = new String[5];
		saveName = new String[5];
		saveBreed = new String[5];
		saveDate = new String[5];
		
		
	}
	
	public void createtext (PApplet app) {
		
		text1 = app.loadStrings("texto/txt1.txt");
		text2 = app.loadStrings("texto/txt2.txt");
		
		for (int i = 0; i < text1.length; i++) {
			
			String[] Text1 = text1[i].split (",");
			
			String id = Text1[0];
			
			String name = Text1[1];

			for (int j = 0; j < text2.length; j++) {

				String[] Text2 = text2[j].split(",");

				if (id ==  Text2[0]) {
					
					String breed = Text2[1];
					
					String date = Text2[2];
					
					dog.add (new Dog (app, id, name, breed, date));
				}
			}

		}
		
	}
	
	public void sortList(char key) {
		
		
		
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public String[] getText1() {
		return text1;
	}

	public void setText1(String[] text1) {
		this.text1 = text1;
	}

	public String[] getText2() {
		return text2;
	}

	public void setText2(String[] text2) {
		this.text2 = text2;
	}

	public LinkedList<Dog> getDog() {
		return dog;
	}

	public void setDog(LinkedList<Dog> dog) {
		this.dog = dog;
	}

	public String[] getSaveId() {
		return saveId;
	}

	public void setSaveId(String[] saveId) {
		this.saveId = saveId;
	}

	public String[] getSaveName() {
		return saveName;
	}

	public void setSaveName(String[] saveName) {
		this.saveName = saveName;
	}

	public String[] getSaveBreed() {
		return saveBreed;
	}

	public void setSaveBreed(String[] saveBreed) {
		this.saveBreed = saveBreed;
	}

	public String[] getSaveDate() {
		return saveDate;
	}

	public void setSaveDate(String[] saveDate) {
		this.saveDate = saveDate;
	}
	
}
