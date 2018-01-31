package com.cds.demo.cds.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/datasource")
public class ODataSource {

	@RequestMapping(value = "/ds")
	public List<Map<String,Object>> getDataSource(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		
		
		
		return list;
	}
}
