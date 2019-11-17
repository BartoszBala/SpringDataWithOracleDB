package bartosz.bala.lesson.spring.demo.Repo;



import bartosz.bala.lesson.spring.demo.CustomerModel.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Long> {




}
