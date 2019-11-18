package bartosz.bala.lesson.spring.demo.DAO;



import bartosz.bala.lesson.spring.demo.DAO.entity.Model.CustomerModel.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer, Long> {

List<Customer> findAllByEmployee_LastNameOrderByLastName(String employeeLastName);
List<Customer> findAllByFirstnameContainsOrderByFirstname(String firstName);





}
