package com.webhooks.octoevents.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Labels extends AbstractEntity {

	private Long id;
	private String node_id;
	private String url;
	private String name;
	private String description;
	private String color;
	private Boolean defaults;
}
