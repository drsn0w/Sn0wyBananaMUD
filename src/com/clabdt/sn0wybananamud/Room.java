package com.clabdt.sn0wybananamud;

import java.util.ArrayList;
import java.util.List;

public class Room {
	
	
	public Room(int id, String name) {
		
		roomID = id;
		roomName = name;
		// In future, read this from a file
		interactiveObjects = new ArrayList<InteractiveObject>(100);
		nonPlayableCharacters = new ArrayList<NonPlayableCharacter>(100);
	}
	
	
	
	
	
	//Instance Variables
	int roomID;
	String roomName;
	ArrayList<InteractiveObject> interactiveObjects;
	ArrayList<NonPlayableCharacter> nonPlayableCharacters;
}

