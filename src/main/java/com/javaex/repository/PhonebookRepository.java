package com.javaex.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PhonebookVO;

@Repository
public class PhonebookRepository {
	//field
	@Autowired
	private SqlSession sqlsession;
	//editor
	
	//method g/s
	
	//method normal
	public List<PhonebookVO> phonebookSelect(){
		System.out.println("PhonebookRepository.phonebookSelect()");
		
		List<PhonebookVO> phonebookList = sqlsession.selectList("phonebook.selectList");
		
		System.out.println(phonebookList);
		
		return phonebookList;
	}
}
