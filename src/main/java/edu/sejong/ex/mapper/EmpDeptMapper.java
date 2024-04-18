package edu.sejong.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.sejong.ex.vo.DeptEmpVO;
import edu.sejong.ex.vo.EmpDeptVO;

@Mapper
public interface EmpDeptMapper {
	List<EmpDeptVO> getEmpDept();
	List<DeptEmpVO> getDeptEmpList();
}

/*
	xml id 연동
    <select id="getEmpDept" resultType="EmpDeptVO">
    <select id="getDeptEmpList" resultMap="deptEmpMap">
*/