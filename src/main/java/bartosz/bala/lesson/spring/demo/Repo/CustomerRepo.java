package bartosz.bala.lesson.spring.demo.Repo;



import bartosz.bala.lesson.spring.demo.Model.CustomerModel.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepo extends CrudRepository<Customer, Long> {

List<Customer> findAllByEmployee_LastNameOrderByLastName(String employeeLastName);
List<Customer> findAllByFirstnameContainsOrderByFirstname(String firstName);





}
