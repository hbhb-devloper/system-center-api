package com.hbhb.cw.systemcenter.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dxk
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysUser implements Serializable {
    private static final long serialVersionUID = -5603529394240080938L;

    private Integer id;

    @ApiModelProperty("归属单位id")
    private Integer unitId;
    @ApiModelProperty("默认归属单位id")
    private Integer defaultUnitId;
    @ApiModelProperty("登录账号")
    private String userName;
    @ApiModelProperty("用户姓名")
    private String nickName;
    @ApiModelProperty("密码")
    private String pwd;
    @ApiModelProperty("手机号")
    private String phone;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("职务")
    private String jobName;
    @ApiModelProperty("工号")
    private String jobNum;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("状态（0-停用、1-启用）")
    private Byte state;

    private Date createTime;

    private Integer createBy;

    private Date updateTime;

    private Integer updateBy;

    /**
     * 用户所对应的rs角色id
     */
    @ApiModelProperty("RS角色")
    private List<Integer> checkedRsRoleIds;

    /**
     * 用户所对应的un角色id
     */
    @ApiModelProperty("UN角色")
    private List<Integer> checkedUnRoleIds;
}