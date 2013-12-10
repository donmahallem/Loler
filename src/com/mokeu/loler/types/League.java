package com.mokeu.loler.types;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class League extends AbstractType{

	@Expose
	@SerializedName("name")
	private String mName;
	@Expose
	@SerializedName("queue")
	private String mQueue;
	@Expose
	@SerializedName("tier")
	private String mTier;
	@Expose
	@SerializedName("timestamp")
	private long mTimestamp;
}