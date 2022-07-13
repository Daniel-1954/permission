package com.tn.permission.service;

import com.tn.permission.po.Menu;
import com.tn.permission.po.Node;
import com.tn.permission.po.RoleMenu;

import java.util.List;

public interface IMenuService {
    /**
     * 查询所有的菜单信息
     */
    List<Menu> queryMenuAll();

    /**
     * 添加菜单
     */
    void addMenu(Menu menu);

    /**
     * 删除功能
     */
    void deleteMenuById(Integer id);

    /**
     * 根据id查询菜单详细信息
     */
    Menu queryMenuById(Integer id);

    /**
     * 修改菜单记录信息
     */
    void updateMenuSubmit(Menu menu);

    /**
     * 根据角色查询关联到的菜单
     */
    List<RoleMenu> queryMenuByRoleId(Integer roleId);

    /**
     * 获取树结构的菜单
     */
    List<Node> queryMenuTree();
}
