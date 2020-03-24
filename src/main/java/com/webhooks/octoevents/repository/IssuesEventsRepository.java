package com.webhooks.octoevents.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.webhooks.octoevents.entity.IssuesEvents;

public interface IssuesEventsRepository extends CrudRepository<IssuesEvents, Long> {

  List<IssuesEvents> findByIssuesId(Long id);
  IssuesEvents findByIdpk(Long id);
	
}
