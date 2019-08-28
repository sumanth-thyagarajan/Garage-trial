package com.programcreek.helloworld.controller;

import java.util.HashMap;

public class EliteMembers {
	
	private HashMap<String, String> Users;
	public EliteMembers() {
		// TODO Auto-generated constructor stub
		Users.put("TN81z7537", "sumanth@1234");
		Users.put("TN82x7537", "sumanth@123");
		Users.put("TN81c7537", "sumanth@12");
		Users.put("TN81v7537", "sumanth@1");
		Users.put("TN81b7537", "sumanth@");
		Users.put("TN81Z7537", "sumanth");
	}
	String getkey(String reg)
	{
		String s=(String)Users.get(reg);
		return s;
	}

}
