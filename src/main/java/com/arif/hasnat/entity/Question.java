package com.arif.hasnat.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.Type;

@Entity
public class Question {
	@Id
	@GeneratedValue
	private Integer ques_id;
	
	

	@Lob
	@Type(type = "org.hibernate.type.StringClobType")
	@Column(length = Integer.MAX_VALUE)
	private String cat_title;
	

	@Lob
	@Type(type = "org.hibernate.type.StringClobType")
	@Column(length = Integer.MAX_VALUE)
	private String cat_description;
	private Date cat_date;
	
	
	
	
	public Integer getQues_id() {
		return ques_id;
	}
	public void setQues_id(Integer ques_id) {
		this.ques_id = ques_id;
	}
	public String getCat_title() {
		return cat_title;
	}
	public void setCat_title(String cat_title) {
		this.cat_title = cat_title;
	}
	public String getCat_description() {
		return cat_description;
	}
	public void setCat_description(String cat_description) {
		this.cat_description = cat_description;
	}
	public Date getCat_date() {
		return cat_date;
	}
	public void setCat_date(Date cat_date) {
		this.cat_date = cat_date;
	}

	
	

}
