package webproject.teboraw.stracker.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import webproject.teboraw.stracker.domain.Project;

@Repository //Not required but good practice
public interface ProjectRepository extends CrudRepository<Project,Long> {//Long indicates the type of id used in the project domain

    @Override
    default Iterable<Project> findAllById(Iterable<Long> iterable) {
        return null;
    }
}
