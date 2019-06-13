package com.capitalone.dashboard.rest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capitalone.dashboard.service.HPAMService;
import com.capitalone.dashboard.model.HPAMData;

@RestController
public class HPAMController {
	private final HPAMService hpamService;

	@Autowired
	public HPAMController(HPAMService hpamService) {
		this.hpamService = hpamService;
	}

	@RequestMapping(value = "/hpam/data", method = GET, produces = APPLICATION_JSON_VALUE)

	public ResponseEntity<List<HPAMData>> readHPAMData() {
		return ResponseEntity.ok().body(hpamService.getHPAMTeam());
	}

}

