package uk.ac.belfastmet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.ac.belfastmet.tasks.Tasks;

@Repository
public interface TaskRespository extends CrudRepository<Tasks, Long> {

}
