// 
// 
// 

package com.iarchie.crm_v1.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.iarchie.crm_v1.domain.User;

public interface UserMapper
{
    int deleteByPrimaryKey(Long p0);
    
    int insert(User p0);
    
    User selectByPrimaryKey(Long p0);
    
    User selectByLogin(@Param("loginname") String p0, @Param("password") String p1);
    
    List<User> selectAll(@Param("keyword1") String p0, @Param("keyword2") String p1);
    
    int updateByPrimaryKey(User p0);
    
    List<User> selectPageResult(@Param("page") int p0, @Param("pageLimit") int p1);
}
