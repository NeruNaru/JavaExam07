package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.repository.PhonebookRepository;
import com.javaex.vo.PhonebookVO;

@Service
public class PhonebookService {
	//field
	@Autowired
	private PhonebookRepository phonebookrepository;
	//editor
	
	//method g/s
	
	//method normal
	public List<PhonebookVO> exeGetPhonebookList() {
		System.out.println("PhonebookService.exeGetPhonebookList()");
		
		List<PhonebookVO> phonebookList = phonebookrepository.phonebookSelect();
		
		return null;
	}
}
