package com.webhooks.octoevents.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Issue extends AbstractEntity{

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

}
