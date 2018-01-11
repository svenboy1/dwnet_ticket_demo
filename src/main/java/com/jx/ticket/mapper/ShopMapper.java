package com.jx.ticket.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.jx.ticket.po.ShopPo;

@Mapper
public interface ShopMapper {

	
	@Select("SELECT * FROM t_ticket_shop where platid=#{platid}")
	List<ShopPo> getAll(String platid);
	

	//@Select("SELECT * FROM t_ticket_shop WHERE platid=#{platid} and  industry_code = #{industry_code}")
	@Select("SELECT * FROM  t_ticket_shop WHERE platid=#{platid,jdbcType=VARCHAR} and  industry_code=#{industry_code,jdbcType=VARCHAR}")
	List<ShopPo> getAllByIndustryid(@Param("platid") String platid, @Param("industry_code")String industry_code);
	
	
	@Select("SELECT * FROM t_ticket_shop WHERE platid=#{platid} and  industry_code = #{industry_code} and shopcode= #{shopcode}")
	List<ShopPo> getShopByShopCode(String platid, String industry_code, String shopcode);
}
