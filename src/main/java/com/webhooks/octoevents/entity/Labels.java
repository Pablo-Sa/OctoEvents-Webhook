package com.webhooks.octoevents.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Labels implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idpk;
	private Long id;
	private String node_id;
	private String url;
	private String name;
	private String description;
	private String color;
	private Boolean defaults;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNode_id() {
		return node_id;
	}
	
	public Long getIdpk() {
		return idpk;
	}
	public void setIdpk(Long idpk) {
		this.idpk = idpk;
	}
	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getDefaults() {
		return defaults;
	}
	public void setDefaults(Boolean defaults) {
		this.defaults = defaults;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
