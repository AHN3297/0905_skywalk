package com.kh.pop.controller;

import java.util.List;

import com.kh.pop.model.service.PopService;
import com.kh.pop.model.vo.Popup;

public class PopController {
	public List<Popup> findAll() {
		List<Popup> pops = new PopService().findAll();
		return pops;
	}
	
	public int addPopup(String writer, String name, String start, String end, String location) {
		Popup popup = new Popup(writer, name, start, end, location);
		
		int result = new PopService().addPop(popup);
		return result;
	}

}
