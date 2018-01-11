package com.jx.ticket.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jx.ticket.mapper.IndustryMapper;
import com.jx.ticket.po.IndustryPo;
import com.jx.ticket.po.ShopPo;
import com.jx.ticket.service.IndustryService;
import com.jx.ticket.service.ShopService;

@RestController
public class IndustryController {

	@Autowired
	private IndustryService industryService;
	
	@Autowired
	private ShopService shopService;

	@RequestMapping(value = "/v1/mindustrylists")
	public Map<String, Object> getAllIndustryList(@RequestParam(value = "platformid", required = true) String platid,
			@RequestParam(value = "industryid", required = false) String industry_code) {

		System.out.println(platid + "," + industry_code);
		
		Map<String, Object> map = new HashMap<String, Object>();

		if (industry_code == null) {

			try {
				List<IndustryPo> list = industryService.getAllIndustryList(platid);
				map.put("body", list);
				map.put("result", "200");
				map.put("msg", "操作成功");

			} catch (Exception e) {
				System.out.println(e);
				map.put("result", "500");
				map.put("msg", "操作失败");
			}

		}else {
			try {
				List<ShopPo> list = shopService.getAllShopListByIndustryid(platid, industry_code);
				map.put("body", list);
				map.put("result", "200");
				map.put("msg", "操作成功");

			} catch (Exception e) {
				System.out.println(e);
				map.put("result", "500");
				map.put("msg", "操作失败");
			}

			
		}
		
		return (map);
	}
}
