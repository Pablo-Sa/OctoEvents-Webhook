package com.webhooks.octoevents.repository;

import org.springframework.data.repository.CrudRepository;

import com.webhooks.octoevents.entity.Repository;

public interface RepositoryRepository extends CrudRepository<Repository, Long> {

}
