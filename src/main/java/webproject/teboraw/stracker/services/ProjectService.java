package webproject.teboraw.stracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webproject.teboraw.stracker.domain.Project;
import webproject.teboraw.stracker.repositories.ProjectRepository;

@Service
public class ProjectService {

    // Autowired Tells the application context to inject an instance of projectRepository here
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        return projectRepository.save(project);
    }
}
