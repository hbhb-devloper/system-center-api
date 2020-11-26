package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.model.User;
import com.hbhb.cw.systemcenter.vo.UserInfo;
import com.hbhb.cw.systemcenter.vo.UserVO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author xiaokang
 * @since 2020-10-06
 */
public interface UserApi {

    @GetMapping("/{userId}")
    UserInfo getUserById(@PathVariable("userId") Integer userId);

    @GetMapping("/info")
    User getUserByName(@RequestParam("userName") String userName);

    @GetMapping("/{userId}/roles")
    List<Integer> getUserRoles(@PathVariable("userId") Integer userId);

    @GetMapping("/{userId}/permissions")
    List<String> getUserPerms(@PathVariable("userId") Integer userId);

    @GetMapping("/list")
    List<UserVO> getUserList(@RequestParam("userIds") List<Integer> userId);
}
