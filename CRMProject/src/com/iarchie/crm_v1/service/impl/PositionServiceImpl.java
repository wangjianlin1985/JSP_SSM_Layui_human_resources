// 
// 
// 

package com.iarchie.crm_v1.service.impl;

import java.util.List;
import com.iarchie.crm_v1.domain.Position;
import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.mapper.PositionMapper;
import org.springframework.stereotype.Service;
import com.iarchie.crm_v1.service.IPositionService;

@Service
public class PositionServiceImpl implements IPositionService
{
    @Autowired
    private PositionMapper mapper;
    
    @Override
    public int deleteByPrimaryKey(final Long id) {
        if (id != 0L || id != null) {
            final int pid = this.mapper.deleteByPrimaryKey(id);
            return pid;
        }
        return 0;
    }
    
    @Override
    public int insert(final Position record) {
        if (record != null) {
            return this.mapper.insert(record);
        }
        return 0;
    }
    
    @Override
    public Position selectByPrimaryKey(final Long id) {
        return this.mapper.selectByPrimaryKey(id);
    }
    
    @Override
    public List<Position> selectAll(final String keyword) {
        return this.mapper.selectAll(keyword);
    }
    
    @Override
    public int updateByPrimaryKey(final Position record) {
        return this.mapper.updateByPrimaryKey(record);
    }
}
