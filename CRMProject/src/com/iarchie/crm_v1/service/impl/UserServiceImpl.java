// 
// 
// 

package com.iarchie.crm_v1.service.impl;

import com.iarchie.crm_v1.domain.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.iarchie.crm_v1.mapper.UserMapper;
import org.springframework.stereotype.Service;
import com.iarchie.crm_v1.service.IUserService;

@Service
public class UserServiceImpl implements IUserService
{
    @Autowired
    private UserMapper mapper;
    
    @Override
    public List<User> selectAll(final String keyword1, final String keyword2) {
        return this.mapper.selectAll(keyword1, keyword2);
    }
    
    @Override
    public List<User> selectPageResult(final int page, final int pageLimit) {
        return this.mapper.selectPageResult(page, pageLimit);
    }
    
    @Override
    public int insert(final User record) {
        return this.mapper.insert(record);
    }
    
    @Override
    public int deleteByPrimaryKey(final Long id) {
        return this.mapper.deleteByPrimaryKey(id);
    }
    
    @Override
    public User selectByLogin(final String loginname, final String password) {
        return this.mapper.selectByLogin(loginname, password);
    }
    
    @Override
    public int updateByPrimaryKey(final User record) {
        return this.mapper.updateByPrimaryKey(record);
    }
}
