package com.hbhb.cw.systemcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class SysResource implements Serializable {
    private static final long serialVersionUID = -6628686180184947562L;

    @AutoID
    private Integer id;
    @Schema(description = "资源名称")
    private String rsName;
    @Schema(description = "资源类型")
    private String rsType;
    @Schema(description = "父资源id")
    private Integer parentId;
    @Schema(description = "显示顺序")
    private Integer orderNum;
    @Schema(description = "路由地址")
    private String path;
    @Schema(description = "权限地址")
    private String perms;
    @Schema(description = "组件路径")
    private String component;
    @Schema(description = "是否为外链")
    private Byte isFrame;
    @Schema(description = "是否可见")
    private Byte visible;
    @Schema(description = "资源图标")
    private String icon;
    @Schema()
    private String target;
    @Schema(description = "备注")
    private String remark;
    @Schema(description = "创建时间")
    private Date createTime;
    @Schema(description = "创建人")
    private String createBy;
    @Schema(description = "更新时间")
    private Date updateTime;
    @Schema(description = "更新人")
    private String updateBy;
    private List<SysResource> children = new ArrayList<>();
}