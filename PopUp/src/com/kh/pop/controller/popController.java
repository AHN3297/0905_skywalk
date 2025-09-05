package com.kh.pop.controller;

import java.util.List;

import com.kh.pop.model.service.PopService;
import com.kh.pop.model.vo.Popup;

public class PopController {
	public List<Popup> findAll() {
		List<Popup> pops = new PopService().findAll();
		return pops;
	}

}
