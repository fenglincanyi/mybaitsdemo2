package com.gjr.mapper;

import com.gjr.po.OrdersCustom;

import java.util.List;

/**
 * Created by geng
 * on 2017/1/27.
 */
public interface OrdersCustomMapper {

    // 一对一查询
    List<OrdersCustom> queryOrdersUser();
}
