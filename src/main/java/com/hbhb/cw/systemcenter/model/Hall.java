package com.hbhb.cw.systemcenter.model;

import org.beetl.sql.annotation.entity.AutoID;

import java.io.Serializable;
import java.util.Date;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dxk
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hall implements Serializable {
    private static final long serialVersionUID = -6525355811431199112L;

    @AutoID
    private Integer id;
    @Schema(description = "所属分公司id")
    private Integer unitId;
    @Schema(description = "营业厅名称")
    private String hallName;
    @Schema(description = "是否启用（0-停用、1-启用）")
    private Integer enable;
    @Schema(description = "创建时间")
    private Date createTime;
    @Schema(description = "创建人")
    private String createBy;
}