package com.mokeu.loler;

import javax.swing.plaf.synth.Region;

public class QueryBuilder{
	private static String mApiKey;
	public final static String SERVER_URL="http://prod.api.pvp.net/api/lol/";
	public final static String USER_API="/v1.1/summoner/";
	public static void init(String apikey){
		mApiKey=apikey;
	}
	protected static String getApiKey(){
		return mApiKey;
	}
	public static String getSummonerById(Region region,long id){
		return SERVER_URL+region.toString()+USER_API+id;
	}
	
}