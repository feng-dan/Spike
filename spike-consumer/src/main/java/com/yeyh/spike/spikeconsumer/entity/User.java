package com.yeyh.spike.spikeconsumer.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Levin
 * @since 2018/5/10 0007
 */
@Data
public class User implements Serializable {

	private static final long serialVersionUID = 8655851615465363473L;
	private Long id;
	private String username;
	private String password;

	public User(Long id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public User() {
	}
}