package com.kremlevmax.persistence.repository.impl;

import java.util.ArrayList;
import java.util.Optional;

import com.kremlevmax.persistence.model.Project;
import com.kremlevmax.persistence.repository.ProjectRepository;

public class ProjectRepositoryImpl implements ProjectRepository {
	ArrayList<Project> allProjects = new ArrayList<>();
	
	@Override
	public Optional<Project> findById(Long id) {
		return allProjects.stream().filter(project -> project.getId() == id).findFirst();
	}

	@Override
	public Project save(Project project) {
		Project existingProject = findById(project.getId()).orElse(null);
		
		if (existingProject == null) {
			allProjects.add(existingProject);
		} else {
			allProjects.remove(existingProject);
			Project newProject = new Project(project);
			allProjects.add(newProject);
		}
		return project;
	}

}
