package com.clabdt.sn0wybananamud;

import java.util.ArrayList;
import java.util.List;
import com.clabdt.sn0wybananamud.Room;

public class Universe {
	
	
	public Universe(int id, String name) {
		id = this.id;
		name = this.name;
		// In future, read this from a file
		rooms = new ArrayList<Room>(MUDConstants.maxElements);
	}
	
	public void addRoom(int id, String name) {
		Room roomToAdd = new Room(id, name);
		rooms.add(roomToAdd);
		System.out.println("Added room " + roomToAdd.getName() + " at index " + rooms.indexOf(roomToAdd));	
	}
	
	
	
	//Instance Variables
	private int id;
	private String name;
	private ArrayList<Room> rooms;
	

}
