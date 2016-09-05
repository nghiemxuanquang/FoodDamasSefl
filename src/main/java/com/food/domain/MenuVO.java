package com.food.domain;

public class MenuVO {
	private Integer mno;
	private String m_name;
	private Integer m_price;
	private String m_info;
	private boolean m_state;
	private String m_img;
	public Integer getMno() {
		return mno;
	}
	public void setMno(Integer mno) {
		this.mno = mno;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public Integer getM_price() {
		return m_price;
	}
	public void setM_price(Integer m_price) {
		this.m_price = m_price;
	}
	public String getM_info() {
		return m_info;
	}
	public void setM_info(String m_info) {
		this.m_info = m_info;
	}
	public boolean isM_state() {
		return m_state;
	}
	public void setM_state(boolean m_state) {
		this.m_state = m_state;
	}
	public String getM_img() {
		return m_img;
	}
	public void setM_img(String m_img) {
		this.m_img = m_img;
	}
	@Override
	public String toString() {
		return "MenuVO [mno=" + mno + ", m_name=" + m_name + ", m_price=" + m_price + ", m_info=" + m_info
				+ ", m_state=" + m_state + ", m_img=" + m_img + "]";
	}
	
	
	
}
