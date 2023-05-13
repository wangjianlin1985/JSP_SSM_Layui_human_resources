// 
// 
// 

package com.iarchie.crm_v1.service;

import java.util.List;
import com.iarchie.crm_v1.domain.DocTest;

public interface IDocTestService
{
    int deleteByPrimaryKey(Long p0);
    
    int insert(DocTest p0);
    
    DocTest selectByPrimaryKey(Long p0);
    
    List<DocTest> selectAll();
    
    int updateByPrimaryKey(DocTest p0);
}
