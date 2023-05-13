// 
// 
// 

package com.iarchie.crm_v1.web.interceptor;

import com.iarchie.crm_v1.context.UserContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class CheckLoginInterceptor extends HandlerInterceptorAdapter
{
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) throws Exception {
        if (UserContext.getCurrentUser() == null) {
            response.sendRedirect("login.jsp");
            System.out.println("CheckLoginInterceptor.preHandle----------------\u672a\u767b\u5165------\u62e6\u622a\u8bf7\u6c42--------------->");
            return false;
        }
        return true;
    }
}
