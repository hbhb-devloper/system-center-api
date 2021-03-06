package com.hbhb.cw.systemcenter.model;

import com.hbhb.cw.systemcenter.vo.CheckBoxVO;
import org.beetl.sql.annotation.entity.AutoID;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
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

    @AutoID
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
    @Schema(description = "创建时间")
    private Date createTime;
    @Schema(description = "创建人")
    private Integer createBy;
    @Schema(description = "更新时间")
    private Date updateTime;
    @Schema(description = "更新人")
    private Integer updateBy;

    @Schema(description = "RS角色-用户所对应的资源角色id")
    private List<Integer> checkedRsRoleIds;
    @Schema(description = "UN角色-用户所对应的单位角色id")
    private List<Integer> checkedUnRoleIds;
    @Schema(description = "UN角色-用户所对应的单位id")
    private List<Integer> checkedUintIds;
}
