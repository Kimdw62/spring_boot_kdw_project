package edu.sejong.ex.mapper;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.sejong.ex.vo.DeptEmpVO;
import edu.sejong.ex.vo.EmpDeptVO;
import edu.sejong.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class EmpDeptMapperTest {

	@Autowired
	private EmpDeptMapper empDeptMapper;

	@Test
	void testEmpDeptMapper() {
		assertNotNull(empDeptMapper);
	}

	@Disabled
	@Test
	void testGetEmpDept() {
		for (EmpDeptVO empDeptVO : empDeptMapper.getEmpDept()) {
			log.info("확인==================" + empDeptVO);
			System.out.println("사원번호 : " + empDeptVO.getEmpno());
			System.out.println("사원명 : " + empDeptVO.getEname());
			System.out.println("부서코드 : " + empDeptVO.getDeptno());
			System.out.println("부서염 : " + empDeptVO.getDname());
		}
	}

	@Test
	void testGetDeptEmpList() {
		for (DeptEmpVO vo : empDeptMapper.getDeptEmpList()) {
			System.out.println(vo);

			for(EmpVO emp: vo.getEmpList()) {
				System.out.println(emp);
			}
		}
	}

}
