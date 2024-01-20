package test.com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import test.com.Entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{



}
