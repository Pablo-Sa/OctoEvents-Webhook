package com.webhooks.octoevents;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.webhooks.octoevents.DTO.ResponseDTO;
import com.webhooks.octoevents.entity.Issue;
import com.webhooks.octoevents.entity.IssuesEvents;
import com.webhooks.octoevents.repository.IssuesEventsRepository;
import com.webhooks.octoevents.services.IssuesEventsService;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class IssueEventEndPontTest {

	@Test
	void contextLoads() {

	}

	@Autowired
	private TestRestTemplate restTemplet;
	@LocalServerPort
	private int port;
	@MockBean
	private IssuesEventsRepository issuesEventsRepository;

	@Autowired
	IssuesEventsService issuesEventsService;

	@Test
	private void testGetResponseDTOReturnStatusCode200() {
		List<IssuesEvents> issuesEventsList = new ArrayList<>();
		IssuesEvents eventTemp = new IssuesEvents();
		Issue issueTemp = new Issue();
		eventTemp.setAction("Open");
		eventTemp.setIssuesId(new Long(1));
		issueTemp.setCreated_at(new Date());
		eventTemp.setIssue(issueTemp);
		issuesEventsList.add(eventTemp);
		BDDMockito.when(this.issuesEventsRepository.findByIssuesId(eventTemp.getIssuesId())).thenReturn(issuesEventsList);
		ResponseEntity<String> response = restTemplet.getForEntity("/issues/" + eventTemp.getIssuesId() + "/events",
				String.class);
		Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
		ResponseDTO dto = this.issuesEventsService.issueToDto(issuesEventsList).get(0);
		Assertions.assertThat(dto.getAction()).isNotNull();
		Assertions.assertThat(dto.getCreated_at()).isNotNull();
	}

	@Test
	public void testPostResponseStatusCode200() {
		IssuesEvents eventTemp = new IssuesEvents();
		Issue issueTemp = new Issue();
		eventTemp.setAction("Open");
		eventTemp.setIssuesId(new Long(1));
		issueTemp.setCreated_at(new Date());
		eventTemp.setIssue(issueTemp);
		BDDMockito.when(this.issuesEventsRepository.save(eventTemp)).thenReturn(eventTemp);
		ResponseEntity<String> response = restTemplet.postForEntity("/events", eventTemp, String.class);
		Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(200);
	}
	
	@Test
	public void testPostResponseStatusCode404() {
		IssuesEvents eventTemp = new IssuesEvents();
		Issue issueTemp = new Issue();
		eventTemp.setAction("Open");
		eventTemp.setIssuesId(new Long(1));
		issueTemp.setCreated_at(new Date());
		eventTemp.setIssue(issueTemp);
		BDDMockito.when(this.issuesEventsRepository.save(eventTemp)).thenReturn(eventTemp);
		ResponseEntity<String> response = restTemplet.postForEntity("/evenfts", eventTemp, String.class);
		Assertions.assertThat(response.getStatusCodeValue()).isEqualTo(404);
	}

}
