package com.hbhb.cw.systemcenter.vo;

import java.io.Serializable;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaokang
 * @since 2020-10-15
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysUserInfo implements Serializable {
    private static final long serialVersionUID = 5027768943457113861L;

    private Integer id;
    @Schema(description = "登录账号")
    private String userName;
    @Schema(description = "用户姓名")
    private String nickName;
    @Schema(description = "用户权限集合")
    private List<String> perms;
}
