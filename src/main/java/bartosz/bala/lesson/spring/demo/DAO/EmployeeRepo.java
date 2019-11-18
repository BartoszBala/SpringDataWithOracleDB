package bartosz.bala.lesson.spring.demo.DAO;

import bartosz.bala.lesson.spring.demo.DAO.entity.Model.EmployeeModel.DepartmentType;
import bartosz.bala.lesson.spring.demo.DAO.entity.Model.EmployeeModel.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

    List<Employee> findAllByDepartmentTypeOrderByFirstName(DepartmentType departmentType);
}
