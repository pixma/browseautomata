package com.browseautomata.app;

import com.browseautomata.app.NetLookup;

public class admin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NetLookup("netlookup", 30000, "8.8.8.8" ).start();
	}
}
