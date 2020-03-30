/**
 * 
 */
package com.veera.reference.EmployeeService;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author veera
 *
 */
@RestController
@EnableAutoConfiguration
public class EmployeeController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Welcome";
	}
	
	/*
	 * public Employee() { return new Employee(); }
	 */

}
