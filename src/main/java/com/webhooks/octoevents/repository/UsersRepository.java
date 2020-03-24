package com.webhooks.octoevents.repository;

import org.springframework.data.repository.CrudRepository;

import com.webhooks.octoevents.entity.Users;

public interface UsersRepository extends CrudRepository<Users, Long> {

}
