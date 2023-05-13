// 
// 
// 

package com.iarchie.crm_v1.service;

import java.util.List;
import com.iarchie.crm_v1.domain.Position;

public interface IPositionService
{
    int deleteByPrimaryKey(Long p0);
    
    int insert(Position p0);
    
    Position selectByPrimaryKey(Long p0);
    
    List<Position> selectAll(String p0);
    
    int updateByPrimaryKey(Position p0);
}
