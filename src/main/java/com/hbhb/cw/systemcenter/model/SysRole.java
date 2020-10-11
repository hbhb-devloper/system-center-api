package com.hbhb.cw.systemcenter.model;

import com.hbhb.cw.systemcenter.vo.CheckBoxVO;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModel;
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
@ApiModel("角色")
public class SysRole implements Serializable {
    private static final long serialVersionUID = -7604131444946608894L;

    @ApiModelProperty("角色id")
    private Integer id;

    @ApiModelProperty("角色名称")
    private String roleName;

    @ApiModelProperty("角色key")
    private String roleKey;

    @ApiModelProperty("角色类型（RS-关联资源、UN-关联单位）")
    private String roleType;

    @ApiModelProperty("排序编号")
    private Integer sortNum;

    @ApiModelProperty("角色状态（0-删除、1-正常、2-停用）")
    private Byte state;

    @ApiModelProperty("角色id")
    private String remark;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    /**
     * 角色所对应的资源id
     */
    private List<CheckBoxVO> checkedResourceIds;
    /**
     * 角色所对应的单位id
     */
    private List<CheckBoxVO> checkedUnitIds;
}