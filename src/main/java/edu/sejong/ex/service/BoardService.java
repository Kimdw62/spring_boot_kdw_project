package edu.sejong.ex.service;

import java.util.List;

import edu.sejong.ex.page.Criteria;
import edu.sejong.ex.vo.BoardVO;

public interface BoardService {
	List<BoardVO> getList();
	BoardVO get(int bno);
	int remove(int bid);
	int writeBoard(BoardVO board);
	int modifyBoard(BoardVO board);

	public void writeReply(BoardVO board);
	
	//페이징관연
	int getTotal();
	List<BoardVO> getListWithPaging(Criteria cri);
	
}
