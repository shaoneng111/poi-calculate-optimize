package org.hoops.studydemo.calculate.optimize;

public class GartenInfo {

	//序号
	private int number;
	//地区
	private String region;
	//省份
	private String province;
	//地市/区
	private String city;
	//学生总人数
	private int stutotal;
	//教师人数
	private int teatotal;
	//园所属性
	private String gartenproperty;
	//各年龄段人数（不区分性别）
	private int[] stunumwithoutsex;
	//各年龄段人数（区分性别）
	private int[] stunumwithsex;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getStutotal() {
		return stutotal;
	}
	public void setStutotal(int stutotal) {
		this.stutotal = stutotal;
	}
	public int getTeatotal() {
		return teatotal;
	}
	public void setTeatotal(int teatotal) {
		this.teatotal = teatotal;
	}
	public String getGartenproperty() {
		return gartenproperty;
	}
	public void setGartenproperty(String gartenproperty) {
		this.gartenproperty = gartenproperty;
	}
	public int[] getStunumwithoutsex() {
		return stunumwithoutsex;
	}
	public void setStunumwithoutsex(int[] stunumwithoutsex) {
		this.stunumwithoutsex = stunumwithoutsex;
	}
	public int[] getStunumwithsex() {
		return stunumwithsex;
	}
	public void setStunumwithsex(int[] stunumwithsex) {
		this.stunumwithsex = stunumwithsex;
	}
	
	
}
