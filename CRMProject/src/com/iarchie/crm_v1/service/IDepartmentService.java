// 
// 
// 

package com.iarchie.crm_v1.service;

import java.util.List;
import com.iarchie.crm_v1.domain.Department;

public interface IDepartmentService
{
    int deleteByPrimaryKey(Long p0);
    
    int insert(Department p0);
    
    Department selectByPrimaryKey(Long p0);
    
    List<Department> selectAll(String p0);
    
    int updateByPrimaryKey(Department p0);
}
