package bartosz.bala.lesson.spring.demo.Repo;

import bartosz.bala.lesson.spring.demo.EmployeeModel.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}
