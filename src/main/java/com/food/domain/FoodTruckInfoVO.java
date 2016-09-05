package com.food.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FoodTruckInfoVO {
	private String u_id;
	private String u_pw;
	private String u_name;
	private String u_email;
	private String u_phone;
	private String u_profile_img;
	private FoodTypeVO f_type;
	private boolean register_state;
	private String co_name;
	private Integer co_num;
	private String co_doc;
	private String co_intro;
	private String sale_time;
	private Date register_date;
	private List<MenuVO> menus = new ArrayList<MenuVO>();
	private List<QnAVO> listQnA = new ArrayList<QnAVO>();
	private List<SaleVO> listSale = new ArrayList<SaleVO>();
	
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getU_pw() {
		return u_pw;
	}
	public void setU_pw(String u_pw) {
		this.u_pw = u_pw;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	public String getU_profile_img() {
		return u_profile_img;
	}
	public void setU_profile_img(String u_profile_img) {
		this.u_profile_img = u_profile_img;
	}
	public FoodTypeVO getF_type() {
		return f_type;
	}
	public void setF_type(FoodTypeVO f_type) {
		this.f_type = f_type;
	}
	public boolean isRegister_state() {
		return register_state;
	}
	public void setRegister_state(boolean register_state) {
		this.register_state = register_state;
	}
	public String getCo_name() {
		return co_name;
	}
	public void setCo_name(String co_name) {
		this.co_name = co_name;
	}
	public Integer getCo_num() {
		return co_num;
	}
	public void setCo_num(Integer co_num) {
		this.co_num = co_num;
	}
	public String getCo_doc() {
		return co_doc;
	}
	public void setCo_doc(String co_doc) {
		this.co_doc = co_doc;
	}
	public String getCo_intro() {
		return co_intro;
	}
	public void setCo_intro(String co_intro) {
		this.co_intro = co_intro;
	}
	public String getSale_time() {
		return sale_time;
	}
	public void setSale_time(String sale_time) {
		this.sale_time = sale_time;
	}
	public Date getRegister_date() {
		return register_date;
	}
	public void setRegister_date(Date register_date) {
		this.register_date = register_date;
	}
	public List<MenuVO> getMenus() {
		return menus;
	}
	public void setMenus(List<MenuVO> menus) {
		this.menus = menus;
	}
	public List<QnAVO> getListQnA() {
		return listQnA;
	}
	public void setListQnA(List<QnAVO> listQnA) {
		this.listQnA = listQnA;
	}
	public List<SaleVO> getListSale() {
		return listSale;
	}
	public void setListSale(List<SaleVO> listSale) {
		this.listSale = listSale;
	}
	@Override
	public String toString() {
		return "FoodTruckInfoVO [u_id=" + u_id + ", u_pw=" + u_pw + ", u_name=" + u_name + ", u_email=" + u_email
				+ ", u_phone=" + u_phone + ", u_profile_img=" + u_profile_img + ", f_type=" + f_type
				+ ", register_state=" + register_state + ", co_name=" + co_name + ", co_num=" + co_num + ", co_doc="
				+ co_doc + ", co_intro=" + co_intro + ", sale_time=" + sale_time + ", register_date=" + register_date
				+ ", menus=" + menus + ", listQnA=" + listQnA + ", listSale=" + listSale + "]";
	}
	
	
	
	
}
