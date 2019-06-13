package com.capitalone.dashboard.rest;

import java.util.List;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capitalone.dashboard.model.GitlabData;
import com.capitalone.dashboard.service.GITLABService;

@RestController
public class GITLABController {

	private final GITLABService hpamService;

	@Autowired
	public GITLABController(GITLABService hpamService) {
		this.hpamService = hpamService;
	}

	@RequestMapping(value = "/gitlab/data", method = GET, produces = APPLICATION_JSON_VALUE)

	public ResponseEntity<List<GitlabData>> readGITALBData() {
		return ResponseEntity.ok().body(hpamService.getGILTABTeam());
	}

}
