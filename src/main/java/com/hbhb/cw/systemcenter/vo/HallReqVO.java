package com.hbhb.cw.systemcenter.vo;

import java.io.Serializable;

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
public class HallReqVO implements Serializable {
    private static final long serialVersionUID = 5943615101260927298L;

    private Integer id;
    @Schema(description = "所属分公司id")
    private Integer unitId;
    @Schema(description = "营业厅名称")
    private String hallName;
    @Schema(description = "是否启用（0-停用、1-启用）")
    private Integer enable;
}