package com.hbhb.cw.systemcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * @author dxk
 */
@Data
public class Unit implements Serializable {
    private static final long serialVersionUID = 7210208777877844759L;

    @AutoID
    private Integer id;
    @Schema(description = "单位名称")
    private String unitName;
    @Schema(description = "上级单位id")
    private Integer parentId;
    @Schema(description = "单位负责人")
    private String unitHeader;
    @Schema(description = "单位级别")
    private String unitGrade;
    @Schema(description = "单位职能")
    private String unitFunc;
    @Schema(description = "单位电话")
    private String officePhone;
    @Schema(description = "传真号")
    private String fax;
    @Schema(description = "通信地址")
    private String address;
    @Schema(description = "邮编")
    private String zipCode;
    @Schema(description = "电子邮箱")
    private String email;
    @Schema(description = "简称标志")
    private String abbr;
    @Schema(description = "单位缩写")
    private String shortName;
    @Schema(description = "创建时间")
    private Date createTime;
    @Schema(description = "更新时间")
    private Date updateTime;
    @Schema(description = "显示顺序")
    private Integer sortNum;
    private List<Unit> children = new ArrayList<>();
}