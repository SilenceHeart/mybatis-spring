package cn.itcast.mybatis_spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.itcast.mybatis_spring.entity.User;

/**
 * user表的curd
 * @author 君山一只丐
 * @version 2.3.7
 * @date 2018年1月23日
 */
public interface UserMapper {
	
	/**
	 * 用户id查找用户
	 * @param id
	 * @return
	 */
	User selectUserById(Integer id);
	
	/**
	 * 根据用户名模糊查询，包括订单详情(多次查询单表实现)
	 * @param userName
	 * @return
	 */
	List<User> selectUserByUserName(@Param("userName")String userName);
	
	/**
	 * 根据用户名模糊查询，包括订单详情(多表关联查询实现)
	 * @param userName
	 * @return
	 */
	List<User> selectUserByUserName2(@Param("userName")String userName);
	
	/**
	 * 全字段更新
	 * @param user
	 */
	void updateUserById(User user);
	
	/*
	 * in -->foreach动态sql
	 */
	List<User> selectUserByIn(Integer[] ids);

	/**
	 * 批量保存
	 * @param users
	 */
	void insertMulti(List<User> users);
	
	/**
	 * 查询所有的用户
	 * @return
	 */
	public List<User> selectAllUser();
}
