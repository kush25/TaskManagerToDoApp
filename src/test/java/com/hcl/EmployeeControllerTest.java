//package com.hcl;
//
//import static org.mockito.ArgumentMatchers.any;
//import org.junit.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.http.ResponseEntity;
//import org.springframework.mock.web.MockHttpServletRequest;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import com.hcl.controller.EmployeeController;
//import com.hcl.dao.EmpRepo;
//import com.hcl.model.Employee;
//
//@ExtendWith(MockitoExtension.class)
//public class EmployeeControllerTest extends SpringBootTestCrudApplication {
//
//	
//	@InjectMocks  //tp create EmpController class and also inject mocked employeerepo instance
//	EmployeeController empController;
//	
//	@Mock  //to create mock object for EmpRepo
//	EmpRepo repo;
//	
//	
//	@Test
//	public void testAddEmployee() {
//		
//		MockHttpServletRequest req = new MockHttpServletRequest();
//		 RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(req));
//		 when(repo.newEmp(any(Employee.class))).thenReturn(true);
//	        Employee e1=new Employee(111,"Kush");
//	        ResponseEntity<Object> response = repo.add
//	}
//	
//	
//	
//}
