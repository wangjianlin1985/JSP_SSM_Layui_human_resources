// 
// 
// 

package com.iarchie.crm_v1.web.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import com.iarchie.crm_v1.domain.User;
import com.iarchie.crm_v1.context.UserContext;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import java.io.IOException;
import java.awt.Graphics;
import java.io.OutputStream;
import java.awt.image.RenderedImage;
import javax.imageio.ImageIO;
import java.util.Random;
import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.mapper.UserMapper;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController
{
    @Autowired
    private UserMapper mapper;
    
    @RequestMapping({ "/imageCode" })
    public void imgCode(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
        final BufferedImage bi = new BufferedImage(68, 22, 1);
        final Graphics g = bi.getGraphics();
        final Color c = new Color(200, 150, 255);
        g.setColor(c);
        g.fillRect(0, 0, 68, 22);
        final char[] ch = "0123456789".toCharArray();
        final Random r = new Random();
        final int len = ch.length;
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 4; ++i) {
            final int index = r.nextInt(len);
            g.setColor(new Color(r.nextInt(88), r.nextInt(188), r.nextInt(255)));
            g.drawString(new StringBuilder(String.valueOf(ch[index])).toString(), i * 15 + 3, 18);
            sb.append(ch[index]);
        }
        request.getSession().setAttribute("imgCode", (Object)sb.toString());
        ImageIO.write(bi, "JPG", (OutputStream)response.getOutputStream());
    }
    
    @RequestMapping(value = { "/login" }, method = { RequestMethod.POST, RequestMethod.GET })
    public ModelAndView login(@RequestParam("loginname") final String loginname, @RequestParam("password") final String password, @RequestParam("imgCode") final String imgCode, final HttpSession session, final ModelAndView mv) {
        final User user = this.mapper.selectByLogin(loginname, password);
        final String imgCode2 = (String)session.getAttribute("imgCode");
        System.out.println("user = " + user);
        if (user == null) {
            session.setAttribute("errorMsg", (Object)"\u8d26\u53f7\u5bc6\u7801\u9519\u8bef\uff01\u8bf7\u68c0\u67e5\uff01");
            session.setAttribute("loginname", (Object)loginname);
            mv.setViewName("forward:/login.jsp");
            return mv;
        }
        if (!imgCode.equals(imgCode2)) {
            session.setAttribute("errorMsg", (Object)"\u9a8c\u8bc1\u7801\u9519\u8bef\uff01\u8bf7\u91cd\u65b0\u8f93\u5165\uff01");
            session.setAttribute("loginname", (Object)loginname);
            mv.setViewName("forward:/login.jsp");
            return mv;
        }
        if (user.getState() == 0) {
            session.setAttribute("errorMsg", (Object)(String.valueOf(user.getLoginname()) + "\u7528\u6237\u88ab\u9501\u5b9a\uff01\u8bf7\u8054\u7cfb\u7ba1\u7406\u5458\uff01"));
            session.setAttribute("loginname", (Object)loginname);
            mv.setViewName("forward:/login.jsp");
            return mv;
        }
        UserContext.setUserInSession(user);
        mv.setViewName("redirect:/main");
        return mv;
    }
    
    @RequestMapping({ "/main" })
    public String main() {
        return "main";
    }
    
    @RequestMapping({ "/loginOut" })
    public String invalidate(final HttpSession session) {
        session.invalidate();
        return "redirect:login.jsp";
    }
}
