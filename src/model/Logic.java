package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;
	
	//text
	private String[] text1;
	private String[] text2;
	
	//list
	private LinkedList<Dog> dog;
	
	//classes for partial ordering
	DogName Name;
	DogBreed Breed;
	DogDate Date;
	
	//saves lists by attributes
	private String[] saveId, saveName, saveBreed, saveDate;
	
	public Logic (PApplet app) {
		
		this.app = app;
		
		dog = new LinkedList<Dog>();
		
		Name = new DogName();
		Breed = new DogBreed();
		Date = new DogDate();
		
		saveId = new String[5];
		saveName = new String[5];
		saveBreed = new String[5];
		saveDate = new String[5];
		
		
	}
	
	public void createtext (PApplet app) {
		
		text1 = app.loadStrings("texto/txt1.txt");
		text2 = app.loadStrings("texto/txt2.txt");
		
		for (int i = 0; i < text1.length; i++) {
			
			String[] Line1 = text1[i].split (" ");
			
			int id = Integer.parseInt (Line1[0]);
			
			String name = Line1[1];

			for (int j = 0; j < text2.length; j++) {

				String[] Line2 = text2[j].split(" ");
				
				int id2 = Integer.parseInt (Line2[0]);
				
				if (id == id2) {
					
					String breed = Line2[1];
					
					String date = Line2[2];
					
					dog.add (new Dog (app, id, name, breed, date));
					
				}
			}

		}

	}
	
	
	public void sortList(char key) {
		
	//keys for the ordering	
		switch (key) {
		
		//ID (natural)
		case 'i':
			
			Collections.sort(dog);
			
			for (int i = 0; i < dog.size(); i++) {

				String id = Integer.toString(dog.get(i).getId());
				
				String name = dog.get(i).getName().toLowerCase();
				
				String breed = dog.get(i).getBreed().toLowerCase();
				
				String date = dog.get(i).getDate();
				
				String line = id + " " + name + " " + breed + " " + date;

				saveId[i] = line;
				
				app.saveStrings("SaveId.txt", saveId);
			}
			
			break;

		//Name
		case 'n':
			
			Collections.sort(dog, Name);
			
			for (int i = 0; i < dog.size(); i++) {

				String id = Integer.toString(dog.get(i).getId());
				
				String name = dog.get(i).getName().toLowerCase();
				
				String breed = dog.get(i).getBreed().toLowerCase();
				
				String date = dog.get(i).getDate();
				
				String line = id + " " + name + " " + breed + " " + date;

				saveName[i] = line;

				app.saveStrings("Savename.txt", saveName);
			}
			break;
		
		//Breed
		case 'b':
			
			Collections.sort(dog, Breed);
			
			for (int i = 0; i < dog.size(); i++) {

				String id = Integer.toString(dog.get(i).getId());
				
				String name = dog.get(i).getName().toLowerCase();
				
				String breed = dog.get(i).getBreed().toLowerCase();
				
				String date = dog.get(i).getDate();
				
				String line = id + " " + name + " " + breed + " " + date;

				saveBreed[i] = line;

				app.saveStrings("Savebreed.txt", saveBreed);
			}
			break;
			
		//Date
		case 'd':
			
			Collections.sort(dog, Date);
			
			for (int i = 0; i < dog.size(); i++) {

				String id = Integer.toString(dog.get(i).getId());
				
				String name = dog.get(i).getName().toLowerCase();
				
				String breed = dog.get(i).getBreed().toLowerCase();
				
				String date = dog.get(i).getDate();
				
				String line = id + " " + name + " " + breed + " " + date;


				saveDate[i] = line;
				

				app.saveStrings("Savedate.txt", saveDate);
			}
			break;
			
		default:
			
			break;
			
		}
		
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
