// 
// 
// 

package com.iarchie.crm_v1.web.controller;

import java.util.HashMap;
import com.github.pagehelper.PageHelper;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import com.iarchie.crm_v1.domain.Department;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.service.IDepartmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping({ "/department" })
public class DepartmentController
{
    @Autowired
    private IDepartmentService departmentService;
    
    @RequestMapping({ "/deptView" })
    public String employeeView() {
        return "department/department";
    }
    
    @RequestMapping({ "/deptAddView" })
    public String departmentAddView() {
        return "department/departmentAdd";
    }
    
    @RequestMapping({ "/deptOption" })
    @ResponseBody
    public List<Department> jsonDeptOption(final String keyword) {
        final List<Department> list = this.departmentService.selectAll(keyword);
        return list;
    }
    
    @RequestMapping(value = { "/deptAdd" }, method = { RequestMethod.POST })
    @ResponseBody
    public String departmentAdd(@RequestBody final Department dept) {
        final int insert = this.departmentService.insert(dept);
        if (insert < 0) {
            return "error";
        }
        return "success";
    }
    
    @RequestMapping(value = { "/deptDelete" }, method = { RequestMethod.GET })
    @ResponseBody
    public String delete(@RequestParam("id") final Long id) {
        if (id != null) {
            final int index = this.departmentService.deleteByPrimaryKey(id);
            if (index == 0 || index == -1) {
                return "error";
            }
        }
        return "success";
    }
    
    @RequestMapping(value = { "/deptList" }, method = { RequestMethod.GET })
    @ResponseBody
    public Map<String, Object> deptList(@RequestParam int page, @RequestParam final int limit, final String keyword) {
        System.out.println("keyword = " + keyword);
        final List<Department> countDept = this.departmentService.selectAll(keyword);
        if (page < 0) {
            page = 1;
        }
        PageHelper.startPage(page, limit);
        final List<Department> listDept = this.departmentService.selectAll(keyword);
        final Map<String, Object> resultMap = new HashMap<String, Object>();
             
        resultMap.put("code", 0);
        resultMap.put("msg", "");
        resultMap.put("count", listDept.size());
        resultMap.put("data", listDept);
           
       
        return resultMap;
    }
}
