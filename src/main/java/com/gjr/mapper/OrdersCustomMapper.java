package com.gjr.mapper;

import com.gjr.po.Orders;
import com.gjr.po.OrdersCustom;
import com.gjr.po.User;

import java.util.List;

/**
 * Created by geng
 * on 2017/1/27.
 */
public interface OrdersCustomMapper {

    // 一对一查询 使用 resultType实现
    List<OrdersCustom> queryOrdersUser();

    // 一对一查询 使用 resultMap实现
    List<Orders> queryOrdersUser1();

    // 一对多，查询用户订单详情信息
    List<Orders> queryOrdersDetailUser();

    // 多对多，查询用户订单详情商品详情信息
    List<User> queryOrdersDetailUserItems();
}
