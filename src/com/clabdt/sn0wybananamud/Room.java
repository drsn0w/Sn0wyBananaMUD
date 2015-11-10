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
	
	public int addConnectionNorth(int connection) {
		if (this.isConnectedNorth()) return -1;
		
		north = connection;
		
		// IMPLEMENT DOORS
		
		return 1;
		
	}
	
	public int addConnectionEast(int connection) {
		if (this.isConnectedEast()) return -1;
		
		east = connection;
	
		return 1;
	}
	
	public int addConnectionWest(int connection) {
		if (this.isConnectedWest()) return -1;
		
		west = connection;
		
		return 1;
		
	}
	
	public int addConnectionSouth(int connection) {
		if (this.isConnectedSouth()) return -1;
		
		south = connection;
		
		return 1;
		
	}
	
	public boolean isConnectedNorth() {
		if (north == 0) return false;
		else return true;
		
		
	}
	
	public boolean isConnectedEast() {
		if (east == 0) return false;
		else return true;
		
	}
	
	public boolean isConnectedWest() {
		if (west == 0) return false;
		else return true;
		
	}
	
	public boolean isConnectedSouth() {
		if (south == 0) return false;
		else return true;
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

