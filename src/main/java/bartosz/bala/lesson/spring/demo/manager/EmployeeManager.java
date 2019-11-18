package bartosz.bala.lesson.spring.demo.manager;

import bartosz.bala.lesson.spring.demo.DAO.EmployeeRepo;
import bartosz.bala.lesson.spring.demo.DAO.entity.Model.EmployeeModel.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeManager {

    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeManager(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> findAllEmployee() {

        return (List<Employee>) employeeRepo.findAll();
    }

    public Optional<Employee> findById(long id) {

        return employeeRepo.findById(id);
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public void delateEmployee(long id) {

        employeeRepo.deleteById(id);
    }
}
