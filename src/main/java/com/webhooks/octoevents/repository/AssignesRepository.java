package com.webhooks.octoevents.repository;

import org.springframework.data.repository.CrudRepository;


import com.webhooks.octoevents.entity.Assignee;

public interface AssignesRepository extends CrudRepository<Assignee, Long>{

}
