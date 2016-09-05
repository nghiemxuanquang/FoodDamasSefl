package com.food.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QnAVO {
	private Integer qno;
	private String q_title;
	private String q_content;
	private Date reg_date;
	private Date modi_date;
	private List<AnswerVO> listAns = new ArrayList<AnswerVO>();
	public Integer getQno() {
		return qno;
	}
	public void setQno(Integer qno) {
		this.qno = qno;
	}
	public String getQ_title() {
		return q_title;
	}
	public void setQ_title(String q_title) {
		this.q_title = q_title;
	}
	public String getQ_content() {
		return q_content;
	}
	public void setQ_content(String q_content) {
		this.q_content = q_content;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public Date getModi_date() {
		return modi_date;
	}
	public void setModi_date(Date modi_date) {
		this.modi_date = modi_date;
	}
	public List<AnswerVO> getListAns() {
		return listAns;
	}
	public void setListAns(List<AnswerVO> listAns) {
		this.listAns = listAns;
	}
	@Override
	public String toString() {
		return "QnAVO [qno=" + qno + ", q_title=" + q_title + ", q_content=" + q_content + ", reg_date=" + reg_date
				+ ", modi_date=" + modi_date + ", listAns=" + listAns + "]";
	}
	
	
}
