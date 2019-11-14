package top.xuxuzhaozhao.dao.permission;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;
import top.xuxuzhaozhao.domain.permission.User;

@Repository("userDao")
public interface IUserDao {
    @Select("SELECT a.*,b.rolename,b.description FROM s_user a " +
            "INNER JOIN s_role b ON a.roleid = b.id " +
            "where a.username=#{username} and a.password=#{password}")

    //这里如果一对多的情况使用了延迟加载，则Jackson在序列化的时候会报错，所以不要用延迟加载
    @Results(id = "userMap", value = {
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "username", property = "username"),
            @Result(column = "password", property = "password"),
            @Result(column = "isabled", property = "isabled"),
            @Result(column = "isdelete", property = "isdelete"),
            @Result(column = "lastlogintime", property = "lastlogintime"),
            @Result(column = "roleid", property = "role", one = @One(
                    select = "top.xuxuzhaozhao.dao.permission.IRoleDao.findRoleById",
                    fetchType = FetchType.EAGER
            ))
    })
    User findUser(@Param("username") String username, @Param("password") String password);
}
