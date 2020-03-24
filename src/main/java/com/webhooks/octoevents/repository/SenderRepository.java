package com.webhooks.octoevents.repository;

import org.springframework.data.repository.CrudRepository;

import com.webhooks.octoevents.entity.Sender;

public interface SenderRepository extends CrudRepository<Sender, Long> {

}
