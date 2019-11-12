package top.xuxuzhaozhao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import top.xuxuzhaozhao.domain.Account;
import top.xuxuzhaozhao.service.IAccountService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping("findall")
    public String TestFindAll(Model model){
        model.addAttribute("list",accountService.findAll());
        return "success";
    }

    @RequestMapping("save")
    public String TestSaveAccount(Model model, Account account){
        accountService.saveAccount(account);
        return "success";
    }

    @RequestMapping("save2")
    public void saveAndList(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findall");
    }
}
