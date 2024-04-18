package edu.sejong.ex.service;

import java.util.List;

import edu.sejong.ex.vo.DeptEmpVO;
import edu.sejong.ex.vo.EmpDeptVO;

public interface EmpService {
	List<EmpDeptVO> getEmpDept();
	List<DeptEmpVO> getDeptEmpList();
}
