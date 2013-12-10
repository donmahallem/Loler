package com.mokeu.loler.types;

public enum Region{
	EUW("euw"),NA("na"),EUNE("eune"),TR("tr"),BR("br");
	private String mName;
	Region(String name){
		mName=name;
	}
	@Override
	public String toString(){
		return mName;
	}
}