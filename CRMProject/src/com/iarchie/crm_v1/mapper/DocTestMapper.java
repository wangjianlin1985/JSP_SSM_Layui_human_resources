// 
// 
// 

package com.iarchie.crm_v1.mapper;

import java.util.List;
import com.iarchie.crm_v1.domain.DocTest;

public interface DocTestMapper
{
    int deleteByPrimaryKey(Long p0);
    
    int insert(DocTest p0);
    
    DocTest selectByPrimaryKey(Long p0);
    
    List<DocTest> selectAll();
    
    int updateByPrimaryKey(DocTest p0);
}
