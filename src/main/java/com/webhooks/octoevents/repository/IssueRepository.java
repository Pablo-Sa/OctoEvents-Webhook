package com.webhooks.octoevents.repository;

import org.springframework.data.repository.CrudRepository;

import com.webhooks.octoevents.entity.Issue;

public interface IssueRepository extends CrudRepository<Issue, Long>{

}
