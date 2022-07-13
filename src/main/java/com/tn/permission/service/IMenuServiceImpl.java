package com.tn.permission.service;

import com.tn.permission.dao.IMenuDao;
import com.tn.permission.po.Menu;
import com.tn.permission.po.Node;
import com.tn.permission.po.RoleMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("menuService")
public class IMenuServiceImpl implements IMenuService{
    @Autowired
    private IMenuDao menuDao;
    @Override
    public List<Menu> queryMenuAll() {
        return menuDao.queryMenuAll();
    }

    @Override
    public void addMenu(Menu menu) {
        menuDao.addMenu(menu);
    }

    @Override
    public void deleteMenuById(Integer id) {
        menuDao.deleteMenuById(id);
    }

    @Override
    public Menu queryMenuById(Integer id) {
        return menuDao.queryMenuById(id);
    }

    @Override
    public void updateMenuSubmit(Menu menu) {
        menuDao.updateMenuSubmit(menu);
    }

    @Override
    public List<RoleMenu> queryMenuByRoleId(Integer roleId) {
        return menuDao.queryMenuByRoleId(roleId);
    }

    @Override
    public List<Node> queryMenuTree() {
        return menuDao.queryMenuTree();
    }
}
