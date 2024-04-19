package edu.sejong.ex.service;

import org.springframework.stereotype.Service;

import edu.sejong.ex.vo.UserVO;

@Service
public interface UserService {
	public UserVO getUser(String username);

	public int insertUser(UserVO userVO);
	public void insertAuthorities(UserVO UserVO);

	public void addUser(UserVO userVO);
}
