package com.Arc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Arc.entity.Emp;
import com.Arc.service.EmployeeService;

@Controller
public class HomeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping("/")
	public String homeForm() {

		return "home";
	}

	@RequestMapping("/saveData")
	public String saveData(@ModelAttribute("emp") Emp theEmp) {
		service.saveEmp(theEmp);

		return "home";
	}

	@RequestMapping("/showData")
	public String GetAllEmployee(Model theModel) {
		List<Emp> theEmps = service.getAllEmp();

		// System.out.println(theEmps);
		theModel.addAttribute("EmpData", theEmps);
		return "showDB";
	}

	@RequestMapping("/deleteData")
	public String deleteEmployee(@RequestParam("id") int id, Model theModel) {
		Emp emp = new Emp();
		emp.setId(id);
		service.deleteEmp(emp);
		// System.out.println(id);
		
		List<Emp> theEmps = service.getAllEmp();
		theModel.addAttribute("EmpData", theEmps);
		return "showDB";
	}
	

	@RequestMapping("/updateData")
	public String updateEmployee(@RequestParam("id") int id, Model theModel) {
		
		Optional<Emp> optional =service.getEmpById(id);
		
		if (optional.isPresent()) {
			
			Emp emp = optional.get();
			theModel.addAttribute("updateEmp", emp);
		}

		return "UpdateEmp";
	}

}
