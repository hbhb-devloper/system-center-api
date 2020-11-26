package com.hbhb.cw.systemcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import java.io.Serializable;
import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class Resource implements Serializable {
    private static final long serialVersionUID = -6628686180184947562L;
    @AutoID
    private Integer id;
    @Schema(description = "资源名称")
    private String name;
    @Schema(description = "资源标志")
    private String perm;
    @Schema(description = "接口uri")
    private String apiPath;
    @Schema(description = "资源描述")
    private String desc;
    @Schema(description = "创建时间")
    private Date createTime;
}