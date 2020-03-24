package com.webhooks.octoevents.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webhooks.octoevents.errors.ResourcesNotFoundException;
import com.webhooks.octoevents.services.IssuesEventsService;


@Service
public class MessageErros {

	@Autowired
	IssuesEventsService issuesEventsService;

	public void verifyReturnFind(Long id, String mgs) {
		if (issuesEventsService.findByIssueId(id).isEmpty())
			throw new ResourcesNotFoundException(mgs + " " + id);
	}

	public void veryfyObjectIsNull(Object object, String mgs) {
		if (object == null)
			throw new ResourcesNotFoundException(mgs);
	}

}
