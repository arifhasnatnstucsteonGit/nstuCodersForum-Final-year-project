package com.arif.hasnat.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.Type;





@Entity
public class UserBlog {
	
	@Id
	@GeneratedValue
	private Integer userBlogId;
	
	private String authorName;
	
	private String blogTitle;
	private String blogCategory;
	
	@Lob
	@Type(type = "org.hibernate.type.StringClobType")
	@Column(length = Integer.MAX_VALUE)
	private String blogDescriptions;
	private Date blogDate;
	public Integer getUserBlogId() {
		return userBlogId;
	}
	public void setUserBlogId(Integer userBlogId) {
		this.userBlogId = userBlogId;
	}
	
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogCategory() {
		return blogCategory;
	}
	public void setBlogCategory(String blogCategory) {
		this.blogCategory = blogCategory;
	}
	public String getBlogDescriptions() {
		return blogDescriptions;
	}
	public void setBlogDescriptions(String blogDescriptions) {
		this.blogDescriptions = blogDescriptions;
	}
	public Date getBlogDate() {
		return blogDate;
	}
	public void setBlogDate(Date blogDate) {
		this.blogDate = blogDate;
	}	
	

	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
}
