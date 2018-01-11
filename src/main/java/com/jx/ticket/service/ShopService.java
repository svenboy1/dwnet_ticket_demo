package com.jx.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jx.ticket.mapper.ShopMapper;
import com.jx.ticket.po.ShopPo;

@Service
public class ShopService {
	@Autowired
	private ShopMapper shopMapper;
	
	/**
	 * 
	 * @param platid
	 * @return
	 * @throws Exception
	 */
	public List<ShopPo> getAllShop(String platid) throws Exception {		
		List<ShopPo> list = null;
		try {
			list = shopMapper.getAll(platid);
		} catch (Exception e) {
			System.out.println(e);		
			throw e;
		}
		
		return list;
	}
	
	/**
	 * 
	 * @param platid
	 * @param industryid
	 * @return
	 * @throws Exception
	 */
	public List<ShopPo> getAllShopListByIndustryid(String platid, String industry_code) throws Exception {		
		List<ShopPo> list = null;
		try {
			System.out.println("[" + platid + "]," + "[" + industry_code + "]"  );
			list = shopMapper.getAllByIndustryid(platid, industry_code);
			//list  = shopMapper.getAll(platid);
		} catch (Exception e) {
			System.out.println(e);		
			throw e;
		}
		
		return list;
	}

	
	public List<ShopPo> getShopByShopCode(String platid, String industryid, String shopcode) throws Exception {		
		List<ShopPo> list = null;
		try {
			list = shopMapper.getShopByShopCode(platid, industryid, shopcode);
		} catch (Exception e) {
			System.out.println(e);		
			throw e;
		}
		
		return list;
	}

}
