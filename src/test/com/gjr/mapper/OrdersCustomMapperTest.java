package com.gjr.mapper;

import com.gjr.po.Orders;
import com.gjr.po.OrdersCustom;
import com.gjr.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Created by geng
 * on 2017/1/27.
 */
public class OrdersCustomMapperTest {

    private static final String RESOURCE_FILE = "mybatisConfig.xml";
    private SqlSessionFactory sqlSessionFactory;


    @Before
    public void setUp() throws Exception {
        InputStream in = Resources.getResourceAsStream(RESOURCE_FILE);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
    }

    @Test
    public void queryOrdersUser() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<OrdersCustom> list = sqlSession.getMapper(OrdersCustomMapper.class).queryOrdersUser();
        System.out.println(list);
    }

    @Test
    public void queryOrdersUser1() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Orders> list = sqlSession.getMapper(OrdersCustomMapper.class).queryOrdersUser1();
        System.out.println(list);
    }

    @Test
    public void queryOrdersDetailUser() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Orders> list = sqlSession.getMapper(OrdersCustomMapper.class).queryOrdersDetailUser();
        System.out.println(list);
    }

    @Test
    public void queryOrdersDetailUserItems() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.getMapper(OrdersCustomMapper.class).queryOrdersDetailUserItems();
        System.out.println(list);
    }

    @Test
    public void findOrdersUserLazyLoading() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Orders> list = sqlSession.getMapper(OrdersCustomMapper.class).findOrdersUserLazyLoading();

        // 打断点测试效果
        for (Orders orders : list) {
            User user = orders.getUser();
            System.out.println(user);
        }
    }
}