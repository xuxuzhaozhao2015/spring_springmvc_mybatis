package top.xuxuzhaozhao.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.xuxuzhaozhao.domain.Account;

import java.util.List;

@Repository
public interface IAccountDao {
    @Select("select * from account")
    List<Account> findAll();

    @Insert("insert into account(name,money) values(#{name},#{money})")
    void saveAccount(Account account);
}
