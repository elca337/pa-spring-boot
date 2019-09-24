package uk.co.sophomores.todolistdoover.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.co.sophomores.todolistdoover.domain.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {

}
