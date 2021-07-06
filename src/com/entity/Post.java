package com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="post")
public class Post implements Serializable{
	@Id
	@Column(name="id_post")
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer id_post;

	@Column(name="id")
	private Integer id_user;
	
	@Column(name="title")
	private String title;
	
	@Column(name="content")
	private String contents;
	
	@Column(name="img")
	private String img;
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Column(name="video")
	private String video;
	
	@Column(name="state")
	private int state;

	public Integer getId_post() {
		return id_post;
	}

	public void setId_post(Integer id_post) {
		this.id_post = id_post;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}


	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}
	
	
}

