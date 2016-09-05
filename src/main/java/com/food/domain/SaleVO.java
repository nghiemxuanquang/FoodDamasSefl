package com.food.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleVO {
	private Integer sno;
	private String location;
	private Double lat;
	private Double lng;
	private Date open_time;
	private Date close_time;
	private Date work_date;
	private boolean sales_state;
	private List<OrderVO> listOrder = new ArrayList<OrderVO>();
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	public void setLng(Double lng) {
		this.lng = lng;
	}
	public Date getOpen_time() {
		return open_time;
	}
	public void setOpen_time(Date open_time) {
		this.open_time = open_time;
	}
	public Date getClose_time() {
		return close_time;
	}
	public void setClose_time(Date close_time) {
		this.close_time = close_time;
	}
	public Date getWork_date() {
		return work_date;
	}
	public void setWork_date(Date work_date) {
		this.work_date = work_date;
	}
	public boolean isSales_state() {
		return sales_state;
	}
	public void setSales_state(boolean sales_state) {
		this.sales_state = sales_state;
	}
	public List<OrderVO> getListOrder() {
		return listOrder;
	}
	public void setListOrder(List<OrderVO> listOrder) {
		this.listOrder = listOrder;
	}
	@Override
	public String toString() {
		return "SaleVO [sno=" + sno + ", location=" + location + ", lat=" + lat + ", lng=" + lng + ", open_time="
				+ open_time + ", close_time=" + close_time + ", work_date=" + work_date + ", sales_state=" + sales_state
				+ ", listOrder=" + listOrder + "]";
	}
	
	
	
}
