package com.webhooks.octoevents.repository;

import org.springframework.data.repository.CrudRepository;

import com.webhooks.octoevents.entity.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
