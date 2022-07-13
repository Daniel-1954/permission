package com.tn.permission.dao;

import com.tn.permission.po.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("roleDao")
public interface IRoleDao {
    /**
     * 查询所有的角色信息
     */
    public List<Role> queryRoleAll();

    /**
     * 添加
     */
    void addRole(Role role);

    /**
     * 根据id查询角色信息
     */
    public Role queryRoleById(Integer id);

    /**
     * 修改
     */
    void updateRole(Role role);

    /**
     * 删除
     */
    void deleteRoleById(Integer id);
}
