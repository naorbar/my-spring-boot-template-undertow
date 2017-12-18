package com.nnn.tools.tool2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nnn.tools.tool2.service.Tool2Service;

@RestController
@RequestMapping("/tool2")
public class Tool2Controller {
	@Autowired
    private Tool2Service imAnalyzerService;
	
	/**
	 * Basic test 
	 * @author reuel01
	 */
	@RequestMapping(value="/test/{name}", method=RequestMethod.GET)
	public @ResponseBody String test(@PathVariable(value = "name") String name) throws Exception {
		return imAnalyzerService.test(name);
	}
	

}
