package com.clabdt.sn0wybananamud;

public class MUDAction {
	
	public MUDAction(int id, String name, String action) {
		
		id = this.id;
		name = this.name;
		action = this.action;
	
	}
	
	public String doAction() {
		return action;
	}
	
	public String getName() {
		return name;
	}

	
	private int id;
	private String name;
	private String action;
}
