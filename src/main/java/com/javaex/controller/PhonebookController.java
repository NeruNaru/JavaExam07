package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaex.service.PhonebookService;
import com.javaex.vo.PhonebookVO;

@Controller
public class PhonebookController {
	//field
	@Autowired
	private PhonebookService phonebookservice;
	//editor
	
	//method g/s
	
	//method normal
	
	//전체 리스트 가져오기
	@RequestMapping(value="/list", method= {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		System.out.println("PhonebookController.list()");
		
		List<PhonebookVO> phonebookList = phonebookservice.exeGetPhonebookList();
		
		model.addAttribute("pList", phonebookList);
		
		return "/list";
	}
}
