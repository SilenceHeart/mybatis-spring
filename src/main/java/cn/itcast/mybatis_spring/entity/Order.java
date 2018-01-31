package cn.itcast.mybatis_spring.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单表order对应的pojo
 * 
 * @author 君山一只丐
 * @version 2.3.7
 * @date 2018年1月23日
 */
@SuppressWarnings("serial")
public class Order implements Serializable {

	private Integer id;
	private String number;
	private Date createTime;
	private String note;
	private User user;
	
	
	public Order(String number, User user) {
		super();
		this.number = number;
		this.user = user;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", number=" + number + ", createTime=" + createTime + ", note=" + note + "]";
	}

}
