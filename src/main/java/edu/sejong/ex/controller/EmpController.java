package edu.sejong.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sejong.ex.service.EmpService;

/*
	1. interface는 필요가 없음 
	2. sqlSession에서 제공하는 함수(selectList, selectOne)를 이용함
	3. 쿼리구현을 위한 XML이 필요. 
	해당 XML의 namespace는  개발자가가 정함
*/

@Controller
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmpService empService;

	@GetMapping("/list")
	public String list(Model model) {
		System.out.println("list()...");

		model.addAttribute("deptEmps", empService.getDeptEmpList());

		return "/emp/empList";
	}

	@GetMapping("/list2")
	public String list2(Model model) {
		System.out.println("list2()...");

		model.addAttribute("emps", empService.getEmpDept());

		return "/emp/empList2";
	}

	@GetMapping("/sal")
	public String salaryList(Model model) {
		System.out.println("salaryList()...");

		model.addAttribute("deptEmps", empService.getDeptEmpList());

		return "/emp/empSalary";
	}

	@GetMapping("/sal2")
	public String salList(Model model) {
		System.out.println("salList()...");

		model.addAttribute("emps", empService.getEmpDept());

		return "/emp/empSalary2";
	}


}
