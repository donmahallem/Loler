package com.mokeu.loler.types;

public enum Tier{
	RANKED_SOLO_5x5("RANKED_SOLO_5x5"),
	RANKED_TEAM_3x3("RANKED_TEAM_3x3"),
	RANKED_TEAM_5x5("RANKED_TEAM_5x5");
	private String mName;
	Tier(String name){
		mName=name;
	}
	public String getName(){
		return mName;
	}
}