package edu.sejong.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.sejong.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {
	List<BoardVO> selectList();
	int insert(BoardVO boardVO);
	int delete(BoardVO boardVO);
}
