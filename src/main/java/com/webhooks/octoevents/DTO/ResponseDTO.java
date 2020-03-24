package com.webhooks.octoevents.DTO;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ResponseDTO {

	private String action;
	private Date created_at;
	
}
