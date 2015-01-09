package com.coolweather.app.model;

public class County {
	private int _id;
	private String countyName;
	private String countyCode;
	private int cityId;
	public int getId(){
		return _id;
	}
	public void setId(int _id){
		this._id=_id;
		
	}
	public String getCountyName(){
		return countyName;
	}
	public void setCountyName(String countyName){
		this.countyName=countyName;
	}
	public String getCountyCode(){
		return countyCode;
	}
	public void setCountyCode(String countyCode){
		this.countyCode=countyCode;
	}
	public int getCityId(){
		return cityId;
	}
	public void setCityId(int cityId){
		this.cityId=cityId;
	}
	

}
