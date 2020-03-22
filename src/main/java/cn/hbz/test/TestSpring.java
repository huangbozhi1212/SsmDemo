package cn.hbz.test;

import cn.hbz.dao.AccountDao;
import cn.hbz.domain.Account;
import cn.hbz.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestSpring {

    @Test
    public void  run1(){
        //加载配置文件
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService as = (AccountService) ac.getBean("AccountService");
        //调用方法
        as.findAll();
    }
    @Test
    public void  run2() throws IOException {
        //加载配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfing.xml");
       //创建sqlSessionFactory对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //创建sqlSession对象
        SqlSession session = build.openSession();
        //获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        //查询所有数据
        List<Account> all = dao.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
        //关闭资源
        session.close();
        resourceAsStream.close();
    }
    @Test
    public void  run3() throws IOException {
        //加载配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfing.xml");
        //创建sqlSessionFactory对象
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //创建sqlSession对象
        SqlSession session = build.openSession();
        //获取到代理对象
        AccountDao dao = session.getMapper(AccountDao.class);
        //添加数据
        Account account = new Account();
        account.setName("sss");
        account.setMoney((double) 21334);
        dao.saveAccount(account);

        //提交事务
        session.commit();
        //关闭资源
        session.close();
        resourceAsStream.close();
    }
}


























