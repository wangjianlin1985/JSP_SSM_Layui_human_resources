// 
// 
// 

package com.iarchie.crm_v1;

import com.iarchie.crm_v1.domain.Department;
import com.iarchie.crm_v1.domain.Position;
import com.iarchie.crm_v1.domain.Employee;
import org.junit.Test;
import java.util.Iterator;
import java.util.List;
import com.iarchie.crm_v1.domain.User;
import com.iarchie.crm_v1.service.IDepartmentService;
import com.iarchie.crm_v1.service.IPositionService;
import com.iarchie.crm_v1.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.service.IUserService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml" })
public class App
{
    @Autowired
    private IUserService service;
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IPositionService positionService;
    @Autowired
    private IDepartmentService departmentService;
    
    @Test
    public void test() {
        final List<User> users = this.service.selectAll("d", null);
        for (final User user : users) {
            System.out.println("user = " + user);
        }
    }
    
    @Test
    public void testPage() {
        final List<User> users = this.service.selectPageResult(1, 5);
        for (final User user : users) {
            System.out.println("user = " + user);
        }
    }
    
    @Test
    public void testEmpList() {
        final List<Employee> employees = this.employeeService.selectAll();
        for (final Employee employee : employees) {
            System.out.println("employee = " + employee.getDeptId().getDeptname());
        }
    }
    
    @Test
    public void testPositionList() {
        final List<Position> positions = this.positionService.selectAll("DBA");
        for (final Position position : positions) {
            System.out.println("position = " + position);
        }
    }
    
    @Test
    public void deptList() {
        final List<Department> list = this.departmentService.selectAll("\u6280\u672f");
        for (final Department department : list) {
            System.out.println("department = " + department);
        }
    }
}
