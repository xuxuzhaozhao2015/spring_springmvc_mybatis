package top.xuxuzhaozhao.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.xuxuzhaozhao.dao.IAccountDao;
import top.xuxuzhaozhao.domain.Account;
import top.xuxuzhaozhao.service.IAccountService;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountTest {
    @Test
    public void TestFindAll() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        IAccountService accountService = (IAccountService) ac.getBean("accountService");
        accountService.findAll();
    }

    @Test
    public void TestFindAllMybatis() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlmapconfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        SqlSession session = factory.openSession();

        IAccountDao accountDao = session.getMapper(IAccountDao.class);

        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        session.close();
        inputStream.close();
    }

    @Test
    public void TestSaveAccount() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlmapconfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        SqlSession session = factory.openSession();
        IAccountDao accountDao = session.getMapper(IAccountDao.class);

        Account account = new Account();
        account.setMoney((double) 250);
        account.setName("yz");
        accountDao.saveAccount(account);

        session.commit();
        session.close();
        inputStream.close();

        TestFindAllMybatis();
    }
}
