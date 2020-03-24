package com.webhooks.octoevents.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class IssuesEvents implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@JsonIgnore
	private Long idpk;
	private String action;
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "issueID")
	private Issue issue;
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "repository_id")
	private Repository repository;
	private Long issuesId;
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "sender_ID")
	private Sender sender;

    @Builder
    public IssuesEvents(
            String action,
            Issue issue,
            Repository repository,
            Long issuesId,
            Sender sender)
    {
        this.action = action;
        this.issue = issue;
        this.issue = issue;
        this.repository = repository;
        this.issuesId = issuesId;
        this.sender = sender;
    }
	
}
