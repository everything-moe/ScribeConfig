package moe.everything.scribe.config.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import moe.everything.scribe.common.services.ScribeRequestService;

@RequestMapping("/config")
public class ConfigurationController {
	
	@Autowired
	private ScribeRequestService mvc;
	
	@GetMapping("/yo")
	public String example() {
		return "Yooooo";
	}
	
	@GetMapping("/ping")
	public String example2() {
		// will hit another url and return pong after some time
		long now = System.currentTimeMillis();
		
		// mvc.getReq("nowhere");
		
		long now2 = System.currentTimeMillis();
		return "pong ... "+(now2 - now);
	}

}
