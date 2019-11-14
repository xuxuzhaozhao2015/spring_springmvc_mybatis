package top.xuxuzhaozhao.dao.permission;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import top.xuxuzhaozhao.domain.permission.Role;

@Repository("roleDao")
public interface IRoleDao {
    @Select("select * from s_role where id = #{id}")
    Role findRoleById(int id);
}
