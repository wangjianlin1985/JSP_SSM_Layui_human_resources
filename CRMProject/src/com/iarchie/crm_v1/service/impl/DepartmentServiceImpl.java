// 
// 
// 

package com.iarchie.crm_v1.service.impl;

import java.util.List;
import com.iarchie.crm_v1.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.mapper.DepartmentMapper;
import org.springframework.stereotype.Service;
import com.iarchie.crm_v1.service.IDepartmentService;

@Service
public class DepartmentServiceImpl implements IDepartmentService
{
    @Autowired
    private DepartmentMapper mapper;
    
    @Override
    public int deleteByPrimaryKey(final Long id) {
        return this.mapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public int insert(final Department record) {
        return this.mapper.insert(record);
    }
    
    @Override
    public Department selectByPrimaryKey(final Long id) {
        return this.mapper.selectByPrimaryKey(id);
    }
    
    @Override
    public List<Department> selectAll(final String keyword) {
        return this.mapper.selectAll(keyword);
    }
    
    @Override
    public int updateByPrimaryKey(final Department record) {
        return this.mapper.updateByPrimaryKey(record);
    }
}
