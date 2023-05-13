// 
// 
// 

package com.iarchie.crm_v1.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

public class Employee
{
    private Long id;
    private String name;
    private String sex;
    private String phone;
    private String email;
    private Position positionId;
    private String eduschool;
    private String idcard;
    private Department deptId;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createtime;
    
    public Employee() {
    }
    
    public Employee(final String name, final String sex, final String phone, final String email, final Position positionId, final String eduschool, final String idcard, final Department deptId, final String address) {
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.positionId = positionId;
        this.eduschool = eduschool;
        this.idcard = idcard;
        this.deptId = deptId;
        this.address = address;
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(final Long id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = ((name == null) ? null : name.trim());
    }
    
    public String getSex() {
        return this.sex;
    }
    
    public void setSex(final String sex) {
        this.sex = ((sex == null) ? null : sex.trim());
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(final String phone) {
        this.phone = ((phone == null) ? null : phone.trim());
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(final String email) {
        this.email = ((email == null) ? null : email.trim());
    }
    
    public Position getPositionId() {
        return this.positionId;
    }
    
    public void setPositionId(final Position positionId) {
        this.positionId = positionId;
    }
    
    public Department getDeptId() {
        return this.deptId;
    }
    
    public void setDeptId(final Department deptId) {
        this.deptId = deptId;
    }
    
    public String getEduschool() {
        return this.eduschool;
    }
    
    public void setEduschool(final String eduschool) {
        this.eduschool = ((eduschool == null) ? null : eduschool.trim());
    }
    
    public String getIdcard() {
        return this.idcard;
    }
    
    public void setIdcard(final String idcard) {
        this.idcard = ((idcard == null) ? null : idcard.trim());
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(final String address) {
        this.address = ((address == null) ? null : address.trim());
    }
    
    public Date getCreatetime() {
        return this.createtime;
    }
    
    public void setCreatetime(final Date createtime) {
        this.createtime = createtime;
    }
    
    @Override
    public String toString() {
        return "Employee{id=" + this.id + ", name='" + this.name + '\'' + ", sex='" + this.sex + '\'' + ", phone='" + this.phone + '\'' + ", email='" + this.email + '\'' + ", positionId=" + this.positionId + ", eduschool='" + this.eduschool + '\'' + ", idcard='" + this.idcard + '\'' + ", deptId=" + this.deptId + ", address='" + this.address + '\'' + ", createtime=" + this.createtime + '}';
    }
}
