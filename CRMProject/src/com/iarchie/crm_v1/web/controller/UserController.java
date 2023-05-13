// 
// 
// 

package com.iarchie.crm_v1.web.controller;

import java.util.List;
import com.github.pagehelper.PageHelper;
import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import com.iarchie.crm_v1.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping({ "/admin" })
public class UserController
{
    @Autowired
    private IUserService userService;
    
    @RequestMapping({ "/userView" })
    public String showUser() {
        return "user/user";
    }
    
    @RequestMapping({ "/addView" })
    public String userAddView() {
        return "user/userAdd";
    }
    
    @RequestMapping(value = { "/userAdd" }, method = { RequestMethod.POST })
    @ResponseBody
    public String userAdd(@RequestBody final User user) {
        final int insert = this.userService.insert(user);
        if (insert < 0) {
            return "error";
        }
        return "success";
    }
    
    @RequestMapping(value = { "/userList" }, method = { RequestMethod.GET })
    @ResponseBody
    public Map<String, Object> showUserList(@RequestParam("page") int page, @RequestParam("limit") final int limit, final String keyword1, final String keyword2) {
        System.out.println("keyword1 = " + keyword1);
        System.out.println("keyword2 = " + keyword2);
        final List<User> countData = this.userService.selectAll(keyword1, keyword2);
        final Map<String, Object> resultMap = new HashMap<String, Object>();
        if (page < 0) {
            page = 1;
            PageHelper.startPage(page, limit);
        }
        final List<User> users = this.userService.selectAll(keyword1, keyword2);
        resultMap.put("code", 0);
        resultMap.put("msg", "");
        resultMap.put("count", countData.size());
        resultMap.put("data", users);
        return resultMap;
    }
    
    @RequestMapping({ "/delete" })
    @ResponseBody
    public String delete(@RequestParam("id") final Long id) {
        System.out.println("id = " + id);
        final int index = this.userService.deleteByPrimaryKey(id);
        if (index > 0) {
            return "success";
        }
        return "error";
    }
    
    @RequestMapping({ "/update" })
    @ResponseBody
    public String update(@RequestBody final User user) {
        if (user != null) {
            final int index = this.userService.updateByPrimaryKey(user);
            if (index > 0) {
                return "success";
            }
        }
        return "error";
    }
}
