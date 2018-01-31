package cn.itcast.mybatis_spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 用户表user对应的pojo
 * @author 君山一只丐
 * @version 2.3.7
 * @date 2018年1月23日
 */
@SuppressWarnings("serial")
public class User implements Serializable{

	private Integer id;
	private String username;
	private Date birthday;
	private String sex;
	private String address;
	private List<Order> orders;
	
	public User(String username, String address) {
		super();
		this.username = username;
		this.address = address;
	}
	public User() {
		super();
	}
	
	
	public User(Integer id, String username, String address) {
		super();
		this.id = id;
		this.username = username;
		this.address = address;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", birthday=" + birthday + ", sex=" + sex + ", address="
				+ address + "]";
	}
	
	
	
}
