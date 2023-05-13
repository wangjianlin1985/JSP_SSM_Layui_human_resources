// 
// 
// 

package com.iarchie.crm_v1.mapper;

import java.util.List;
import com.iarchie.crm_v1.domain.Employee;

public interface EmployeeMapper
{
    int deleteByPrimaryKey(Long p0);
    
    int insert(Employee p0);
    
    Employee selectByPrimaryKey(Long p0);
    
    List<Employee> selectAll();
    
    int updateByPrimaryKey(Employee p0);
}
