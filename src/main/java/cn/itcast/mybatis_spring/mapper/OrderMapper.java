package cn.itcast.mybatis_spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.itcast.mybatis_spring.entity.Order;

/**
 * 订单接口
 * @author 君山一只丐
 * @version 2.3.7
 * @date 2018年1月23日
 */
public interface OrderMapper {

	/**
	 * 根据用户id查询订单
	 * @param userId
	 * @return
	 */
	List<Order> selectOrderByUserId(@Param("userId")Integer userId);
	
	/**
	 * 根据订单号查询订单以及所属用户信息
	 * @param orderNumber
	 * @return
	 */
	Order selectOrderWithUserByOrderNumber(@Param("orderNumber")String orderNumber);
	
	/**
	 * 条件查询
	 * @param order
	 * @return
	 */
	List<Order> selectOrderByCondition(Order order);
}
