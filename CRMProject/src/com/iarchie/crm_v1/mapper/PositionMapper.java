// 
// 
// 

package com.iarchie.crm_v1.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.iarchie.crm_v1.domain.Position;

public interface PositionMapper
{
    int deleteByPrimaryKey(Long p0);
    
    int insert(Position p0);
    
    Position selectByPrimaryKey(Long p0);
    
    List<Position> selectAll(@Param("keyword") String p0);
    
    int updateByPrimaryKey(Position p0);
}
