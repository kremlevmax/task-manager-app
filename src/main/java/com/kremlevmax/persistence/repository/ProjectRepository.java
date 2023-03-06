package com.kremlevmax.persistence.repository;

import java.util.Optional;

import com.kremlevmax.persistence.model.Project;

public interface ProjectRepository {
	Optional<Project> findById(Long id);
	Project save(Project project);
}
