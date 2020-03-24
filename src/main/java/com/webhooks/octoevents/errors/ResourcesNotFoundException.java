package com.webhooks.octoevents.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourcesNotFoundException  extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public ResourcesNotFoundException(String message) {
      	super(message);	
	}

}