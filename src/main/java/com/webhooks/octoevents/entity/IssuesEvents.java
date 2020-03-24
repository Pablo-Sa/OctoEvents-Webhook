package com.webhooks.octoevents.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class IssuesEvents implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private String action;
	
	@Id
	@GeneratedValue
	@JsonIgnore
	private Long idpk;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "issueID")
	private Issue issue;
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "repository_id")
	private Repository repository;
	private Long issuesId;
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "sender_ID")
	private Sender sender;
	
	
	
	
	public Long getIssuesId() {
		return issuesId;
	}
	public void setIssuesId(Long issuesId) {
		this.issuesId = issuesId;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	public Long getIdpk() {
		return idpk;
	}
	public void setIdpk(Long idpk) {
		this.idpk = idpk;
	}
	public Issue getIssue() {
		return issue;
	}
	public void setIssue(Issue issue) {
		this.issue = issue;
	}
	public Repository getRepository() {
		return repository;
	}
	public void setRepository(Repository repository) {
		this.repository = repository;
	}
	public Sender getSender() {
		return sender;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
