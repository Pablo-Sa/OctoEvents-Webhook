package com.webhooks.octoevents.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webhooks.octoevents.DTO.ResponseDTO;
import com.webhooks.octoevents.entity.IssuesEvents;
import com.webhooks.octoevents.repository.IssuesEventsRepository;

@Service
public class IssuesEventsService {
	@Autowired
	IssuesEventsRepository issuesEventsRepository;

	public IssuesEvents save(IssuesEvents issues) {
		IssuesEvents issuesEvents = new IssuesEvents();
		issuesEvents.setAction(issues.getAction());
		issuesEvents.setIssue(issues.getIssue());
		issuesEvents.setIssuesId(issues.getIssue().getId());
		issuesEvents.setRepository(issues.getRepository());
		issuesEvents.setSender(issues.getSender());
		return this.issuesEventsRepository.save(issuesEvents);
	}

	public List<ResponseDTO> findByIssueId(Long id) {
		List<IssuesEvents> eventTempList = issuesEventsRepository.findByIssuesId(id);
		return this.issueToDto(eventTempList);
	}
	
	public List<ResponseDTO> issueToDto (List<IssuesEvents> eventTempList) {
		List<ResponseDTO> responseTempList = new ArrayList<>();
		for (IssuesEvents issueTemp : eventTempList) {
			ResponseDTO response = new ResponseDTO();
			response.setAction(issueTemp.getAction());
			response.setCreated_at(issueTemp.getIssue().getCreated_at());
			responseTempList.add(response);
		}
		return responseTempList;
	}

	
	public IssuesEvents findByIdpk(Long id) {
		return this.issuesEventsRepository.findByIdpk(id);

	}
	
}
