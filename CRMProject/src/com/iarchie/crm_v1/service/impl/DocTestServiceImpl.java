// 
// 
// 

package com.iarchie.crm_v1.service.impl;

import java.util.List;
import com.iarchie.crm_v1.domain.DocTest;
import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.mapper.DocTestMapper;
import org.springframework.stereotype.Service;
import com.iarchie.crm_v1.service.IDocTestService;

@Service
public class DocTestServiceImpl implements IDocTestService
{
    @Autowired
    private DocTestMapper mapper;
    
    @Override
    public int deleteByPrimaryKey(final Long id) {
        return this.mapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public int insert(final DocTest record) {
        return this.mapper.insert(record);
    }
    
    @Override
    public DocTest selectByPrimaryKey(final Long id) {
        return this.mapper.selectByPrimaryKey(id);
    }
    
    @Override
    public List<DocTest> selectAll() {
        return this.mapper.selectAll();
    }
    
    @Override
    public int updateByPrimaryKey(final DocTest record) {
        return this.mapper.updateByPrimaryKey(record);
    }
}
