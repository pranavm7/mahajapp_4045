package com.plantplaces.dto;

public class SpecimenDTO {
	private String latitude;
	private String longitude;
	private int specimenId;
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getlongitude() {
		return longitude;
	}

	public void setlongitude(String longitude) {
		this.longitude = longitude;
	}

	public int getSpecimenId() {
		return specimenId;
	}

	public void setSpecimenId(int specimenId) {
		this.specimenId = specimenId;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return specimenId + " " + latitude + " " + longitude+ " "+ description;
	}
}