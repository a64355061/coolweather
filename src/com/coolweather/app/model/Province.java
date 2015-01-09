package com.coolweather.app.model;

public class Province {
	private int _id;
	private String provinceName;
	private String provinceCode;
	public int getId(){
		return _id;
	}
	public void setId(int _id){
		this._id=_id;
		
	}
	public String getProvinceName(){
		return provinceName;
	}
	public void setProvinceName(String provinceName){
		this.provinceName=provinceName;
	}
	public String getProvinceCode(){
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode){
		this.provinceCode=provinceCode;
	}

}
