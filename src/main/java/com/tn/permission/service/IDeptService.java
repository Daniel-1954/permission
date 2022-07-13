package com.tn.permission.service;

import com.tn.permission.po.Dept;

import java.util.List;

public interface IDeptService {
    /**
     * 查询所有的部门信息
     */
    List<Dept> queryDeptAll();

    /**
     * 添加部门信息
     */
    void addDept(Dept dept);

    /**
     * 根据id查询部门信息
     */
    Dept queryDeptById(Integer id);

    /**
     * 修改操作
     */
    void updateDept(Dept dept);

    /**
     * 根据id删除记录信息
     */
    void deleteDeptById(Integer id);
}
