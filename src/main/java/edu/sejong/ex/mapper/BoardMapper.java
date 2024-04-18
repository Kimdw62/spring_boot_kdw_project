package edu.sejong.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.sejong.ex.page.Criteria;
import edu.sejong.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {
	List<BoardVO> getList();

	@Select("select * from mvc_board order by bGroup desc, bStep")	//바이바티스3부터 
	List<BoardVO> getList2();

	public void updateHit(int bno);
	BoardVO read(int bno);
	
//	int updateHit(BoardVO boardVO);
	
	int delete(int bid);
	int insertBoard(BoardVO boardVO);
	int updateBoard(BoardVO boardVO);
	
	//게신판 관련
	public void updateShape(BoardVO boardVO);	//댓글-답변
	public void insertReply(BoardVO boardVO);
	
	//페이징관연
	List<BoardVO> getListWithPaging(Criteria cri);
	int getTotalCount();
	
	
}
