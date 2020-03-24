package com.webhooks.octoevents.DTO;

import java.util.Date;

public class ResponseDTO {

	private String action;
	private Date created_at;

	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	
}
