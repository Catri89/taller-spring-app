package ar.com.bbva.taller.app.repository;
import java.util.List;

import ar.com.bbva.taller.app.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);

    @Query("SELECT c from Customer c WHERE c.firstName = :name")
    List<Customer> findByName(String name);
}