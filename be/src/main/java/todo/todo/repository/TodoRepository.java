package todo.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.todo.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Integer> {
}
