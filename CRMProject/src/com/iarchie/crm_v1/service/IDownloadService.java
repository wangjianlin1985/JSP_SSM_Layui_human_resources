// 
// 
// 

package com.iarchie.crm_v1.service;

import java.util.List;
import com.iarchie.crm_v1.domain.DownloadDco;

public interface IDownloadService
{
    int deleteByPrimaryKey(Long p0);
    
    int insert(DownloadDco p0);
    
    DownloadDco selectByPrimaryKey(Long p0);
    
    List<DownloadDco> selectAll();
    
    int updateByPrimaryKey(DownloadDco p0);
}
