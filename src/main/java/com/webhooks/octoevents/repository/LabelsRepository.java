package com.webhooks.octoevents.repository;

import org.springframework.data.repository.CrudRepository;

import com.webhooks.octoevents.entity.Labels;

public interface LabelsRepository extends CrudRepository<Labels, Long>{

}
