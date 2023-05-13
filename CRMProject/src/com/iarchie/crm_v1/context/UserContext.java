// 
// 
// 

package com.iarchie.crm_v1.context;

import com.iarchie.crm_v1.domain.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpSession;

public class UserContext
{
    public static final String USER_IN_SESSION = "user_in_session";
    
    private static HttpSession getSession() {
        return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest().getSession();
    }
    
    public static void setUserInSession(final User contextUser) {
        if (contextUser != null) {
            getSession().setAttribute("user_in_session", (Object)contextUser);
        }
        else {
            getSession().invalidate();
        }
    }
    
    public static User getCurrentUser() {
        return (User)getSession().getAttribute("user_in_session");
    }
}
