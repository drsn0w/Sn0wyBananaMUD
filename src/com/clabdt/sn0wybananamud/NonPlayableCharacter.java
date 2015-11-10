package com.clabdt.sn0wybananamud;

public class NonPlayableCharacter extends InteractiveObject {

	public NonPlayableCharacter(int id, String name, String welcomeReply) {
		super(id, name);
		welcomeReply = this.welcomeReply;
	}
	
	
	private String welcomeReply;
	
	
}
