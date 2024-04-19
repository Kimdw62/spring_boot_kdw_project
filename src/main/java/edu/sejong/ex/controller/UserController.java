package edu.sejong.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sejong.ex.service.UserService;
import edu.sejong.ex.vo.UserVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {

   @Autowired
   private UserService userService;
   
   @PostMapping("/addUser")
   public String index(UserVO userVO) {
      log.info("addUser()..");
      
      userService.addUser(userVO);

      return "redirect:/";
   }
}