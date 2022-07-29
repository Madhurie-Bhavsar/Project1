package com.cjc.project_service;

import com.cjc.model.Project;
import com.cjc.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectServiceIMPL implements  ProjectService {

    @Autowired
    private ProjectRepo projectRepo;

    @Override
    public Project postProject(Project project) {
        Project save = projectRepo.save(project);
        return save;
    }

    @Override
    public Project getProject(int id) {
        Optional<Project> byId = projectRepo.findById(id);
        return byId.get();
    }
}
