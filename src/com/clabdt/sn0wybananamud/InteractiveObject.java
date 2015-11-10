package com.clabdt.sn0wybananamud;

import java.util.ArrayList;

public class InteractiveObject {
	
	public InteractiveObject(int id, String name){
		name = this.name;
		id = this.id;
		customActions = new ArrayList<MUDAction>(MUDConstants.maxElements);
	}
	
	public void registerCustomAction(int id, String name, String action) {
		MUDAction actionToAdd = new MUDAction(id, name, action);
		customActions.add(actionToAdd);
		System.out.println("Registered caller " + actionToAdd.getName() + "at index " + customActions.indexOf(actionToAdd));
	}
	
	private String name;
	private int id;
	
	private ArrayList<MUDAction> customActions;
}
