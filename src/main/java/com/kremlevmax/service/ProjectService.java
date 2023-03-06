package com.kremlevmax.service;

import java.util.Optional;

import com.kremlevmax.persistence.model.Project;

public interface ProjectService {
	
	public Optional<Project> findById(Long id);
	
	public Project save(Project project);
}
