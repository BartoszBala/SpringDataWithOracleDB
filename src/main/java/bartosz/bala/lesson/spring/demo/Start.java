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
        LocalDate dateStartWork1 = LocalDate.of(2017, Month.AUGUST,01);
        LocalDate dateStartWork2 = LocalDate.of(2017, Month.MARCH,01);
        Address address1 = new Address("Polska","Warszawa","00-200","Krucza","12");
        Address address2 = new Address("Polska","Warszawa","00-200","Bystra","24");
        Address address3 = new Address("Polska","Warszawa","00-200","Ludowa","34A");
        Address address4 = new Address("Polska","Warszawa","00-200","Piasecka","14a");
        Address address5 = new Address("Polska","Warszawa","00-200","Piękna","145/a");
        Address address6 = new Address("Polska","Warszawa","00-200","Bystrzycka","11");
        Address address7 = new Address("Polska","Warszawa","00-200","Krucza","14a");
        Address address8 = new Address("Polska","Warszawa","00-200","Białostocka","14b");
        Address address9 = new Address("Polska","Warszawa","00-200","Łęczycka","14c");


        Address address10 = new Address("Polska","Piaseczno","30200","Łowicka","12c");
        Address address11 = new Address("Polska","Kraków","10-200","Kaszubska","13c");
        Address address12 = new Address("Polska","Warszawa","60-200","Krakowska","14d");

        Employee employee2 = new Employee("Jan","Kowalski","kowalski@praca.pl",address10,dateStartWork, DepartmentType.SALES);
        Employee employee3 = new Employee("Janina","Kowalska","kowalski@praca.pl",address10,dateStartWork1, DepartmentType.SALES);
        Employee employee4 = new Employee("Jan","Kowalski","kowalski@praca.pl",address11,dateStartWork2, DepartmentType.SALES);
        Employee employee5 = new Employee("Jan","Kowalski","kowalski@praca.pl",address12,dateStartWork2, DepartmentType.SALES);

        Customer customer1 = new Customer("Maria", "Kot",employee2,address1);
        Customer customer2 = new Customer("Agnieszka", "Kot",employee2,address1);
        Customer customer3 = new Customer("Paweł", "Poborski",employee2,address2);
        Customer customer4 = new Customer("Tomasz", "Zykowski",employee3,address3);
        Customer customer5 = new Customer("Jan", "Kowalski",employee3,address4);
        Customer customer6 = new Customer("Monika", "Dąbrowski",employee3,address5);
        Customer customer7 = new Customer("Elżbieta", "Bykowski",employee4,address6);
        Customer customer8 = new Customer("Weronika", "Balla",employee4,address7);
        Customer customer9 = new Customer("Jakub", "Buda",employee5,address8);
        Customer customer10 = new Customer("Ewa", "Kot",employee5,address9);

//        customer.setEmployee(employee);
//        customer2.setEmployee(employee);
        Set<Customer> customers = new HashSet<>();
        Set<Customer> customers2 = new HashSet<>();
        Set<Customer> customers3 = new HashSet<>();
        Set<Customer> customers4 = new HashSet<>();

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers2.add(customer4);
        customers2.add(customer5);
        customers2.add(customer6);
        customers3.add(customer7);
        customers3.add(customer8);
        customers4.add(customer9);
        customers4.add(customer10);

        employee2.setCustomers(customers);
        employee3.setCustomers(customers2);
        employee4.setCustomers(customers3);
        employee5.setCustomers(customers4);

        employeeRepo.save(employee2);
        employeeRepo.save(employee3);
        employeeRepo.save(employee4);
        employeeRepo.save(employee5);
        customerRepo.save(customer1);
        customerRepo.save(customer2);
        customerRepo.save(customer3);
        customerRepo.save(customer4);
        customerRepo.save(customer2);
        customerRepo.save(customer2);
        customerRepo.save(customer2);
        customerRepo.save(customer2);

    }
}
