package com.jx.ticket.po;

public class IndustryPo {
	private String platid;
	private String industrycode;
	private String type_name;
	private String description;
	private String rcv;

	public String getPlatid() {
		return platid;
	}

	public void setPlatid(String platid) {
		this.platid = platid;
	}

	public String getIndustrycode() {
		return industrycode;
	}

	public void setIndustrycode(String industrycode) {
		this.industrycode = industrycode;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRcv() {
		return rcv;
	}

	public void setRcv(String rcv) {
		this.rcv = rcv;
	}

	@Override
	public String toString() {
		return "IndustryPo [platid=" + platid + ", industrycode=" + industrycode + ", type_name=" + type_name
				+ ", description=" + description + ", rcv=" + rcv + "]";
	}

}
