package com.tn.permission.controller;

import com.sun.jdi.IntegerType;
import com.tn.permission.po.Menu;
import com.tn.permission.po.Role;
import com.tn.permission.service.IRoleService;
import com.tn.permission.util.JsonObject;
import com.tn.permission.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleController {

    @Autowired
    private IRoleService roleService;

    /**
     * 查询所有的角色信息
     */
    @RequestMapping("role/roleAll")
    @ResponseBody
    public JsonObject queryRoleAll() {
        JsonObject object = new JsonObject();
        List<Role> list = roleService.queryRoleAll();
        object.setCode(200);
        object.setCount((long)list.size());
        object.setData(list);
        object.setMsg("ok");
        return object;
    }

    /**
     * 添加功能实现
     */
    @RequestMapping("role/addRoleSubmit")
    @ResponseBody
    public R addRole(Role role) {
        roleService.addRole(role);
        return R.ok();
    }

    /**
     * 删除功能
     * @param id
     * @return
     */
    @RequestMapping("role/deleteRoleById")
    @ResponseBody
    public R deleteRoleById(Integer id) {
        roleService.deleteRoleById(id);
        return R.ok();
    }

    /**
     * 角色主页跳转
     */
    @RequestMapping("/role")
    public String roleMenu() {
        return "pages/role";
    }

    /**
     * 添加转发页面
     */
    @RequestMapping("/addRole")
    public String addRole(Model model, Integer parentId) {
        model.addAttribute("parentId", parentId);
        return "pages/addRole";
    }

    /**
     * 添加关联权限跳转页面
     * @param model
     * @param id 角色id
     * @return
     */
    @RequestMapping("addPerm")
    public String addPerm(Model model, int id) {
        model.addAttribute("roleid", id);
        return "pages/addPram";
    }
}
