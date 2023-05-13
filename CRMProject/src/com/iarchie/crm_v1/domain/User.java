// 
// 
// 

package com.iarchie.crm_v1.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

public class User
{
    private Long id;
    private String loginname;
    private String password;
    private String username;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime;
    private Integer state;
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public String getLoginname() {
        return this.loginname;
    }
    
    public void setLoginname(final String loginname) {
        this.loginname = ((loginname == null) ? null : loginname.trim());
    }
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(final String password) {
        this.password = ((password == null) ? null : password.trim());
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(final String username) {
        this.username = ((username == null) ? null : username.trim());
    }
    
    public Date getCreatetime() {
        return this.createtime;
    }
    
    public void setCreatetime(final Date createtime) {
        this.createtime = createtime;
    }
    
    public Integer getState() {
        return this.state;
    }
    
    public void setState(final Integer state) {
        this.state = state;
    }
    
    @Override
    public String toString() {
        return "User{id=" + this.id + ", loginname='" + this.loginname + '\'' + ", password='" + this.password + '\'' + ", username='" + this.username + '\'' + ", createtime=" + this.createtime + ", state=" + this.state + '}';
    }
}
