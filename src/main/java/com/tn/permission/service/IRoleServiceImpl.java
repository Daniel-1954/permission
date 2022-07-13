package com.tn.permission.service;

import com.tn.permission.dao.IRoleDao;
import com.tn.permission.po.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("roleService")
public class IRoleServiceImpl implements IRoleService{

    @Autowired
    private IRoleDao roleDao;

    @Override
    public List<Role> queryRoleAll() {
        return roleDao.queryRoleAll();
    }

    @Override
    public void addRole(Role role) {
        roleDao.addRole(role);
    }

    @Override
    public Role queryRoleById(Integer id) {
        return roleDao.queryRoleById(id);
    }

    @Override
    public void updateRole(Role role) {
        roleDao.updateRole(role);
    }

    @Override
    public void deleteRoleById(Integer id) {
        roleDao.deleteRoleById(id);
    }
}
