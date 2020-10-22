package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.SysUser;
import com.hbhb.cw.systemcenter.vo.SysUserInfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author xiaokang
 * @since 2020-10-06
 */
public interface SysUserApi {

    @GetMapping("/{userId}")
    SysUserInfo getUserById(@PathVariable("userId") Integer userId);

    @GetMapping("/info")
    SysUser getUserByName(@RequestParam("userName") String userName);

    @GetMapping("/{userId}/roles")
    List<Integer> getUserRoles(@PathVariable("userId") Integer userId);

    @GetMapping("/{userId}/permissions")
    List<String> getUserPerms(@PathVariable("userId") Integer userId);
}
