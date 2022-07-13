package com.tn.permission.controller;

import com.tn.permission.middle.Encrypt;
import com.tn.permission.middle.EncryptDo;
import com.tn.permission.po.Dept;
import com.tn.permission.util.JsonObject;
import com.tn.permission.util.R;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author tn
 * @date 2022/05/31 22:35
 */
@RestController
@ApiOperation("授权管理")
public class EncryptController {
    /**
     * 查询所有的授权信息
     */
    @ApiOperation("查询所有授权")
    @GetMapping("query/queryEncryptAll")
    public JsonObject queryEncryptAll(){
        EncryptDo encryptDo = new EncryptDo();
        Encrypt encrypt = new Encrypt();
        encrypt.setA(encryptDo.getA());
        encrypt.setB(encryptDo.getB());
        encrypt.setC(encryptDo.getC());

        // 创建返回值对象信息
        JsonObject object = new JsonObject();
        object.setCode(0);
        object.setMsg("ok");
        object.setObject(encrypt);
        return object;
    }
}
