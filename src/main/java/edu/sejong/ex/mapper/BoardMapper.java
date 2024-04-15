package edu.sejong.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.sejong.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {
	List<BoardVO> getList();

	BoardVO read(int bno);
	
	public void updateHit(int bno);		//업데이트 : hit + 1
//	int updateHit(BoardVO boardVO);
	
	int delete(int bid);
	int insertBoard(BoardVO boardVO);
	int updateBoard(BoardVO boardVO);
	
	public void updateShape(BoardVO boardVO);	//댓글-답변
	public void insertReply(BoardVO boardVO);
}
