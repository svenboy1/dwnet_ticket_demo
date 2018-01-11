package com.jx.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jx.ticket.mapper.IndustryMapper;
import com.jx.ticket.mapper.ShopMapper;
import com.jx.ticket.po.IndustryPo;
import com.jx.ticket.po.ShopPo;

@Service
public class IndustryService {
	
	@Autowired
	private IndustryMapper industryMapper;
	
	/**
	 * 
	 * @param platid 平台ID
	 * @return
	 * @throws Exception
	 */
	
	public List<IndustryPo> getAllIndustryList(String platid) throws Exception {
		
		List<IndustryPo> list = null;
		try {
			list = industryMapper.getAll(platid);
		} catch (Exception e) {
			System.out.println(e);		
			throw e;
		}
		
		return list;
	}	

}
