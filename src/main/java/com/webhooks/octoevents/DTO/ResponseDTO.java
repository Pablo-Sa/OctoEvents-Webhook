package com.webhooks.octoevents.DTO;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO {

	private String action;
	private Date created_at;
	
}
