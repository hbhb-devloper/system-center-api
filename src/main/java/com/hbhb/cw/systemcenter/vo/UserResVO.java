package com.hbhb.cw.systemcenter.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author dxk
 */
@Data
public class UserResVO implements Serializable {
    private static final long serialVersionUID = 2435590882415803810L;

    private Integer id;
    @Schema(description = "单位id")
    @JsonIgnore
    private Integer unitId;
    @Schema(description = "单位名称")
    private String unitName;
    @Schema(description = "登录账户")
    private String userName;
    @Schema(description = "用户昵称")
    private String nickName;
    @Schema(description = "用户手机号")
    private String phone;
    @Schema(description = "职务")
    private String jobName;
    @Schema(description = "状态（0-停用、1-启用）")
    private Byte state;
    @Schema(description = "创建时间")
    private Date createTime;
}