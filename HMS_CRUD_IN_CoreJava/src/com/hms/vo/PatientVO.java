package com.hms.vo;

public class PatientVO {
	
	private int id ;
	private String first ;
	private String last ;
	private String city;
	private String disease;
	private String email;
	
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	@Override
	public String toString() {
		return "PatientVO [id=" + id + ", first=" + first + ", last=" + last + ", city=" + city + ", disease=" + disease
				+ "]";
	}

	

}
