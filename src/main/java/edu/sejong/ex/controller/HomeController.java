package edu.sejong.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.sejong.ex.service.EmpService;

@Controller
//@RequestMapping("/index")
public class HomeController {

	@Autowired
	private EmpService empService;

//	@Autowired
//	private UserService userService;

	@GetMapping("/index")
	public String shopList(Model model) {
		System.out.println("shopList()...");
		model.addAttribute("deptEmps", empService.getDeptEmpList());
		return "/emp/index";
	}

//	@PostMapping("/write")
//	public String write(UserVO userVO) {
//		System.out.println("write()...");
//		userService.insertUser(userVO);
//		userService.insertAuthorities(userVO);
//		return "redirect:/emp/index";
//	}

}
