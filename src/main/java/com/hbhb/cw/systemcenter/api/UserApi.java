package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.vo.UserInfo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author xiaokang
 * @since 2020-10-06
 */
public interface UserApi {

    @GetMapping("/info-by-id")
    UserInfo getUserInfoById(@RequestParam("userId") Integer userId);

    @GetMapping("/info-by-name")
    UserInfo getUserInfoByName(@RequestParam("userName") String userName);

    @GetMapping("/info-by-id/batch")
    List<UserInfo> getUserInfoBatch(@RequestParam("userIds") List<Integer> userIds);

    @GetMapping("/{userId}/roles")
    List<Integer> getUserRoles(@PathVariable("userId") Integer userId);

    @GetMapping("/{userId}/is-admin")
    Boolean isAdmin(@PathVariable("userId") Integer userId);
}
