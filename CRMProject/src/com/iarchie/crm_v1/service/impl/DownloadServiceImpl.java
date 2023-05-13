// 
// 
// 

package com.iarchie.crm_v1.service.impl;

import java.util.List;
import com.iarchie.crm_v1.domain.DownloadDco;
import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.mapper.DownloadDcoMapper;
import org.springframework.stereotype.Service;
import com.iarchie.crm_v1.service.IDownloadService;

@Service
public class DownloadServiceImpl implements IDownloadService
{
    @Autowired
    private DownloadDcoMapper mapper;
    
    @Override
    public int deleteByPrimaryKey(final Long id) {
        return this.mapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public int insert(final DownloadDco record) {
        return this.mapper.insert(record);
    }
    
    @Override
    public DownloadDco selectByPrimaryKey(final Long id) {
        return this.mapper.selectByPrimaryKey(id);
    }
    
    @Override
    public List<DownloadDco> selectAll() {
        return this.mapper.selectAll();
    }
    
    @Override
    public int updateByPrimaryKey(final DownloadDco record) {
        return this.mapper.updateByPrimaryKey(record);
    }
}
