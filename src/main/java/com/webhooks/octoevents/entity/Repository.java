package com.webhooks.octoevents.entity;

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
public class Repository extends AbstractEntity {

	private Long id;
	private String node_id;
	private String name;
	private String full_name;
	private Boolean privat;
	@ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "owner_idpk")
	private Owner owner;
	private String html_url;
	private String description;
	private Boolean fork;
	private String url;
	private String archive_url;
	private String assignees_url;
	private String blobs_url;
	private String branches_url;
	private String collaborators_url;
	private String comments_url;
	private String commits_url;
	private String compare_url;
	private String contents_url;
	private String contributors_url;
	private String deployments_url;
	private String downloads_url;
	private String events_url;
	private String forks_url;
	private String git_commits_url;
	private String git_refs_url;
	private String git_tags_url;
	private String git_url;
	private String issue_comment_url;
	private String issue_events_url;
	private String issues_url;
	private String keys_url;
	private String labels_url;
	private String languages_url;
	private String merges_url;
	private String milestones_url;
	private String notifications_url;
	private String pulls_url;
	private String releases_url;
	private String ssh_url;
	private String stargazers_url;
	private String statuses_url;
	private String subscribers_url;
	private String subscription_url;
	private String tags_url;
	private String teams_url;
	private String trees_url;
	private String clone_url;
	private String mirror_url;
	private String hooks_url;
	private String svn_url;
	private String homepage;
	private String language;
	private Integer forks_count;
	private Integer stargazers_count;
	private Integer watchers_count;
	private Integer size;
	private String default_branch;
	private Integer open_issues_count;
	private Boolean is_template;
	@Transient
	private List<Topics> topics;
	private Boolean allow_rebase_merge;
	private String template_repository;
	private String temp_clone_token;
	private Boolean allow_squash_merge;
	private Boolean allow_merge_commit;
	private Integer subscribers_count;
	private Integer network_count;
}
