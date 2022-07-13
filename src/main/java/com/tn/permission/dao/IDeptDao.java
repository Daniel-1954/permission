package com.tn.permission.dao;

import com.tn.permission.po.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("deptDao")
public interface IDeptDao {
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
    void deleteDeptById(int id);

}
