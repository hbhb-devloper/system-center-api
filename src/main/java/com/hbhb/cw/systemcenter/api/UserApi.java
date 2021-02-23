package com.hbhb.cw.systemcenter.api;

import com.hbhb.cw.systemcenter.vo.UserInfo;
import com.hbhb.cw.systemcenter.vo.UserPasswordVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.Set;

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

    @GetMapping("/map/id")
    Map<Integer, String> getUserMapById(@RequestParam(value = "userIds", required = false) List<Integer> userIds);

    @GetMapping("/{userId}/roles")
    List<Integer> getUserRoles(@PathVariable("userId") Integer userId);

    @GetMapping("/{userId}/is-admin")
    Boolean isAdmin(@PathVariable("userId") Integer userId);

    @GetMapping("/permission")
    Set<String> getUserPermission(@RequestParam("userId") Integer userId,
                                  @RequestParam("types") List<String> types);

    @GetMapping("/list-by-unitIds")
    Map<Integer, String> getUserByUnitIds(@RequestParam(value = "unitId", required = false) Integer unitId);

    @GetMapping("/map/image")
    Map<Integer, String> getUserSignature(@RequestParam(value = "userIds", required = false) List<Integer> userIds);

    @GetMapping("/user-by-email")
    UserInfo getUserInfoByEmail(@RequestParam("email") String email);

    @PostMapping("/update-pwd-email")
    void updatePwd(@RequestBody UserPasswordVO userPasswordVO);
}
