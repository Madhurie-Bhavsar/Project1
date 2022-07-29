package com.cjc.project_service;

import com.cjc.model.Project;

public interface ProjectService {

    public Project postProject(Project project);

    public Project getProject(int id);
}
