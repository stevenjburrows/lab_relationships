package com.example.codeclan.lab_relationships;

import com.example.codeclan.lab_relationships.models.Department;
import com.example.codeclan.lab_relationships.models.Employee;
import com.example.codeclan.lab_relationships.models.Project;
import com.example.codeclan.lab_relationships.repository.DepartmentRepository;
import com.example.codeclan.lab_relationships.repository.EmployeeRepository;
import com.example.codeclan.lab_relationships.repository.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LabRelationshipsApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployeeAndDepartment() {

		Project project = new Project("New Server", 30);
		projectRepository.save(project);

		Department department = new Department("IT");
		departmentRepository.save(department);

		Employee employee = new Employee("John", "Smith", 12234332, department);
		employeeRepository.save(employee);

		employee.addProject(project) ;
		employeeRepository.save(employee);



	}

}
