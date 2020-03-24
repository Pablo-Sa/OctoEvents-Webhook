package com.webhooks.octoevents.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Issue implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idpk;
	private String url;
	private String repository_url;
	private String labels_url;
	private String comments_url;
	private String events_url;
	private String html_url;
	private Long id;
	private String node_id;
	private Integer number;
	private String title;
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name="user_idpk")
	private Users user;
	@Transient
	private List<Labels> labelsList = new ArrayList<>();
	private String state;
	private Boolean locked;
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name="assignee_idpk")
	private Assignee assignee;
	@Transient
	private List<Assignee> assignees = new ArrayList<>();
	private Boolean milestone;
	private Integer comments;
	private Date created_at;
	private Date updated_at;
	private Date closed_at;
	private String author_association;
	private String body;

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getRepository_url() {
		return repository_url;
	}
	public void setRepository_url(String repository_url) {
		this.repository_url = repository_url;
	}
	public String getLabels_url() {
		return labels_url;
	}
	public void setLabels_url(String labels_url) {
		this.labels_url = labels_url;
	}
	public String getComments_url() {
		return comments_url;
	}
	public Long getIdpk() {
		return idpk;
	}
	public void setIdpk(Long idpk) {
		this.idpk = idpk;
	}
	public void setComments_url(String comments_url) {
		this.comments_url = comments_url;
	}
	public String getEvents_url() {
		return events_url;
	}
	public void setEvents_url(String events_url) {
		this.events_url = events_url;
	}
	public String getHtml_url() {
		return html_url;
	}
	public void setHtml_url(String html_url) {
		this.html_url = html_url;
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNode_id() {
		return node_id;
	}
	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public List<Labels> getLabelsList() {
		return labelsList;
	}
	public void setLabelsList(List<Labels> labelsList) {
		this.labelsList = labelsList;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Boolean getLocked() {
		return locked;
	}
	public void setLocked(Boolean locked) {
		this.locked = locked;
	}
	public Assignee getAssignee() {
		return assignee;
	}
	public void setAssignee(Assignee assignee) {
		this.assignee = assignee;
	}
	public List<Assignee> getAssignees() {
		return assignees;
	}
	public void setAssignees(List<Assignee> assignees) {
		this.assignees = assignees;
	}
	public Boolean getMilestone() {
		return milestone;
	}
	public void setMilestone(Boolean milestone) {
		this.milestone = milestone;
	}
	public Integer getComments() {
		return comments;
	}
	public void setComments(Integer comments) {
		this.comments = comments;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Date getClosed_at() {
		return closed_at;
	}
	public void setClosed_at(Date closed_at) {
		this.closed_at = closed_at;
	}
	public String getAuthor_association() {
		return author_association;
	}
	public void setAuthor_association(String author_association) {
		this.author_association = author_association;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
