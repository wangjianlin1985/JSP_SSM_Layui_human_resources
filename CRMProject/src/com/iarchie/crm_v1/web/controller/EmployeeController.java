// 
// 
// 

package com.iarchie.crm_v1.web.controller;

import java.util.List;
import java.util.HashMap;
import com.github.pagehelper.PageHelper;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import com.alibaba.fastjson.JSONObject;
import com.iarchie.crm_v1.domain.Department;
import com.iarchie.crm_v1.domain.Position;
import com.alibaba.fastjson.JSON;
import com.iarchie.crm_v1.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.service.IEmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping({ "/employee" })
public class EmployeeController
{
    @Autowired
    private IEmployeeService employeeService;
    
    @RequestMapping({ "/empView" })
    public String employeeView() {
        return "employee/employee";
    }
    
    @RequestMapping({ "/empAddView" })
    public String employeeAddView() {
        return "employee/employeeAdd";
    }
    
    private Employee jsonData(final String data) {
        final JSONObject json = JSON.parseObject(data);
        if (json != null) {
            final String name = json.getString("name");
            final String sex = json.getString("sex");
            final String phone = json.getString("phone");
            final String email = json.getString("email");
            final String positionId = json.getString("positionId");
            final String eduschool = json.getString("eduschool");
            final String idcard = json.getString("idcard");
            final String deptId = json.getString("deptId");
            final String address = json.getString("address");
            final Position p = new Position();
            p.setId(Long.parseLong(positionId));
            final Department d = new Department();
            d.setId(Long.parseLong(deptId));
            final Employee e = new Employee(name, sex, phone, email, p, eduschool, idcard, d, address);
            return e;
        }
        return null;
    }
    
    @RequestMapping(value = { "/empSave" }, method = { RequestMethod.POST })
    @ResponseBody
    public String employeeSave(@RequestBody final JSONObject ob) {
        final String data = ob.toJSONString();
        final Employee employee = this.jsonData(data);
        if (employee != null) {
            final int insert = this.employeeService.insert(employee);
            if (insert != 0) {
                return "success";
            }
        }
        return "error";
    }
    
    @RequestMapping({ "/empUpdate" })
    @ResponseBody
    public String update(@RequestBody final JSONObject ob) {
        System.out.println("ob.toJSONString() = " + ob.toJSONString());
        final String data = ob.toJSONString();
        final Employee employee = this.jsonData(data);
        if (employee != null) {
            final int index = this.employeeService.updateByPrimaryKey(employee);
            if (index != 0) {
                return "success";
            }
        }
        return "error";
    }
    
    @RequestMapping({ "/empDelete" })
    @ResponseBody
    public String delete(@RequestParam("id") final Long id) {
        if (id != null) {
            final int index = this.employeeService.deleteByPrimaryKey(id);
            if (index == 0 || index == -1) {
                return "error";
            }
        }
        return "success";
    }
    
    @RequestMapping(value = { "/empList" }, method = { RequestMethod.GET })
    @ResponseBody
    public Map<String, Object> empList(@RequestParam("page") int page, @RequestParam("limit") final int limit) {
        final List<Employee> countEmp = this.employeeService.selectAll();
        if (page < 0) {
            page = 1;
        }
        PageHelper.startPage(page, limit);
        final List<Employee> employeeList = this.employeeService.selectAll();
        final Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", countEmp.size());
        map.put("data", employeeList);
        System.out.println("map = " + map);
        return map;
    }
}
