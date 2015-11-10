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
		
		north = 0;
		south = 0;
		east = 0;
		west = 0;
	}
	
	public String getName() {
		return roomName;
	}

	
	public int addConnection(String direction, int connection) {
		switch (direction) {
			case "north":
				if (this.isConnected(direction)) return -1;
				north = connection;
				return 1;
				
			case "south":
				if (this.isConnected(direction)) return -1;
				south = connection;
				return 1;
				
			case "east":
				if (this.isConnected(direction)) return -1;
				east = connection;
				return 1;
			
			case "west":
				if (this.isConnected(direction)) return -1;
				west = connection;
				return 1;
			
			default:
				return -1;
				
		}
	}
	
	public boolean isConnected(String direction) {
		switch (direction) {
			case "north":
				if (north == 0) return false;
				else return true;
			
			case "south":
				if (south == 0) return false;
				else return true;
				
			case "east":
				if (east == 0) return false;
				else return true;
				
			case "west":
				if (west == 0) return false;
				else return true;
				
			default:
				return false;
		}
			
	}
	
	
	
	//Instance Variables
	private int north;
	private int east;
	private int south;
	private int west;
	
	private int roomID;
	private String roomName;
	private ArrayList<InteractiveObject> interactiveObjects;
	private ArrayList<NonPlayableCharacter> nonPlayableCharacters;
}

