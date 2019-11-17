package bartosz.bala.lesson.spring.demo;

import bartosz.bala.lesson.spring.demo.AddressModel.Address;
import bartosz.bala.lesson.spring.demo.CustomerModel.Customer;
import bartosz.bala.lesson.spring.demo.EmployeeModel.DepartmentType;
import bartosz.bala.lesson.spring.demo.EmployeeModel.Employee;
import bartosz.bala.lesson.spring.demo.Repo.CustomerRepo;
import bartosz.bala.lesson.spring.demo.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

@Controller
public class Start {


    private CustomerRepo customerRepo;
    private EmployeeRepo employeeRepo;

    @Autowired
    public Start(CustomerRepo customerRepo, EmployeeRepo employeeRepo) {
        this.customerRepo = customerRepo;
        this.employeeRepo = employeeRepo;
    }

@EventListener(ApplicationReadyEvent.class)
    public void runExample()
    {
        LocalDate dateStartWork = LocalDate.of(2018, Month.AUGUST,01);
        Address address = new Address("Polska","Warszawa","00-200","Krucza","12");
        Address address2 = new Address("Polska","Warszawa","00-200","Lubelska","14");
        Employee employee = new Employee("Jan","Kowalski","kowalski@w.pl",address2,dateStartWork, DepartmentType.SALES);
        Customer customer = new Customer("Bartosz", "Bala",employee,address);
        Customer customer2 = new Customer("Agnieszka", "Bala",employee,address);

        customer.setEmployee(employee);
        customer2.setEmployee(employee);
        Set<Customer> customers = new HashSet<>();
        customers.add(customer);
        customers.add(customer2);
        employee.setCustomers(customers);


        employeeRepo.save(employee);
        customerRepo.save(customer);
        customerRepo.save(customer2);























    }
}
