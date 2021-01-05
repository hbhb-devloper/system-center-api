package com.hbhb.cw.systemcenter.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class HallResVO implements Serializable {
    private static final long serialVersionUID = -8724730020166232595L;

    private Integer id;
    @JsonIgnore
    @Schema(description = "所属分公司id")
    private Integer unitId;
    @Schema(description = "所属分公司名称")
    private String unitName;
    @Schema(description = "营业厅名称")
    private String hallName;
    @Schema(description = "是否启用（0-停用、1-启用）")
    private Boolean enable;
    @Schema(description = "创建时间")
    private Date createTime;
    @Schema(description = "创建人")
    private String createBy;
}