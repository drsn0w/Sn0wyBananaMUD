package com.clabdt.sn0wybananamud;

import java.lang.*;
import java.io.*;
import java.net.*;


public class Server {
	
	/**
	 * Returns a Server which can be run()d
	 * 
	 * @param bindip	the IP address the server should bind to (not implemented)
	 * @param bindPort	the port the server should bind to
	 * @return			a Server object
	 */
	public Server(String bindip, int bindPort) {
		
		boundToIp = bindip;
		boundToPort = bindPort;
		System.out.println("Setting up a server on IP" + boundToIp + "on port " + boundToPort);
		try {
			server = new ServerSocket(boundToPort);
		} catch(Exception myBananaExceptionAndEclipseIsDumb) {
			System.out.println(myBananaExceptionAndEclipseIsDumb);
			System.out.println("Aborted.");
		}
		
	}
	
	/**
	 * Runs the server and accepts incoming connections
	 */
	public void run() {
		//threading to come LATER!
		try {
			Socket connection = server.accept();
			// @variable outputStream: the PrintWriter stream to WRITE to the client
			PrintWriter outputStream = new PrintWriter(connection.getOutputStream(), true);
			
			System.out.println("Connected to a client...");
			outputStream.print("Connected to the server! Congratulations!");
			
			//MORE CODE GOES HERE!
			
			//close the streams and connection
			outputStream.close();
			connection.close();
			
		} catch (Exception x) {
			System.out.println(x);
			System.out.println("Aborted.");
		}
	}
	
	
	
	
	// Instance Variables
	private String boundToIp;
	private int boundToPort;
	private ServerSocket server;
}
