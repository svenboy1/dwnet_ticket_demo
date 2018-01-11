package com.jx.ticket.po;

public class ShopPo {
	private String platid;
	private String industry_code;
	private String shopcode;
	private String shopname;
	private String logo;

	public String getPlatid() {
		return platid;
	}

	public void setPlatid(String platid) {
		this.platid = platid;
	}

	public String getIndustry_code() {
		return industry_code;
	}

	public void setIndustrycode(String industry_code) {
		this.industry_code = industry_code;
	}

	public String getShopcode() {
		return shopcode;
	}

	public void setShopcode(String shopcode) {
		this.shopcode = shopcode;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "ShopPo [platid=" + platid + ", industrycode=" + industry_code + ", shopcode=" + shopcode + ", shopname="
				+ shopname + ", logo=" + logo + "]";
	}

}
