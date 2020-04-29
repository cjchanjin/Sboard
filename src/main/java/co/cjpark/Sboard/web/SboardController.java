package co.cjpark.Sboard.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.cjpark.Sboard.service.SboardService;
import co.cjpark.Sboard.service.SboardVo;

@Controller
public class SboardController {

	@Autowired
	SboardService service;
	
	@RequestMapping("/boardList.do")
	public ModelAndView boardList () {
		ModelAndView mav = new ModelAndView();
		ArrayList<SboardVo> list = new ArrayList<SboardVo> ();
		list = service.select();
		
		mav.addObject("list", list);
		mav.setViewName("board/boardList");
		
		return mav;
	}
	
	@RequestMapping("/boardGetList.do")
	public String boardGetList (@RequestParam("bId") String id, Model model) {
		SboardVo vo = new SboardVo();
		int boardId = Integer.parseInt(id);
		System.out.println(boardId);
		vo = service.getSelect(boardId);
		model.addAttribute("view", vo);
		
		return "board/boardView";
	}	 
	
}
