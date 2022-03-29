package com.training.bean;

public class Stream {

	private String streamType;
	private String sub1;
	private String sub2;
	private String sub3;
	public Stream() {
		super();
	}
	public Stream(String streamType, String sub1, String sub2, String sub3) {
		
		this.streamType = streamType;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public String getStreamType() {
		return streamType;
	}
	public void setStreamType(String streamType) {
		this.streamType = streamType;
	}
	public String getSub1() {
		return sub1;
	}
	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}
	public String getSub2() {
		return sub2;
	}
	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}
	public String getSub3() {
		return sub3;
	}
	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}
	
	
	
	@Override
	public String toString() {
		return "Stream [streamType=" + streamType + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + "]";
	}

	
	
	
}
