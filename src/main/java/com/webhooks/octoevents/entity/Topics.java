package com.webhooks.octoevents.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Topics implements Serializable {



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long idpk;
	private String topics;
	
	public Long getIdpk() {
		return idpk;
	}
	public void setIdpk(Long idpk) {
		this.idpk = idpk;
	}
	public String getTopics() {
		return topics;
	}
	public void setTopics(String topics) {
		this.topics = topics;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
