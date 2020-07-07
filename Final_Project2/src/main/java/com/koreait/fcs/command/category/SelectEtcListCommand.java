package com.koreait.fcs.command.category;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.koreait.fcs.dao.CategoryDAO;
import com.koreait.fcs.dto.CategoryDTO;

public class SelectEtcListCommand implements MainCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
		
		CategoryDAO cDAO = sqlSession.getMapper(CategoryDAO.class);
		ArrayList<CategoryDTO> list = cDAO.selectEtcCategoryList();
		model.addAttribute("list5", list);
		
		
	}

}
