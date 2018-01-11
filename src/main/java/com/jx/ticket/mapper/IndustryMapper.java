package com.jx.ticket.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jx.ticket.po.IndustryPo;

@Mapper
public interface IndustryMapper {

	@Select("SELECT * FROM t_ticket_industry_list where platid=#{platid}")
	@Results({
			// @Result(property = "userSex", column = "user_sex", javaType =
			// UserSexEnum.class),
			@Result(property = "industrycode", column = "industry_code") })
	List<IndustryPo> getAll(String platid2);

	@Select("SELECT * FROM t_ticket_industry_list WHERE platid=#{platid} and  industry_code = #{industry_code}")
	IndustryPo getOne(String platid, String industry_code);

	@Insert("INSERT INTO t_ticket_industry_list(platid,industry_code,type_name,description,rcv) VALUES(#{platid}, #{industrycode}, #{typename}, #{description}, #{rcv})")
	void insert(IndustryPo industryPo);

	@Update("UPDATE t_ticket_industry_list SET platid=#{platid},industry_code=#{industrycode},type_name=#{typename},description=#{description},rcv=#{rcv}  where platid=#{platid} and  industry_code = #{industrycode}")
	void update(IndustryPo industryPo);

	@Delete("DELETE FROM t_ticket_industry_list WHERE platid=#{platid} and  industry_code = #{industry_code}")
	void delete(String platid, String industry_code);

}
