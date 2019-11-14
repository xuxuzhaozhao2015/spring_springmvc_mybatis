package top.xuxuzhaozhao.service.permission;

import top.xuxuzhaozhao.domain.permission.User;

public interface IUserService {
    User findUser(String username, String password) throws Exception;
}
