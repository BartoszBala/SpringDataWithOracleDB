package bartosz.bala.lesson.spring.demo.Repo;

import bartosz.bala.lesson.spring.demo.Model.EmployeeModel.DepartmentType;
import bartosz.bala.lesson.spring.demo.Model.EmployeeModel.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

    List<Employee> findAllByDepartmentTypeOrderByFirstName(DepartmentType departmentType);
}
