package com.silicon.demo.model;

import java.util.List;

public class ParentResponse {

	private SchoolDetails details;
	
	private List<SectionDeatils> sectionDeatils;
	
	private List<TransportDetails> transportDetails;

	public SchoolDetails getDetails() {
		return details;
	}

	public void setDetails(SchoolDetails details) {
		this.details = details;
	}

	public List<SectionDeatils> getSectionDeatils() {
		return sectionDeatils;
	}

	public void setSectionDeatils(List<SectionDeatils> sectionDeatils) {
		this.sectionDeatils = sectionDeatils;
	}

	public List<TransportDetails> getTransportDetails() {
		return transportDetails;
	}

	public void setTransportDetails(List<TransportDetails> transportDetails) {
		this.transportDetails = transportDetails;
	}
	
	
	
}
