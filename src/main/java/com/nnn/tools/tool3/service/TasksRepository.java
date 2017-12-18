package com.nnn.tools.tool3.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * <h4>This is an example of how to work with Spring caching mechanism:</h4>
 * Each 'Cacheable' method, such as getTasks() will be called only if the cache is not already set<BR>
 * cacheEvict method is used to clear cache once in while<BR>
 * Note the addTask method modifies the tasksList and the cache as well<BR>
 * @author barna10
 */

@Component
@CacheConfig(cacheNames = "tasks")
public class TasksRepository {

	private static final Logger log = LogManager.getLogger();
	
	private List<String> tasksList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "1", "2", "3", "4", "5"));
	
	@Cacheable
	public List<String> getTasks() throws Exception {
		log.info("In TasksRepository: Getting all tasks...");
		
		// Get all tasks from IM:
		log.info("In TasksRepository: doing some server work... START");
		Thread.sleep(2000);
		log.info("In TasksRepository: doing some server work... END");
		
		return tasksList;
	}
	
	public void addTask(String taskName) throws Exception {
		log.info("In TasksRepository: Adding task: " + taskName);
		tasksList.add(taskName);
	}
	
	@Cacheable
	public String getTaskByName(String taskName) throws Exception {
		log.info("In TasksRepository: Getting task by name...");
		
		// Get the task from IM:
		log.info("In TasksRepository: doing some server work... START");
		Thread.sleep(1000);
		for (String string : tasksList) {
			log.info("In TasksRepository: doing some server work...");
			Thread.sleep(1000);
			if (string.equalsIgnoreCase(taskName)) {
				log.info("In TasksRepository: doing some server work... END");
				return string;
			}
		}
		log.info("In TasksRepository: doing some server work... END");
		return "NOT FOUND";
	}
	
	/**
	 * TODO Use here a different cache based on different key, contains the fromDate and toDate
	 * @author barna10
	 */
	@Cacheable
	public String getTaskByDateRange(Date fromDate, Date toDate) throws Exception {
		log.info("In TasksRepository: Getting task by date range...");
		
		// Get the task from IM:
		return "TODO";
	}
	
	/**
	 * This method will be called periodically to evict the 'tasks' cache
	 * @author barna10
	 */
	@Scheduled(fixedRate = 1000000)
	@CacheEvict(cacheNames = "tasks", allEntries = true)
	public void cacheEvict() {
		log.info("In TasksRepository: Clearing cache...");
	}
}
