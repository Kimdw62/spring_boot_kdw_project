package edu.sejong.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sejong.ex.mapper.BoardMapper;
import edu.sejong.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList() {
		log.info("getList()...");
		
		return boardMapper.getList();
	}

	@Override
	public BoardVO get(int bno) {
		log.info("get()...");
		
		boardMapper.updateHit(bno);
		
//		BoardVO board = new BoardVO();
//		board.setBid(bno);
//		updateHit(board);
		
		return boardMapper.read(bno);
	}

//	public void updateHit(BoardVO board) {
//		log.info("updateHit()...");
//		boardMapper.updateHit(board);
//	}
	
	@Override
	public int remove(int bid) {
		log.info("remove()...");
		
		return boardMapper.delete(bid);
	}

	@Override
	public int writeBoard(BoardVO boardVO) {
		log.info("writeBoard()...");
		
		return boardMapper.insertBoard(boardVO);
	}

	@Override
	public int modifyBoard(BoardVO boardVO) {
		log.info("modifyBoard()...");
		
		return boardMapper.updateBoard(boardVO);
	}

	@Override
	public void writeReply(BoardVO boardVO) {
		log.info("writeReply()...");
		
		boardMapper.updateShape(boardVO);
		boardMapper.insertReply(boardVO);
	}
}
