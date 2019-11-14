package top.xuxuzhaozhao.service.permission.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.xuxuzhaozhao.dao.permission.IUserDao;
import top.xuxuzhaozhao.domain.permission.User;
import top.xuxuzhaozhao.service.permission.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public User findUser(String username, String password) throws Exception {
        User user = userDao.findUser(username,password);
        if(user == null){
            throw new Exception("账号或者密码错误！");
        }
        if(!user.isIsabled()){
            throw new Exception("此账号已经停用，请联系管理员！");
        }
        if(user.isIsdelete()){
            throw new Exception("此账号已经被删除，请联系管理员！");
        }
        return user;
    }
}
