package com.Diplom.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "result")
public class Result {

	@Id
	@GeneratedValue
	private Integer res;
	private String text;

	public Result() {
	}

	public Integer getRes() {
		return res;
	}

	public void setRes(Integer result) {
		this.res = result;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
