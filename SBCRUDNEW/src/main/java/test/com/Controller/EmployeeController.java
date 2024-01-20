package test.com.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.com.Entity.Employee;
import test.com.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController 
{
	@Autowired
	private EmployeeService empService;
	@PostMapping("/create")
	public Employee create(@RequestBody Employee emp)
	{
		return empService.create(emp);
	}
	@GetMapping("/get")
	public List<Employee> getStudent()
	{
		return empService.getUsers();
	}
	@PutMapping("/{id}")
	public Employee update(@PathVariable int id,@RequestBody Employee emp)
	{
		return empService.update(id,emp);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id)
	{
	empService.delete(id);
	}
	

}
