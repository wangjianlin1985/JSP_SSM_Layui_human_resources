// 
// 
// 

package com.iarchie.crm_v1.service.impl;

import java.util.List;
import com.iarchie.crm_v1.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.mapper.EmployeeMapper;
import org.springframework.stereotype.Service;
import com.iarchie.crm_v1.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService
{
    @Autowired
    private EmployeeMapper mapper;
    
    @Override
    public int deleteByPrimaryKey(final Long id) {
        return this.mapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public int insert(final Employee record) {
        if (record != null) {
            return this.mapper.insert(record);
        }
        return 0;
    }
    
    @Override
    public Employee selectByPrimaryKey(final Long id) {
        return this.mapper.selectByPrimaryKey(id);
    }
    
    @Override
    public List<Employee> selectAll() {
        return this.mapper.selectAll();
    }
    
    @Override
    public int updateByPrimaryKey(final Employee record) {
        return this.mapper.updateByPrimaryKey(record);
    }
}
