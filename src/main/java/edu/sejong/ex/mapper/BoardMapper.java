package edu.sejong.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.sejong.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {
	List<BoardVO> getList();

	public void updateHit(int bno);
	BoardVO read(int bno);
	
//	int updateHit(BoardVO boardVO);
	
	int delete(int bid);
	int insertBoard(BoardVO boardVO);
	int updateBoard(BoardVO boardVO);
	
	public void updateShape(BoardVO boardVO);	//댓글-답변
	public void insertReply(BoardVO boardVO);
}
