package co.edu.politecnicojic.todoapp.services;

import co.edu.politecnicojic.todoapp.persistence.entity.Task;
import co.edu.politecnicojic.todoapp.persistence.entity.TaskStatus;
import co.edu.politecnicojic.todoapp.persistence.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public Task createTask(Task task){
        taskRepository.save(task);
        return task;
    }

    public List<Task> findAllByTaskStatus(TaskStatus status){
        return taskRepository.findAllByTaskStatus(status);
    }


}
