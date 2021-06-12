package com.effectivejava.tutorial.effectivejava.itema12;

public class Request {

	public String header;
	public String body;
	
	
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
	
//	@Override
//	public String toString() {
//		return "Request [header=" + header + ", body=" + body + "]";
//	}
	
//	public String toString() {
//		return new com.google.gson.Gson().toJson(this);
//	}
	
	
	
}
