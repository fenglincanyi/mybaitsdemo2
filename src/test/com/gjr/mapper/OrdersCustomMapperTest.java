package com.gjr.mapper;

import com.gjr.po.OrdersCustom;
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

}