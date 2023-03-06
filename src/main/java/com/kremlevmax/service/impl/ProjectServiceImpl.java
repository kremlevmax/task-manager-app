package com.kremlevmax.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.kremlevmax.persistence.model.Project;
import com.kremlevmax.service.ProjectService;

public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectService projectService;

	@Override
	public Optional<Project> findById(Long id) {
		return projectService.findById(id);
	}

	@Override
	public Project save(Project project) {
		return projectService.save(project);
	}

}
