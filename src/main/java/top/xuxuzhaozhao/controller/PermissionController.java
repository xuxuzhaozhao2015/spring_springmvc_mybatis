package top.xuxuzhaozhao.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import top.xuxuzhaozhao.domain.permission.User;
import top.xuxuzhaozhao.service.permission.IUserService;

@Controller
@RequestMapping("api/permission")
public class PermissionController {
    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public @ResponseBody
    User Login(@RequestBody String body) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        User u = mapper.readValue(body, User.class);

        return userService.findUser(u.getUsername(), u.getPassword());
    }
}
