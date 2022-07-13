package com.tn.permission.service;

import com.tn.permission.dao.IDeptDao;
import com.tn.permission.po.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("deptService")
public class IDeptServiceImpl implements IDeptService {

    @Autowired
    private IDeptDao deptDao;

    @Override
    public List<Dept> queryDeptAll() {
        return deptDao.queryDeptAll();
    }

    @Override
    public void addDept(Dept dept) {
        deptDao.addDept(dept);
    }

    @Override
    public Dept queryDeptById(Integer id) {
        return deptDao.queryDeptById(id);
    }

    @Override
    public void updateDept(Dept dept) {
        dept.setCreateTime(new Date());
        deptDao.updateDept(dept);
    }

    @Override
    public void deleteDeptById(Integer id) {
        deptDao.deleteDeptById(id);
    }
}
