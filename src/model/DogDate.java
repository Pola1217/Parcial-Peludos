package model;

import java.util.Comparator;

public class DogDate implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {

		return o1.getDate().compareTo(o2.getDate());
		
	}
	
}
