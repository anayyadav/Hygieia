package com.capitalone.dashboard.rest;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capitalone.dashboard.service.MendixDataService;
import com.capitalone.dashboard.model.MendixData;

@RestController
public class MendixDataController {
	private final MendixDataService mendixDataService;

	@Autowired
	public MendixDataController(MendixDataService mendixDataService) {
		this.mendixDataService = mendixDataService;
	}

	@RequestMapping(value = "/mendix/data", method = GET, produces = APPLICATION_JSON_VALUE)

	public ResponseEntity<List<MendixData>> readMendixData() {
		return ResponseEntity.ok().body(mendixDataService.getMendixDeployData());
	}

}
