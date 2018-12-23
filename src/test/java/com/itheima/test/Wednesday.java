package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Wednesday {

    @Test
    public void test() throws IOException {

        ApplicationContext ioc = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        AccountService service = ioc.getBean("accountservice", AccountService.class);

        service.findAll();

        /*InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);

        SqlSession session = factory.openSession();
        AccountDao mapper = session.getMapper(AccountDao.class);

        List<Account> all = mapper.findAll();

        System.out.println(all);*/

    }
}
