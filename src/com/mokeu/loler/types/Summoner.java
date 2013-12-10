package com.mokeu.loler.types;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Summoner extends AbstractType{
	@Expose
	@SerializedName("name")
	private String mName="";
	@Expose
	@SerializedName("profileIconId")
	private int mProfileIconId=0;
	@Expose
	@SerializedName("revisionDate")
	private long mRevisionDate=0;
	@Expose
	@SerializedName("revisionDateStr")
	private Date mRevisionDateStr;
	@Expose
	@SerializedName("summonerLevel")
	private long mSummonerLevel;
	@Expose
	@SerializedName("id")
	private long mId;
	public final long getID(){
		return mId;
	}
	public String getName(){
		return mName;
	}
	public int getProfileIconId(){
		return mProfileIconId;
	}
	public long getRevisionDate(){
		return mRevisionDate;
	}
	public Date getRevisionDateStr(){
		return mRevisionDateStr;
	}
	public long getSummonerLevel(){
		return mSummonerLevel;
	}
}