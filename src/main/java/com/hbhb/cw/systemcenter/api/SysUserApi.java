package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.SysUser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author xiaokang
 * @since 2020-10-06
 */
public interface SysUserApi {

    @ApiOperation("根据登录名获取用户详情")
    @GetMapping("/info")
    SysUser getUserByName(@ApiParam(value = "登录名", required = true) @RequestParam String userName);

    @ApiOperation("获取用户的所有权限")
    @GetMapping("/{userId}/permissions")
    Set<String> getUserAllPerms(@ApiParam(value = "用户id", required = true) @PathVariable Integer userId);
}
