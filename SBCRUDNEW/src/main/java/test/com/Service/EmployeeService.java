package test.com.Service;

import java.util.List;

import test.com.Entity.Employee;

public interface EmployeeService {

	public Employee create(Employee emp);

	public List<Employee> getUsers();

	public Employee update(int id, Employee emp);

	public void delete(int id);

}
