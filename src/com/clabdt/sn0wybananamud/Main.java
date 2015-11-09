package com.clabdt.sn0wybananamud;
import com.clabdt.sn0wybananamud.Server;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		// Command line processing may be added here at later date, that's why there's a shell class for Server
		
		//uncomment to run server
		//Server server = new Server("localhost", 4404);
		//server.run();
		
		runTests();
	}
	
	
	private static void runTests() {
		System.out.println("Running a test!");
	}
	
}
