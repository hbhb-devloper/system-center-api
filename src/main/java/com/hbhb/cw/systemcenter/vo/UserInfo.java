package com.hbhb.cw.systemcenter.vo;

import java.io.Serializable;

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
public class UserInfo implements Serializable {
    private static final long serialVersionUID = 5027768943457113861L;

    private Integer id;
    @Schema(description = "归属单位id")
    private Integer unitId;
    @Schema(description = "默认归属单位id")
    private Integer defaultUnitId;
    @Schema(description = "登录账号")
    private String userName;
    @Schema(description = "用户姓名")
    private String nickName;
    @Schema(description = "密码")
    private String pwd;
    @Schema(description = "手机号")
    private String phone;
    @Schema(description = "邮箱")
    private String email;
    @Schema(description = "职务")
    private String jobName;
    @Schema(description = "工号")
    private String jobNum;
    @Schema(description = "备注")
    private String remark;
    @Schema(description = "状态（0-停用、1-启用）")
    private Byte state;
}
