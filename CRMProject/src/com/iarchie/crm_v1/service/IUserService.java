// 
// 
// 

package com.iarchie.crm_v1.service;

import com.iarchie.crm_v1.domain.User;
import java.util.List;

public interface IUserService
{
    List<User> selectAll(String p0, String p1);
    
    List<User> selectPageResult(int p0, int p1);
    
    int insert(User p0);
    
    int deleteByPrimaryKey(Long p0);
    
    User selectByLogin(String p0, String p1);
    
    int updateByPrimaryKey(User p0);
}
