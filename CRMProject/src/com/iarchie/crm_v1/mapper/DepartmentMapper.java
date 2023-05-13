// 
// 
// 

package com.iarchie.crm_v1.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.iarchie.crm_v1.domain.Department;

public interface DepartmentMapper
{
    int deleteByPrimaryKey(Long p0);
    
    int insert(Department p0);
    
    Department selectByPrimaryKey(Long p0);
    
    List<Department> selectAll(@Param("keyword") String p0);
    
    int updateByPrimaryKey(Department p0);
}
