package com.clabdt.sn0wybananamud;

import java.util.ArrayList;
import java.util.List;
import com.clabdt.sn0wybananamud.Room;

public class Universe {
	
	
	public Universe(int id, String name) {
		
		universeID = id;
		universeName = name;
		// In future, read this from a file
		universeRooms = new ArrayList<Room>(100);
	}
	
	
	
	
	
	//Instance Variables
	int universeID;
	String universeName;
	ArrayList<Room> universeRooms;
	

}
