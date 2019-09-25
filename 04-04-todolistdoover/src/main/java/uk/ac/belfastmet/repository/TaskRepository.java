package uk.ac.belfastmet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uk.ac.belfastmet.tasks.Tasks;


/**
 * 
 * This is the task repository for the to do list App
 * 
 * @author CAS14105696
 * @version 2.0
 * @since 23/09/2019
 */

/*
 * @param parameter is "Tasks" and data type 
 * @return TaskRepository extends CrudRepository
 */
@Repository
public interface TaskRepository extends CrudRepository<Tasks, Long> {

}
