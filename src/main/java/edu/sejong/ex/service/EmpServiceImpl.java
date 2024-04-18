package edu.sejong.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.mapper.EmpDeptMapper;
import edu.sejong.ex.vo.DeptEmpVO;
import edu.sejong.ex.vo.EmpDeptVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDeptMapper empDeptMapper;

	@Override
	public List<DeptEmpVO> getDeptEmpList() {
		log.info("empDeptMapper()...");
		return empDeptMapper.getDeptEmpList();
	}

	public List<EmpDeptVO> getEmpDept() {
		log.info("getEmpDept()...");
		return empDeptMapper.getEmpDept();
	}

}