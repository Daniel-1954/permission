package com.tn.permission.controller;

import com.tn.permission.po.Dept;
import com.tn.permission.service.IDeptService;
import com.tn.permission.util.JsonObject;
import com.tn.permission.util.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@ApiOperation("部门管理")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    /**
     * 查询所有的部门信息
     */
    @ApiOperation("查询所有部门")
    @GetMapping("dept/deptAll")
    public JsonObject queryDeptAll(){
        List<Dept> list = deptService.queryDeptAll();

        // 创建返回值对象信息
        JsonObject object = new JsonObject();
        object.setCode(0);
        object.setMsg("ok");
        object.setCount((long) list.size());
        object.setData(list);
        System.out.println(list);
        return object;
    }

    @ApiOperation("添加部门")
    @PostMapping("dept/addDeptSubmit")
    public R addDept(Dept dept) {
        //创建记录时间
        dept.setCreateTime(new Date());
        deptService.addDept(dept);
        return R.ok();
    }

    /**
     * 修改操作
     */
    @ApiOperation("修改部门")
    @PostMapping("dept/updateDeptSubmit")
    public R updateDept(Dept dept) {
        deptService.updateDept(dept);
        return R.ok();
    }

    /**
     * 根据id删除部门信息
     */
    @ApiOperation("删除部门")
    @PostMapping("dept/deleteDeptById")
    public R deleteDeptById(int id) {
        deptService.deleteDeptById(id);
        return R.ok();
    }



    /**
     * 页面的渲染使用
     */
    @GetMapping("/dept")
    public String deptIndex() {
        return "pages/dept";
    }

    @PostMapping("addDept")
    public String addDept(Integer type, Integer parentId, Model model) {
        model.addAttribute("type",type+1);
        model.addAttribute("parentId",parentId);
        return "pages/addDept";
    }
}
