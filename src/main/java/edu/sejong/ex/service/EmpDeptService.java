package edu.sejong.ex.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.page.Criteria;
import edu.sejong.ex.vo.DeptEmpVO;
import edu.sejong.ex.vo.EmpDeptVO;

@Service
public class EmpDeptService {
	
	@Autowired
	private SqlSessionTemplate SqlSession;	//마이바티스
	
	public List<EmpDeptVO> getEmpDept(Criteria cri) throws Exception {
		return SqlSession.selectList("getEmpDept", cri);
	}
	
	
	public List<DeptEmpVO> getDeptEmpList(Criteria cri) throws Exception {
		return SqlSession.selectList("getDeptEmpList", cri);
	}

	public int getEmpTotal() throws Exception {
		return SqlSession.selectOne("getEmpTotal");
	}
	
}
