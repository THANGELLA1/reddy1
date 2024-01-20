package test.com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.com.Entity.Employee;
import test.com.Repository.EmployeeRepository;

@Service
public class EmployeeImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepository empRepo;
	public Employee create(Employee emp)
	{
		return empRepo.save(emp);
	}
public List<Employee> getUsers()
{
	return empRepo.findAll();
}
public Employee update(int id, Employee emp) {
    emp.setId(id);
    return empRepo.save(emp);

}
public void  delete(int id)
{
	 empRepo.deleteById(id);
}
}
