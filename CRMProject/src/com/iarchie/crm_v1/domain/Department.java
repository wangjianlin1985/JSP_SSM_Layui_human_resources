// 
// 
// 

package com.iarchie.crm_v1.domain;

public class Department
{
    private Long id;
    private String deptname;
    private String deptmsg;
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public String getDeptname() {
        return this.deptname;
    }
    
    public void setDeptname(final String deptname) {
        this.deptname = ((deptname == null) ? null : deptname.trim());
    }
    
    public String getDeptmsg() {
        return this.deptmsg;
    }
    
    public void setDeptmsg(final String deptmsg) {
        this.deptmsg = ((deptmsg == null) ? null : deptmsg.trim());
    }
    
    @Override
    public String toString() {
        return "Department{id=" + this.id + ", deptname='" + this.deptname + '\'' + ", deptmsg='" + this.deptmsg + '\'' + '}';
    }
}
