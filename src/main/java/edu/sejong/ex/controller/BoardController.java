package edu.sejong.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.sejong.ex.service.BoardService;
import edu.sejong.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/list")
	public String list(Model model) {
		log.info("list();...");
		model.addAttribute("boards", boardService.getList());
		return "/board/list";
	}

	@GetMapping("/content_view")
	public String content_view(BoardVO boardVO, Model model) {
		log.info("content_view();...");
		model.addAttribute("content_view", boardService.get(boardVO.getBid()));
		return "/board/content_view";
	}

	@GetMapping("/delete")
	public String delete(BoardVO boardVO, Model model) {
		log.info("delete();...");
		boardService.remove(boardVO.getBid());
		return "redirect:/board/list";
	}

	@GetMapping("/write_view")
	public String write_view() {
		log.info("write_view();...");
		return "/board/write_view";
	}

	@GetMapping("/write")
	public String write(BoardVO boardVO) {
		System.out.println("write()...");
		boardService.writeBoard(boardVO);
		return "redirect:/board/list";
	}

	@GetMapping("/modify")
	public String modify(BoardVO boardVO) {
		System.out.println("modify()...");
		boardService.modifyBoard(boardVO);
		return "redirect:/board/list";
	}

	@GetMapping("/reply_view")
	public String reply_view(BoardVO boardVO, Model model) {
		log.info("reply_view();...");
		model.addAttribute("reply_view", boardService.get(boardVO.getBid()));
		return "/board/reply_view";
	}

	@PostMapping("/reply")
	public String reply(BoardVO boardVO) {
		System.out.println("reply()...");
		boardService.writeReply(boardVO);
		return "redirect:/board/list";
	}
	
}
