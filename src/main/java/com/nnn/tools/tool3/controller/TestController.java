package com.nnn.tools.tool3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nnn.tools.tool3.service.TasksRepository;

@RestController
@RequestMapping("/tool3")
public class TestController {

	@Autowired
	private TasksRepository tasksRepository;

	@RequestMapping(value = "/tasks", method = RequestMethod.GET, produces="application/json")
	public @ResponseBody List<String> getTasks() throws Exception {
		return this.tasksRepository.getTasks();
	}

	@RequestMapping(value = "/tasks/{taskName}", method = RequestMethod.GET, produces="application/json")
	public @ResponseBody String getTaskByName(@PathVariable(value="taskName") String taskName) throws Exception {
		return this.tasksRepository.getTaskByName(taskName);
	}
	
	@RequestMapping(value = "/tasks/add/{taskName}", method = RequestMethod.GET)
	public @ResponseBody String addTask(@PathVariable(value="taskName") String taskName) throws Exception {
		this.tasksRepository.addTask(taskName);
		return taskName + " ADDED!";
	}
}
