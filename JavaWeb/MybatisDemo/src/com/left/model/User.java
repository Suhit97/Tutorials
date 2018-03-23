package com.left.model;
/**
 * 模型层的数据结构，将数据库数据进行映射
 * @author left
 *
 */
public class User {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
