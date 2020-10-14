package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.SysUser;
import com.hbhb.cw.systemcenter.vo.SysUserInfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * @author xiaokang
 * @since 2020-10-06
 */
public interface SysUserApi {

    @Operation(summary = "根据用户id获取用户的基本信息")
    @GetMapping("/{userId}")
    SysUserInfo getUserById(@Schema(description = "用户id", required = true) @PathVariable Integer userId);

    @Operation(summary = "根据登录名获取用户详情")
    @GetMapping("/info")
    SysUser getUserByName(@Schema(description = "登录名", required = true) @RequestParam String userName);

    @Operation(summary = "获取用户所有角色")
    @GetMapping("/{userId}/roles")
    List<Integer> getUserRoles(@Schema(description = "用户id", required = true) @PathVariable Integer userId);

    @Operation(summary = "获取用户所有权限")
    @GetMapping("/{userId}/permissions")
    List<String> getUserPerms(@Schema(description = "用户id", required = true) @PathVariable Integer userId);
}
