package com.webhooks.octoevents.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webhooks.octoevents.DTO.ResponseDTO;
import com.webhooks.octoevents.Enum.Error;
import com.webhooks.octoevents.entity.IssuesEvents;
import com.webhooks.octoevents.errors.ResourcesNotFoundException;
import com.webhooks.octoevents.services.IssuesEventsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*")
@Api(value="OctoEvents Webhooks Gib Events")
public class IssuesEventsRest {

	@Autowired
	private IssuesEventsService issuesEventsService;
	
	
	@ApiOperation(value="Post Issues Events")
	@PostMapping(path = "/events")
	public IssuesEvents saveIssues(@RequestBody IssuesEvents event) {
		return issuesEventsService.save(event);
	}

	@ApiOperation(value="Return Action and Date Create")
	@RequestMapping(method = RequestMethod.GET, path = "/issues/{issueId}/events")
	public List<ResponseDTO> buscarPorNome(@PathVariable("issueId") Long issueId) {
		verifyIfContactExists(issueId, Error.ERRO_GET.getDescricao());
		List<ResponseDTO> responseDTOList = issuesEventsService.findByIssueId(issueId);
		return responseDTOList;
	}

	private void verifyIfContactExists(Long id, String mgs) {
		if (issuesEventsService.findByIssueId(id).isEmpty())
			throw new ResourcesNotFoundException(mgs.toString() + " " + id);
	}

}
